function Item() {
     var __itemid;
     var __itemtype;
     var __inStock;
     var __itemPrice;

     this.setItemId = function (itemID) {
          __itemid = itemID;
     }

     this.getItemId = function () {
         return __itemid;
     }

     this.setItemType = function (itemType){
         __itemtype = itemType;
     }

     this.getItemType = function () {
         return __itemtype;
     }

     this.setInStock = function (InStock) {
          __inStock = InStock;
     }

     this.getInStock = function () {
          return __inStock;
     }

     this.setItemPrice = function (ItemPrice) {
          __itemPrice = ItemPrice;
     }

     this.getItemPrice = function () {
          return __itemPrice;

     }
}
