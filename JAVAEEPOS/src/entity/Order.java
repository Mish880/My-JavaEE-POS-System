package entity;

public class Order {
      private String oid;
      private String cusid;
      private String date;
      private String time;
      private double cost;

    public Order() {
    }

    public Order(String oid, String cusid, String date, String time, double cost) {
        this.setOid(oid);
        this.setCusid(cusid);
        this.setDate(date);
        this.setTime(time);
        this.setCost(cost);
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getCusid() {
        return cusid;
    }

    public void setCusid(String cusid) {
        this.cusid = cusid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
