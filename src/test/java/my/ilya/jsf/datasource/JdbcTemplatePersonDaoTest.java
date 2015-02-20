package my.ilya.jsf.datasource;

import java.util.ArrayList;
import java.util.List;

import my.ilya.jsf.core.Person;
import my.ilya.jsf.dao.JdbcTemplatePersonDao;
import my.ilya.jsf.dao.PersonRowMapper;

import org.junit.Test;
import org.junit.Assert.*;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

public class JdbcTemplatePersonDaoTest {
	
	@Test
	public void testFindByLastname() throws Exception {
		
		final String lastName = "Smith";
		final List<Person> smiths = createListOfPeopleNamed(lastName);
		JdbcTemplate template = createMock(JdbcTemplate.class);
		template.query(eq("select * from employee where last_name = ?"), aryEq(new Object[]{lastName}), isA(PersonRowMapper.class));
		expectLastCall().andReturn(smiths);
		replay(template);
		JdbcTemplatePersonDao dao = new JdbcTemplatePersonDao();
		
		dao.setJdbcTemplate(template);
		assertEquals(smiths, dao.findByLastname(lastName));
		
		verify(template);
	}

	private List<Person> createListOfPeopleNamed(String lastName) {
		List<Person> expectedList = new ArrayList<Person>();
		expectedList.add(new Person("Alice", lastName));
		expectedList.add(new Person("Billy", lastName));
		expectedList.add(new Person("Clark", lastName));
		return expectedList;
	}
	
}
