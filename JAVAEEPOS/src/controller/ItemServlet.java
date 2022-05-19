package controller;


import dao.CrudDao;
import dao.DAOFactory;
import dto.itemDto;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/item")
public class ItemServlet extends HttpServlet {
     CrudDao<itemDto, String> itemDAO = DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);
}
