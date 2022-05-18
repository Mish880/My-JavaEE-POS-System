package dao;

import dao.CustomDaoImpl.CustomerDaoImpl;
import dao.CustomDaoImpl.ItemDaoImpl;

public class DAOFactory {
      private static DAOFactory daoFactory;

      private DAOFactory(){

      }

      public static DAOFactory getDaoFactory() {return daoFactory==null? daoFactory = new DAOFactory() : daoFactory;}
      public enum DAOTypes{
          ITEM,CUSTOMER,ORDER
      }

      public CrudDao getDAO (DAOTypes types){
            switch (types){
                case ITEM:
                     return new ItemDaoImpl();
                case CUSTOMER:
                     return  new CustomerDaoImpl();
                default:
                    return null;

            }
      }
}
