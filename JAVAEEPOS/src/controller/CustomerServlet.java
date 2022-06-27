package controller;

import dao.CrudDao;
import dao.DAOFactory;
import entity.Customer;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    CrudDao<Customer,String> customerDAO = DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("application/json");

            resp.getWriter().print(customerDAO.getAll());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

         Customer customer = new Customer(req.getParameter("txtCustomerAddId"), req.getParameter("txtCustomerAddName"),req.getParameter("txtCustomerAddAddress"),req.getParameter("txtCustomerAddContact"));
         System.out.println(customer.getId());
         System.out.println(customer.getName());
         System.out.println(customer.getAddress());
         System.out.println(customer.getContact());
         PrintWriter writer = resp.getWriter();
         writer.write("customer added");
         /*try{
            Customer customer = new Customer(req.getParameter("txtCustomerAddId"), req.getParameter("txtCustomerAddName"),req.getParameter("txtCustomerAddAddress"),req.getParameter("txtCustomerAddContact"));
            customerDAO.add(customer);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
  }

 @Override
 protected void doPut(HttpServletRequest req, HttpServletResponse resp){
        try{
            JsonObject customerJson = Json.createReader(req.getReader()).readObject();
            Customer customer = new Customer(customerJson.getString("id"), customerJson.getString("name"),customerJson.getString("address"),customerJson.getString("contact"));

            if (customerDAO.update(customer)) {

            }else {

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 }

   @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp){

        try{
            if (customerDAO.delete(req.getParameter("customerId"))){

            } else {

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
   }
}
