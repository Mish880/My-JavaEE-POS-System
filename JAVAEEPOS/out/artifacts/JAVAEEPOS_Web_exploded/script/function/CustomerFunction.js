const loadAllCustomers = function (resp) {

     $("#cusTable").empty();
     $("#cusTable>tr").off();

     var customer = new Customer();
     var count = 0;

     for (const temp of resp){

         count++;

         customer.setId(temp.id)
         customer.setName(temp.name)
         customer.setAddress(temp.address)
         customer.setContact(temp.contact);

         let row = `<tr><td>${count}</td><td>${customer.getId()}</td><td>${customer.getName()}</td><td>${customer.getAddress()}</td><td>${customer.getContact()}</td></tr>`
         $("#cusTable").append(row);

         $('#cusTable tr').hover(function()
         {
             $(this).find('td').addClass('hover');
         }, function()
         {
             $(this).find('td').removeClass('hover');
         });

         $('.customerDeleteBtn').off();
         $("#cusTable").on('click','customerDeleteBtn',function () {
              DltCustomer($(this).closest("tr"))

         });

        const DltCustomer = function (deleterow) {

            var selected = confirm(`Are you want to delete ${deleterow.find("td:eq(1)").text()} ${deleterow.find("td:eq(2)").text()} Customer ?`);

            if (selected){
                deleteCustomer(deleterow.find("td.eq(1)").text());
                return;
            }

        }

     }
}