package my.ilya.jsf.datasource;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.mockobjects.sql.MockSingleRowResultSet;

import my.ilya.jsf.core.Person;
import my.ilya.jsf.dao.PersonRowMapper;

public class PersonRowMapperTest {
	
	@Test
	public void testMappingRow() throws Exception {
		Person expected = new Person("John", "Doe");
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("first_name", expected.getFirstname());
		data.put("last_name", expected.getLastname());
		
		MockSingleRowResultSet rs = new MockSingleRowResultSet();
		rs.addExpectedNamedValues(data);
		
		assertEquals(expected, new PersonRowMapper().mapRow(rs, 1));
	}

}
