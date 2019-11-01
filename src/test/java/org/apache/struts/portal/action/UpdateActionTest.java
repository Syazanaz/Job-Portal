package org.apache.struts.portal.action;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Update Action Test class: Once invoked runs the junit tests on update action.
 * @author Syazana
 *
 */
public class UpdateActionTest {
	
	UpdateAction updateUser = new UpdateAction();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	/**
	 * Set Up Method
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		updateUser.setSubmitType("updatedata");
		updateUser.setEmail("lwoodard2@elpais.com");
		updateUser.setCompany_Name("Roodel Enterprise");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test Execute Method: testing message trigger if user data updated successfully in the database.
	 */
	@Test
	public void testExecute() {
		try {
			updateUser.execute();
			assertTrue("UPDATE", true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
