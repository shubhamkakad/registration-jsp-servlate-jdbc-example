package net.java.registration.cotroller;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import net.java.registration.Dao.EmployeeDao;
import net.java.registration.model.Employee;

/**
 *  implementation class EmployeeServlate
 */
@WebServlet("/register")
public class EmployeeServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	private EmployeeDao employeeDao =new EmployeeDao();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());


		javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeRegistration.jsp");
		dispatcher.forward(request, response); 
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		@SuppressWarnings("unused")
		String UserName = request.getParameter("UserName");
		String pass = request.getParameter("pass");
		String City = request.getParameter("City");
	
		Employee employee= new Employee();
		employee.setFirstName(FirstName);
		employee.setLastName(LastName);
		employee.setPass(pass);
		employee.setCity(City);
		
		try {
			employeeDao.Registeremployee(employee);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeDetail.jsp");
		dispatcher.forward(request, response); 
	}

}
