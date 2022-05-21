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
    }
}