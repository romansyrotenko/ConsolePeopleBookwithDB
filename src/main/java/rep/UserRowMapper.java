package rep;

import Person;
import Storage;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRowMapper implements ResultSetHandler<Storage> {

    @Override
    public Storage handle(ResultSet resultSet) throws SQLException {

        Storage list = new Storage();

        while(resultSet.next()) {
            Person tempPerson = new Person();
            tempPerson.setName(resultSet.getString("name"));
            tempPerson.setAge(resultSet.getInt("age"));
            tempPerson.setEmail(resultSet.getNString("email"));
            list.add(tempPerson);
        }

        return list;
    }
}
