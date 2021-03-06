package my.ilya.jsf.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import my.ilya.jsf.core.Person;

public class PersonRowMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Person(rs.getString("first_name"), rs.getString("last_name"));
	}
	
}
