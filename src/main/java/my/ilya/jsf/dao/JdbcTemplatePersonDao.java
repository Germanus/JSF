package my.ilya.jsf.dao;

import java.util.List;

import my.ilya.jsf.core.Person;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcTemplatePersonDao extends JdbcDaoSupport{

	public List<Person> findByLastname(String lastname){
		String sql = "select * from employee where last_name = ?";
		String[] args = new String[] {lastname};
		RowMapper<Person> mapper = new PersonRowMapper();
		return getJdbcTemplate().query(sql, args, mapper);
	}
	
}
