function loadAllFromOrders() {
    $.ajax({
        url:"item", method:"GET", success: function (resp) {
            loadAllItemDetails(resp);
        }
    })
}

function loadAllCustomerName() {
    $.ajax({
        url:"customer", method: "GET", success:function (resp) {
             loadAllCustomerDetails(resp);
        }
    })
}

function loadAllOrders() {
    $.ajax({
        url:"PlaceOrder", method:"GET", success: function (resp) {
              getOrderitemnumber(resp)
        }
    })
}

function placeOrder(orderDetails){
    $.ajax({
        url:"Placeorder", method: "POST" , contentType:"application/json", data:JSON.stringify(orderDetails),success: function (resp) {

        }
    })
}