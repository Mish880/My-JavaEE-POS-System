package bo.custom;

import dto.orderDto;

import java.sql.SQLException;

public interface PlaceOrderBO {
    boolean addOrder(orderDto order) throws SQLException;
    boolean addOrderDetail(orderDto order);
    boolean updateItemQty(String itemid, int orderqty);
}
