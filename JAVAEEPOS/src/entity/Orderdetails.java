package entity;

public class Orderdetails {
       private String itemid;
       private String oid;
       private int qty;
       private double price;

    public Orderdetails() {
    }

    public Orderdetails(String itemid, String oid, int qty, double price) {
        this.setItemid(itemid);
        this.setOid(oid);
        this.setQty(qty);
        this.setPrice(price);
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
