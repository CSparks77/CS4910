package delegation;

import connection.ScrumWorksConnection;

/**
 * This class will be responsible for getting
 * and returning all data associated with
 * the User Activity requests.
 * 
 * @author James Manes (JAM38220)
 */
public class KanbanActivityDelegate {
	private ScrumWorksConnection connection;
	
	public KanbanActivityDelegate(ScrumWorksConnection connection) {
		this.connection = connection;
	}
}
