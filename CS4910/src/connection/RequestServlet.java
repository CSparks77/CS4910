package connection;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import delegation.KanbanActivityDelegate;
import delegation.KanbanWorkflowDelegate;
import delegation.UserActivityDelegate;

/**
 * This class is responsible for accepting all
 * user requests and delegating the work out to
 * other classes for each specific task.
 * 
 * @author James Manes (JAM38220)
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private KanbanActivityDelegate kanbanActivityDelegate;
	private KanbanWorkflowDelegate kanbanWorkflowDelegate;
	private UserActivityDelegate userActivityDelegate;
	private ScrumWorksConnection scrumWorksConnection;
	private static final long serialVersionUID = 1L;
       
    /**
     * Call super to set up the HttpServlet class and
     * instantiate kanban/user objects.
     * 
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
    }

	/**
	 * This method will handle all requests from the front end and delegate
	 * the work out to methods within this class.
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		// Initial call on page load
		if(request.getParameter("initialize") != null) {
			initializeWebApp();
		}
		
		// Determine what navbar item was selected by the user.
		if(request.getParameter("kanban_workflow") != null) {
			fetchKanbanWorkflow();
			response.getWriter().write("Hello, world!"); // TODO write back the PDF.
		} else if(request.getParameter("kanban_activity") != null) {
			fetchKanbanActivity();
			response.getWriter().write("Hello, world!"); // TODO write back the PDF.
		} else if(request.getParameter("user_activity") != null) {
			fetchUserActivity();
			response.getWriter().write("Hello, world!"); // TODO write back the PDF.
		}
	}

	/**
	 * This method is invoked when the user
	 * selects the kanban work flow item from
	 * the nav bar on the front end.
	 */
	private void fetchKanbanWorkflow() {
		
	}
	
	/**
	 * This method is invoked when the user
	 * selects the kanban activity item from
	 * the nav bar on the front end.
	 */
	private void fetchKanbanActivity() {
		
	}
	
	/**
	 * This method is invoked when the user
	 * selects the user activity item from
	 * the navbar on the frontend.
	 */
	private void fetchUserActivity() {
		
	}
	
	/**
	 * This method is invoked when the user first
	 * loads the web page. From here this method will
	 * instantiate a ScrumWorksConnection object which
	 * will set a connection to the specified scrumworks
	 * installation.
	 */
	private void initializeWebApp() {
        this.scrumWorksConnection = new ScrumWorksConnection();
        this.kanbanActivityDelegate = new KanbanActivityDelegate(scrumWorksConnection);
        this.kanbanWorkflowDelegate = new KanbanWorkflowDelegate(scrumWorksConnection);
        this.userActivityDelegate = new UserActivityDelegate(scrumWorksConnection);
	}
}
