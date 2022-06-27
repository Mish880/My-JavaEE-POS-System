
/*$("#btnViewCustomer").click(()=>{

   $('.customer').removeClass('black');
     $.ajax({
         url:"customer",
         method:"GET",

         success:function (resp) {
            loadAllCustomers(resp);
         }

     })
});*/

$('#btnSaveCustomer').click(function () {

    $('.customer').removeClass('black');
     var data = $('#customerformid').serialize();
     $.ajax({
         url:"http://localhost:8081/JAVAEEPOS_Web_exploded/customer",
         method:"POST",
         data:data,
         success:function (resp) {
           /*loadAllCustomers(resp)*/
             console.log(resp);
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