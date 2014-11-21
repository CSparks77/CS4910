package connection;

import java.net.MalformedURLException;

import com.danube.scrumworks.api2.ScrumWorksService;
import com.danube.scrumworks.api2.client.ScrumWorksAPIService;

/**
 * <p>This class is responsible for holding a
 * connection session with the local
 * ScrumWorks Pro installation over the
 * network.</p>
 * 
 * @author James Manes (JAM38220@ucmo.edu)
 * @author James Sparks (JCS67070@ucmo.edu)
 * @author Brandt Sanders (BDS01970@ucmo.edu)
 */
public class ScrumWorksConnection {
	private static final String scrumWorksURL 
		= "http://localhost:8080/scrumworks-api/api2/scrumworks?wsdl";
	private static final String username = "administrator";
	private static final String password = "password";
	
	public ScrumWorksConnection() {
		try {
			ScrumWorksAPIService apiService = ScrumWorksService.getConnection(
					scrumWorksURL, username, password);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}