package test;


import java.util.logging.Logger;

import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.access.ContextBeanFactoryReference;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JunitLoadStartupService implements LoadStartupServiceMBean {


	public static final String LOGGER_PREFIX = "starissrv";
	public static Logger log = Logger.getLogger(LOGGER_PREFIX);
	
	
	private String applicationContext;

	/** Spring BeanFactory that provides the namespace for this EJB 
	 * @generated
	 */
	private static BeanFactoryReference beanFactoryReference;

	/**
	 * @generated
	 */
	private String message = "problems....";

	/**
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @generated
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @generated
	 */
	public void printMessage() {
		System.out.println(message);
	}
	
	
	public JunitLoadStartupService (String applicationContext){
		this.applicationContext = "classpath:" + applicationContext;
	}

	/**
	 * @generated
	 */
	public void start() throws Exception {

		System.out.println("Messaggio di avvio MBEAN=" + message);
		try {
			
			//ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext(new String[] { "classpath:/test/starissrv/applicationTestContext.xml" });
			//applicationContext
			ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext(new String[] { applicationContext });
			
			beanFactoryReference = new ContextBeanFactoryReference(ctx);


		} catch (Exception e) {
			System.out.println("Error loading spring env: " + e);
		}

		System.out.println("Chiamata da MBEAN eseguita!!!!");


	}

	/**
	 * @generated
	 */
	public static Object getBean(String beanName) {

		String method = "getBean";
		


		Object beanObject = null;

		try {

			beanObject = beanFactoryReference.getFactory().getBean(beanName);
			
			

		} catch (Exception e) {
			System.out.println("Attenzione si è verificata un'eccezione: " + e);
		}
		
		return beanObject;
	}

	/**
	 * @generated
	 */
	public void stop() {
		System.out.println("Messaggio di stop MBEAN=" + message);
	}
}
