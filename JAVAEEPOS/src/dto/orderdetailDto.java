package dto;

public class orderdetailDto {
    private String oid;
    private String itemid;
    private int qty;
    private double price;

    public orderdetailDto() {
    }

    public orderdetailDto(String oid, String itemid, int qty, double price) {
        this.setOid(oid);
        this.setItemid(itemid);
        this.setQty(qty);
        this.setPrice(price);
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
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
