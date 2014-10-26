package reporting;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class is responsible for accepting all
 * user requests and delegating the work out to
 * other classes for each specific task.
 * 
 * @author James Manes (JAM38220)
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		// Determine what navbar item was selected by the user.
		if(request.getParameter("kanban_workflow") != null) {
			fetchKanbanWorkflow();
		} else if(request.getParameter("kanban_activity") != null) {
			fetchKanbanActivity();
		} else if(request.getParameter("user_activity") != null) {
			fetchUserActivity();
		}
	}

	/**
	 * This method is invoked when the user
	 * selects the kanban workflow item from
	 * the navbar on the frontend.
	 */
	private void fetchKanbanWorkflow() {
		
	}
	
	/**
	 * This method is invoked when the user
	 * selects the kanban activity item from
	 * the navbar on the frontend.
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
}
