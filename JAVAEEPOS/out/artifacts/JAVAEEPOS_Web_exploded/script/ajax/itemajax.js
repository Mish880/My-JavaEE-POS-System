
$("#btnSaveItem").click(()=>{
    $('.customer').removeClass('black');
    $.ajax({
        url:"item",
        method:"GET",

        success:function (resp) {
            loadAllItems(resp);
        }

    })
});

$('#btnSaveItem').click(function () {
    $('.item').removeClass('black');
    var data = $('#itemformid').serialize();
    $.ajax({
        url:"item",
        method:"POST",
        data:data,
        success:function (resp) {
            loadAllItems(resp);
        }
    });
})

function deleteItem(itemId) {
     $.ajax({
         url:"itemId="+itemId,
         method:"DELETE",
         success:function (resp) {
              $.ajax({
                  url:"item", method:"GET",
                  success:function (resp) {
                      loadAllItems(resp);

                  }
              });
         }

     })
}
