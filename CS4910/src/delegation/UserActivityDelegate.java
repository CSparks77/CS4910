package delegation;

import connection.ScrumWorksConnection;

/**
 * This class will be responsible for getting
 * and returning all data associated with
 * the Kanban Activity requests.
 * 
 * @author James Manes (JAM38220)
 */
public class UserActivityDelegate {
	private ScrumWorksConnection connection;
	
	public UserActivityDelegate(ScrumWorksConnection connection) {
		this.connection = connection;
	}
}
