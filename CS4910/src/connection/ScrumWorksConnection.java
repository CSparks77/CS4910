package connection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
	private ProductWSO portalProduct;
	private ProductWSO product;
	private URL url;
	
	public ScrumWorksConnection() {
		try {
			this.url = new URL(DEFAULT_URL);
			this.locator = new ScrumWorksServiceLocator();
			this.endpoint = locator.getScrumWorksEndpointPort(url);
			((ScrumWorksEndpointBindingStub) endpoint).setUsername(USERNAME);
			((ScrumWorksEndpointBindingStub) endpoint).setPassword(PASSWORD);
			
			//final WfmProduct wfmProduct = getWfmProduct();
		} catch(MalformedURLException e) {
			e.printStackTrace();
		} catch(ServiceException e1) {
			e1.printStackTrace();
		}
	}
	
	public ProductWSO getProductWSO() {
		return this.product;
	}
	
	public ProductWSO getPortalProductWSO() {
		return this.portalProduct;
	}
	
	
	/* TODO Taken from the example code.... Needs re-wrote basically. Will do soon -JM
	private WfmProduct getWfmProduct() {
		ArrayList<ReleaseWSO> releases = new ArrayList<ReleaseWSO>(
			Arrays.asList(this.endpoint.getReleases(this.product))
		);
		ArrayList<WfmRelease> wfmReleases = new ArrayList<WfmRelease>();
		Iterator<ReleaseWSO> iReleases = releases.iterator();
		
		while (iReleases.hasNext()) {
			WfmRelease wfmRelease = new WfmRelease(iReleases.next());
			wfmReleases.add(wfmRelease);
		}
		
		WfmProduct wfmProduct = new WfmProduct(productWSO, wfmReleases);
		ArrayList<BacklogItemWSO> backlogItems = new ArrayList<BacklogItemWSO>(
			Arrays.asList(this.endpoint.getActiveBacklogItems(this.product))
		);
		
		Iterator<BacklogItemWSO> iBacklogItems = backlogItems.iterator();
		while (iBacklogItems.hasNext()) {
			BacklogItemWSO backlogItem = iBacklogItems.next();
			
			// Only include those backlog items that have not been completed
			if (backlogItem.getCompletedDate() == null) {
				WfmRelease release = wfmProduct.getRelease(backlogItem
						.getReleaseId());
				release.addBacklogItem(backlogItem);
			}
		}
		
		wfmProduct.setSprints(getSprints(wfmProduct));
		return wfmProduct;
	} */
}