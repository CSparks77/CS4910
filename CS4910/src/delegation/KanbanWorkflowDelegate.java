package delegation;

import com.danube.scrumworks.api2.client.ScrumWorksAPIService;

/**
 * This class will be responsible for getting
 * and returning all data associated with
 * the Kanban Workflow requests. This class
 * will also allow the user to set an interval
 * timer for automatic warning reports to be
 * e-mailed.
 * 
 * @author James Manes (JAM38220)
 */
public class KanbanWorkflowDelegate {
	private ScrumWorksAPIService apiService;
	
	public KanbanWorkflowDelegate(ScrumWorksAPIService apiService) {
		this.apiService = apiService;
	}
}
