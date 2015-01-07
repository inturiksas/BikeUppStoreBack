package us.inturik.bikeuppstore.BL;

import java.util.List;

import com.zupcat.service.SimpleDatastoreServiceFactory;

import us.inturik.bikeuppstore.DAO.ParteDAO;
import us.inturik.bikeuppstore.EB.Parte;

public class ParteLogica implements ParteST {
	private ParteDAO objDao = new ParteDAO();

	public ParteLogica() {
		objDao = new ParteDAO();
		SimpleDatastoreServiceFactory.getSimpleDatastoreService().registerDAO(
				objDao);
	}

	@Override
	public boolean adicionarParte(List<Parte> lstPartes) {
		boolean adiciono = false;
		if (lstPartes != null) {
			for (Parte parte : lstPartes) {
				adiciono = objDao.adicionarParte(parte);
			}
		}
		return adiciono;
	}

	@Override
	public boolean quitarParte(String idParte) {
		boolean quito = false;
		if (idParte != null) {
			quito = objDao.quitarParte(idParte);
		}
		return quito;
	}

}
