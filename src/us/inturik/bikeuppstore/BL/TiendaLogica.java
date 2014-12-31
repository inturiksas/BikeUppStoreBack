package us.inturik.bikeuppstore.BL;

import java.util.List;

import com.zupcat.service.SimpleDatastoreServiceFactory;

import us.inturik.bikeuppstore.DAO.TiendaDAO;
import us.inturik.bikeuppstore.EB.Tienda;

public class TiendaLogica implements TiendaST {
	private TiendaDAO dao = null;

	public TiendaLogica() {
		// TODO Auto-generated constructor stub
		dao = SimpleDatastoreServiceFactory.getSimpleDatastoreService().getDAO(
				TiendaDAO.class);

	}

	@Override
	public List<Tienda> getTiendas() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public boolean crearTienda(Tienda objTienda) {
		// TODO Auto-generated method stub
		return dao.crearTienda(objTienda);
	}

	@Override
	public Tienda verificarTienda(String login, String password) {
		// TODO Auto-generated method stub
		return dao.verificarTienda(login, password);
	}

}
