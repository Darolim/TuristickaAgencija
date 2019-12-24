package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.RegistracioniService;

@WebServlet(description = "Servlet za registraciju korisnika", urlPatterns = { "/registracioniServlet" })
public class registracioniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public registracioniServlet() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String repeatedPassword = request.getParameter("repeatedPassword");
	
		RegistracioniService service=new RegistracioniService();
		
		boolean proveraPassworda = service.daLiSuIstiPasswordi(password, repeatedPassword);
		
		if (proveraPassworda) {
			
			response.sendRedirect("Index.html");
			
		}else {
			
			response.sendRedirect("htmlFajlovi/registracija.html");
			
		}
	}

}
