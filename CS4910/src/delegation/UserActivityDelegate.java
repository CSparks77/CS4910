package delegation;

import com.danube.scrumworks.api2.client.ScrumWorksAPIService;

import connection.ScrumWorksConnection;

/**
 * This class will be responsible for getting
 * and returning all data associated with
 * the Kanban Activity requests.
 * 
 * @author James Manes (JAM38220)
 */
public class UserActivityDelegate {
	private ScrumWorksAPIService apiService;
	
	public UserActivityDelegate(ScrumWorksAPIService apiService) {
		this.apiService = apiService;
	}
}
