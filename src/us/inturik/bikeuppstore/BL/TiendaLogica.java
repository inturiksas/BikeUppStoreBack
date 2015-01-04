package us.inturik.bikeuppstore.BL;

import java.util.List;

import com.zupcat.service.SimpleDatastoreServiceFactory;

import us.inturik.bikeuppstore.DAO.TiendaDAO;
import us.inturik.bikeuppstore.EB.Tienda;

public class TiendaLogica implements TiendaST {
	private TiendaDAO dao = null;

	public TiendaLogica() {
		// TODO Auto-generated constructor stub
		dao = new TiendaDAO();
		SimpleDatastoreServiceFactory.getSimpleDatastoreService().registerDAO(
				dao);

	}

	@Override
	public List<Tienda> getTiendas() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public void crearTienda(List<Tienda> lstTienda) {
		// TODO Auto-generated method stub
		if (!lstTienda.isEmpty()) {
			for (Tienda tienda : lstTienda) {
				dao.crearTienda(tienda);

			}

		}

	}

	@Override
	public Tienda verificarTienda(String login, String password) {
		// TODO Auto-generated method stub
		return dao.verificarTienda(login, password);
	}

}
