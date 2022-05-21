const loadAllCustomers = function (resp) {

     $("#cusTable").empty();
     $("#cusTable>tr").off();

     var customer = new Customer();
     var count = 0;

    for (const temp of resp) {
        count++;

        customer.setId(temp.id)
        customer.setName(temp.name)
        customer.setAddress(temp.address)
        customer.setContact(temp.contact);
        let row = `<tr><td>${count}</td><td>${customer.getId()}</td><td></td><td>${customer.getName()}</td><td>${customer.getAddress()}</td><td>${customer.getContact()}</td></tr>`
        $("#cusTable").append(row);

    }
}