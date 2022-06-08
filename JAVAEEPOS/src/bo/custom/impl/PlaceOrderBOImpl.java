package bo.custom.impl;

import bo.custom.PlaceOrderBO;
import db.DB;
import dto.itemDto;
import dto.orderDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlaceOrderBOImpl implements PlaceOrderBO {
    Connection connection = null;
    PreparedStatement pst = null;



    @Override
    public boolean addOrder(orderDto order) throws SQLException {
        try{
            connection = DB.db().getConnection();
            connection.setAutoCommit(false);
            pst = connection.prepareStatement("INSERT INTO `order` VALUES (?,?,?,?,?)");
            pst.setString(1,order.getOrderId());
            pst.setString(2,order.getOrdercusId());
            pst.setString(3,order.getOrderdate());
            pst.setString(4,order.getOrdertime());
            pst.setDouble(5,order.getOrdercost());

          if (pst.executeUpdate() > 0 ) {                                /*This is a transaction part*/
              if (addOrderDetail(order)) {
                  connection.commit();
                  connection.setAutoCommit(true);
                  return true;
              } else {
                  connection.rollback();
                  connection.setAutoCommit(true);
                  return false;
              }
          } else {
              connection.rollback();
              connection.setAutoCommit(true);
              return false;
          }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            connection.setAutoCommit(true);
        }
       return false;
    }

    @Override
    public boolean addOrderDetail(orderDto order) {
        return false;
    }

    @Override
    public boolean updateItemQty(String itemid, int orderqty) {
        try {
            pst = connection.prepareStatement("SELECT * FROM  `item` WHERE `itemid`=?");
            pst.setString(1,itemid);
            ResultSet rst = pst.executeQuery();
            itemDto item = null;
            if(rst.next()) {
                 item = new itemDto(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4));
            }

            pst = connection.prepareStatement("UPDATE `item` SET `InStock`=? WHERE `ItemId`=?");



            pst.setString(2,itemid);

             return pst.executeUpdate() > 0;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
