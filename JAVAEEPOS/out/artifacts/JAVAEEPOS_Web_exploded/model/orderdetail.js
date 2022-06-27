
class orderdetail{
     constructor(itemcode,orderId,qty,price) {
           this.Ditemid = itemcode;
           this.DorderId = orderId;
           this.Dqty = qty;
           this.Dprice = price;
     }

      setItemid  = function (itemcode) {
         this.Ditemid = itemcode;
      }

      getItemid = function () {
         return this.Ditemid;
      }

      setorderid = function (orderId) {
        this.DorderId = orderId;
      }

      getorderid = function () {
         return this.DorderId;
      }

      setqty =  function (qty) {
        this.Dqty = qty;
      }

      getqty = function () {
         return this.Dqty;
      }

       setprice = function (price) {
         this.Dprice = price;
       }

       getprice = function () {
          return this.Dprice;
       }
}