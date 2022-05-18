package dao.CustomDaoImpl;

import dao.CrudDao;
import dao.CrudUtil;
import entity.Item;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemDaoImpl implements CrudDao<Item, String> {

    @Override
    public JsonArray getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item");
        Item item;
        JsonArrayBuilder itemArray = Json.createArrayBuilder();
        JsonObjectBuilder itemJSON = Json.createObjectBuilder();
        while(rst.next()) {
            item = new Item(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4));
            itemJSON.add("Itemid", item.getItemid());
            itemJSON.add("Itemtype",item.getItemtype());
            itemJSON.add("Instock",item.getInstock());
            itemJSON.add("Itemsalary",item.getItemprice());
        }
        return itemArray.build();
    }

    @Override
    public boolean add(Item item) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES (?,?,?,?)",item.getItemid(),item.getItemtype(),item.getInstock(),item.getItemprice());
    }

    @Override
    public boolean update(Item item) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("UPDATE item SET `Itemtype`=?,`Instock`=?, `Itemsalary`=? WHERE itemid=?",item.getItemtype(),item.getInstock(),item.getItemprice(),item.getItemid());
    }

    @Override
    public boolean delete(String itemid) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE Itemid=?",itemid);
    }
}
