package test;



import java.util.logging.Logger;



public class JunitSpringBeanLocator {

	public static final String LOGGER_PREFIX = "starissrv";
	public static Logger log = Logger.getLogger(LOGGER_PREFIX);

	public static Object getBean(String beanName) throws Exception{
		String method = "getBean";
		Object obj = null;
		try{
			
			obj = JunitLoadStartupService.getBean(beanName);
			if(obj == null)
				throw new Exception("obj " + beanName + " is null");
		}
		catch(Exception e){
			
		}
		return obj;

	}
}
