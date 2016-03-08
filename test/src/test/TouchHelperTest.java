package test;


import it.studiofontanelli.jabistudio.helper.TouchHelper;
import test.JunitSpringBeanLocator;


public class TouchHelperTest extends CommonTestCase {

	
	@Override
	public String getApplicationContext() {
		return "test/config/applicationContextTest.xml";

	}
	
	private TouchHelper getService() throws Exception {
		return (TouchHelper) JunitSpringBeanLocator.getBean("touchHelper");
	}

	

	public void testTouch() throws Exception {
		String method = "testTouch";
		
		try {			
			
			
			getService().touch();
			
		}catch (Exception e) {
			
		}	
		finally{
			
		}
	}

	
	public void testInsertDock() throws Exception {
		String method = "testInsertDock";
		
		try {			
			
			
			getService().insertDock();
			
		}catch (Exception e) {
			
		}	
		finally{
			
		}
	}
	

}
