
$("#btnViewCustomer").click(()=>{
     $('.customer').removeClass('black');
     $.ajax({
         url:"customer",
         method:"GET",

         success:function (resp) {
            loadAllCustomers(resp);
         }

     })
});

$('#btnSaveCustomer').click(function () {
     $('.customer').removeClass('black');
     var data = $('#customerformid').serialize();
     $.ajax({
         url:"customer",
         method:"POST",
         data:data,
         success:function (resp) {
           loadAllCustomers(resp)
         }
     })
});

function deleteCustomer(cusId) {
    $.ajax({url:"customer? cusId="+cusId, method:"DELETE",
      success:function (resp) {
         $.ajax({url:"customer", method:"GET",
           success: function (resp) {
              loadAllCustomers(resp)

           }
         })

      }
    })

}