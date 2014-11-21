package delegation;

import com.danube.scrumworks.api2.client.ScrumWorksAPIService;

/**
 * This class will be responsible for getting
 * and returning all data associated with
 * the User Activity requests.
 * 
 * @author James Manes (JAM38220)
 */
public class KanbanActivityDelegate {
	private ScrumWorksAPIService apiService;
	
	public KanbanActivityDelegate(ScrumWorksAPIService apiService) {
		this.apiService = apiService;
	}
}
