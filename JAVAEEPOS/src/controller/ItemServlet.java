package controller;


import dao.CrudDao;
import dao.DAOFactory;
import dto.itemDto;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/item")
public class ItemServlet extends HttpServlet {
     CrudDao<itemDto, String> itemDAO = DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);

     @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp){

          try{
               resp.setContentType("application/json");

               resp.getWriter().print(itemDAO.getAll());
          } catch (IOException e) {
               e.printStackTrace();
          } catch (SQLException throwables) {
               throwables.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }

     @Override
     protected  void doPost(HttpServletRequest req, HttpServletResponse resp){

          try{
               itemDto item = new itemDto(req.getParameter("txtItemAddId"), req.getParameter("txtItemAddtype"),req.getParameter("txtItemAddInStock"),req.getParameter("txtItemAddSalary"));

               if (itemDAO.add(item)) {

               } else {

               }
          } catch (SQLException throwables) {
               throwables.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }

     @Override
     protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException{

          try{
               JsonObject itemJson = Json.createReader(req.getReader()).readObject();
               itemDto item = new itemDto(itemJson.getString("itemid"), itemJson.getString("itemtype"), itemJson.getString("inStock"), itemJson.getString("itemprice"));

               if (itemDAO.update(item)) {

               } else {

               }
          } catch (SQLException throwables) {
               throwables.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }

     @Override
     protected  void doDelete(HttpServletRequest req, HttpServletResponse resp) {
          try{
               if(itemDAO.delete(req.getParameter("itemCode"))) {

               } else {

               }
          } catch (SQLException throwables) {
               throwables.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }
 }

