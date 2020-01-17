package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.RegistracioniService;

/**
 * Servlet implementation class RegistracioniServlet
 */

@WebServlet(description = "ovo je servlet za registraciju korisnika", urlPatterns = { "/registracioniServlet" })
public class registracioniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	public registracioniServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// preuzimanje parametara sa forme (iz URL-a)
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String repeatedPassword = request.getParameter("repeatedPassword");
		
		System.out.println("Dobrodaosao " + userName);
		System.out.println("Tvoj pass je: " + password);
		System.out.println("Ponovio si:  " + repeatedPassword);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String repeatedPassword = request.getParameter("repeatedPassword");
		
		System.out.println("Dobrodaosao u dopost " + userName);
		System.out.println("Tvoj pass je: " + password);
		System.out.println("Ponovio si:  " + repeatedPassword);
		
		// povezujem se sa servisom
		RegistracioniService service = new RegistracioniService();
		
		//proveravamo passworde
		boolean proveraPassworda = service.daLiSuIstiPasswordi(password, repeatedPassword);
		
		User user = service.vratiUserModel(userName, password);
		
		if(proveraPassworda) {
			
			//idi na index stranu
			response.sendRedirect("Index.html");
			
		}else {
			//idi na refistracionu formu ponovo
			response.sendRedirect("htmlFajlovi/registracija.html");
		}
				
	}

}