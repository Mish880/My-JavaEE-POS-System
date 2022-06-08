package controller;

import bo.BOFactory;
import bo.custom.PlaceOrderBO;
import dao.CrudDao;
import dao.DAOFactory;
import dto.orderDto;
import entity.Order;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/PlaceOrder")
public class PlaceOrderServlet extends HttpServlet {
CrudDao<Order,String> placeOrderDAO = DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ORDER);
PlaceOrderBO placeOrderController = BOFactory.getBoFactory().getBo(BOFactory.BOTypes.ORDER);

@Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) {
      resp.setContentType("application/json");
      try{
          placeOrderDAO.getAll();
      } catch (SQLException throwables) {
          throwables.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
}

@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    JsonObject orderJSON = Json.createReader(req.getReader()).readObject();
    orderDto order = new orderDto(orderJSON.getString("orderid"),orderJSON.getString("ordercusId"),orderJSON.getString("orderdate"),orderJSON.getString("ordertime"),Double.parseDouble(orderJSON.getString("ordercost")));

     try{
         if (placeOrderController.addOrder(order)) {

         }else {

         }
     } catch (SQLException throwables) {
         throwables.printStackTrace();
     }
}
}

