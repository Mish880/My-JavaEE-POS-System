package entity;

public class Item {
       private String itemid;
       private String itemtype;
       private String instock;
       private String itemprice;

    public Item() {
    }

    public Item(String itemid, String itemtype, String instock, String itemprice) {
        this.setItemid(itemid);
        this.setItemtype(itemtype);
        this.setInstock(instock);
        this.setItemprice(itemprice);
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public String getInstock() {
        return instock;
    }

    public void setInstock(String instock) {
        this.instock = instock;
    }

    public String getItemprice() {
        return itemprice;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }
}
