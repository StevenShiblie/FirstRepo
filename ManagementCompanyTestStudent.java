import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {
	private ManagementCompany mgmt;
	private Property p1;

	@BeforeEach
	public void setUp() throws Exception {
		mgmt= new ManagementCompany("Yama", "777777", 7);
	}

	@AfterEach
	public void tearDown() throws Exception {
		mgmt=null;
	}

	@Test
	public void testAddProperty() {
		p1 = new Property ("April", "Duca", 2613, "Kawa",2,5,2,2);		 
		assertEquals(mgmt.addProperty(p1),0,0);	//property has been successfully added to index 0
	}
	
	@Test
	public void testGetPropertiesCount() {
		p1 = new Property ("April", "Duca", 2613, "Kawa",2,5,2,2);		 
		assertEquals(mgmt.addProperty(p1),0,0);	
		assertEquals(mgmt.getPropertiesCount(), 1);
	}

	@Test
	public void testToString() {
		p1 = new Property ("April", "Duca", 2613.0, "Kawa",2,5,2,2);
		assertEquals(mgmt.addProperty(p1), 0);	//property has been successfully added to index 0
		String expectedString = "List of the properties for Yama, taxID: 777777\n"
				+ "______________________________________________________\n"
				+ "April,Duca,Kawa,2613.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ "Total management Fee: 182.91";
		System.out.println(expectedString);
		System.out.println(mgmt.toString());
		assertEquals(expectedString, mgmt.toString());
				
	}

}
