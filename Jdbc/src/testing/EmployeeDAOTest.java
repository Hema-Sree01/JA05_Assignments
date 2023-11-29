package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import dao.EmployeeDAO;

class EmployeeDAOTest {
	static  EmployeeDAO dao1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	EmployeeDAO dao = new EmployeeDAO();

	@Test
	void testInsertEmployee() {
		
	}

	@Test
	void testGetEmployeeById() {
		fail("Not yet implemented");
	}

}
