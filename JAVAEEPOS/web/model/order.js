class Orderajax {
    constructor(orderId,ordercusId,orderDate,time,cost) {
        this.orderId = orderId;
        this.ordercustomerId = ordercusId;
        this.orderDate = orderDate;
        this.otime = time;
        this.ocost = cost;
    }

    setOrderId = function(orderId) {
        this.orderId = orderId;
    }

    getOrderId = function () {
        return this.orderId;
    }

    setOrderCustomerId = function(ordercusId){
        this.ordercustomerId = ordercusId;
    }

    getOrderCustomerId = function () {
        return this.ordercustomerId;
    }

    setorderdate = function (orderDate) {
        this.orderDate = orderDate;
    }

    getorderdate = function () {
        return this.orderDate;
    }

    setordertime = function (time) {
        this.otime = time;
    }

    getordertime = function () {
        return this.otime;
    }

    setordercost = function (cost) {
        this.ocost = cost;
    }

    getordercost = function () {
        return this.ocost;
    }

}