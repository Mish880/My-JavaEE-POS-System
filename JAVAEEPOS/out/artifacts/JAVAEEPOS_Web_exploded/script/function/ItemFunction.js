const loadAllItems = function (resp) {

    $("#itemTable").empty();
    $("#itemTable>tr").off();

    var item = new Item();
    var count = 1;

    for (const temp of resp) {
      item.setItemId(temp.itemid);
      item.setItemType(temp.itemtype);
      item.setInStock(temp.InStock);
      item.setItemPrice(temp.ItemSalary);


      let row = `<tr><td>${count++}</td><td>${item.getItemId()}</td><td>${item.getItemType()}</td><td>${item.getInStock()}</td><td>${item.getItemPrice()}</td></tr>`

      $('#itemTable').append(row);
        $('.DeleteitemsBtn').hover(function () {
            $(this).addClass('iconDelete');
        },function () {
            $(this).removeClass('iconDelete');
        });
      $("#itemTable").on('click','.DeleteitemsBtn',function () {
           Dltitem($(this).closest('tr'))
       });
    }

    const Dltitem = function (deleteitem) {
        var selected = confirm(`Are you want to delete ${deleteitem.find("td:eq(1)").text()} ${deleteitem.find("td:eq(2)").text()} Item ?`);

      if (selected){
          deleteItem(deleteitem.find("td.eq(1)").text())
          return;
      }
    }
}