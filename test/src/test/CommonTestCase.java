package test;

import java.util.logging.Logger;

import junit.framework.TestCase;

import org.springframework.util.Log4jConfigurer;

public abstract class CommonTestCase extends TestCase {

	
	public static final String LOGGER_PREFIX = "stasrv";
	public static Logger log = Logger.getLogger(LOGGER_PREFIX);
	
	public abstract String getApplicationContext();
	
	public void setUp() throws Exception {
		try {
			
			Log4jConfigurer.initLogging( "classpath:log4j.properties" );
			JunitLoadStartupService springService = new JunitLoadStartupService(getApplicationContext());
			springService.start();
			System.out.println("Contesto Spring inizializzato correttamente " + getApplicationContext());
			
		} catch (Exception e) {
			System.out.println("Si e' verificato un errore: " + e);
			
		}
	}
}
