package connection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.rpc.ServiceException;

import com.danube.scrumworks.api.client.ScrumWorksEndpoint;
import com.danube.scrumworks.api.client.ScrumWorksEndpointBindingStub;
import com.danube.scrumworks.api.client.ScrumWorksServiceLocator;
import com.danube.scrumworks.api.client.types.BacklogItemWSO;
import com.danube.scrumworks.api.client.types.ProductWSO;
import com.danube.scrumworks.api.client.types.ReleaseWSO;
import com.danube.scrumworks.api.client.types.ServerException;
import com.danube.scrumworks.api.client.types.SprintWSO;

/**
 * This class is responsible for holding a
 * connection session with the local
 * ScrumWorks Pro installation over the
 * network.
 * 
 * @author James Manes (JAM38220)
 */
public class ScrumWorksConnection {
	private static final String DEFAULT_URL = "http://localhost:8080/scrumworks";
	private static final String USERNAME = "administrator";
	private static final String PASSWORD = "password";
	private ScrumWorksServiceLocator locator;
	private ScrumWorksEndpoint endpoint;
	private URL url;
	
	public ScrumWorksConnection() {
		try {
			this.url = new URL(DEFAULT_URL);
			this.locator = new ScrumWorksServiceLocator();
			this.endpoint = locator.getScrumWorksEndpointPort(url);
			((ScrumWorksEndpointBindingStub) endpoint).setUsername(USERNAME);
			((ScrumWorksEndpointBindingStub) endpoint).setPassword(PASSWORD);
		} catch(MalformedURLException e) {
			e.printStackTrace();
		} catch(ServiceException e1) {
			e1.printStackTrace();
		}
	}
}