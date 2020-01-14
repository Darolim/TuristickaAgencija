package service;

import dao.RegistracijaDAO;
import validacija.ValidacijaRegistracije;

public class RegistracioniService {

	ValidacijaRegistracije validacija = new ValidacijaRegistracije();
	
	RegistracijaDAO dao = new RegistracijaDAO();
	
	public boolean daLiSuIstiPasswordi (String password, String repeatedPassword) {
		
		return validacija.daLiSuIstiPasswordi(password, repeatedPassword);
	
	}

	public boolean upisiUseraUBazu(String userName, String password) {
		
		return dao.upisiUseraUBazu(userName, password);
		
	}
	
}
