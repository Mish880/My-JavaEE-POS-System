package dao.CustomDaoImpl;

import dao.CrudDao;
import dao.CrudUtil;
import entity.Customer;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CrudDao <Customer,String> {

    @Override
    public JsonArray getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer");
        Customer customer = null;
        JsonArrayBuilder customerArray = Json.createArrayBuilder();
        JsonObjectBuilder customerJSON = Json.createObjectBuilder();

        while(rst.next()) {
            customer = new Customer(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4));
            customerJSON.add("id", customer.getId());
            customerJSON.add("name",customer.getName());
            customerJSON.add("address",customer.getAddress());
            customerJSON.add("contact",customer.getContact());
            customerArray.add(customerJSON.build());

        }
         return customerArray.build();
    }

    @Override
    public boolean add(Customer customer) throws SQLException, ClassNotFoundException {

        return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?)",customer.getId(),customer.getName(),customer.getAddress(),customer.getAddress());
    }

    @Override
    public boolean update(Customer customer) throws SQLException, ClassNotFoundException {

        return CrudUtil.executeUpdate("UPDATE customer SET name=?,address=?,contact=? WHERE id=?", customer.getName() , customer.getAddress() , customer.getContact() , customer.getId());
    }

    @Override
    public boolean delete(String customerID) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE id=?",customerID);
    }
}
