package dto;

public class itemDto {
       private String itemid;
       private String itemtype;
       private String inStock;
       private String itemprice;

    public itemDto() {
    }

    public itemDto(String itemid, String itemtype, String inStock, String itemprice) {
        this.setItemid(itemid);
        this.setItemtype(itemtype);
        this.setInStock(inStock);
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

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public String getItemprice() {
        return itemprice;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }
}
