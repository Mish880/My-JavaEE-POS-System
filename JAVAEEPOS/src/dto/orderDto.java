package dto;

import javax.json.JsonArray;

public class orderDto {
    private String orderId;
    private String ordercusId;
    private String orderdate;
    private String ordertime;
    private double ordercost;
    private JsonArray orderItems;

    public orderDto() {
    }

    public orderDto(String orderId, String ordercusId, String orderdate, String ordertime, double ordercost, JsonArray orderItems) {
        this.setOrderId(orderId);
        this.setOrdercusId(ordercusId);
        this.setOrderdate(orderdate);
        this.setOrdertime(ordertime);
        this.setOrdercost(ordercost);
        this.setOrderItems(orderItems);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrdercusId() {
        return ordercusId;
    }

    public void setOrdercusId(String ordercusId) {
        this.ordercusId = ordercusId;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }

    public double getOrdercost() {
        return ordercost;
    }

    public void setOrdercost(double ordercost) {
        this.ordercost = ordercost;
    }

    public JsonArray getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(JsonArray orderItems) {
        this.orderItems = orderItems;
    }
}