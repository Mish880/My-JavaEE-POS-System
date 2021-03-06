package dao;

import javax.json.JsonArray;
import java.sql.SQLException;

public interface CrudDao <T,ID> {
     JsonArray getAll() throws SQLException,ClassNotFoundException;
     boolean add(T t) throws SQLException,ClassNotFoundException;
     boolean update(T t) throws SQLException,ClassNotFoundException;
     boolean delete(ID id) throws SQLException,ClassNotFoundException;
}
