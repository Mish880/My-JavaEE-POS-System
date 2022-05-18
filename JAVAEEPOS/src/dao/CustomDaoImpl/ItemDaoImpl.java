package dao.CustomDaoImpl;

import dao.CrudDao;
import entity.Item;

import javax.json.JsonArray;
import java.sql.SQLException;

public class ItemDaoImpl implements CrudDao<Item, String> {

    @Override
    public JsonArray getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean add(Item item) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(Item item) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }
}
