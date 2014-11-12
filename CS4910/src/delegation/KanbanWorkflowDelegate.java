package delegation;

import connection.ScrumWorksConnection;

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
	private ScrumWorksConnection connection;
	
	public KanbanWorkflowDelegate(ScrumWorksConnection connection) {
		this.connection = connection;
	}
}
