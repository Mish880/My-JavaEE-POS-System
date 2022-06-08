package dao.CustomDaoImpl;

import dao.CrudDao;
import dao.CrudUtil;
import entity.Order;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlaceOrderDaoImpl implements CrudDao<Order,String> {
    @Override
    public JsonArray getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM `order`");
        JsonArrayBuilder orderArray = Json.createArrayBuilder();
        JsonObjectBuilder orderJSON = Json.createObjectBuilder();
        while (rst.next()) {
            Order order = new Order(rst.getString(1),rst.getString(2),rst.getNString(3),rst.getString(4),rst.getDouble(5));
            orderJSON.add("orderId",order.getOid());
            orderJSON.add("ordercustomerId", order.getCusid());
            orderJSON.add("orderDate", order.getDate());
            orderJSON.add("orderTime",order.getTime());
            orderJSON.add("ordercost",order.getCost());
            orderArray.add(orderJSON.build());
        }
        return orderArray.build();
    }

    @Override
    public boolean add(Order order) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(Order order) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }
}
