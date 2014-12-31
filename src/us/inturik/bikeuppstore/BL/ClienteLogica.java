package us.inturik.bikeuppstore.BL;

import java.util.List;

import com.zupcat.service.SimpleDatastoreServiceFactory;

import us.inturik.bikeuppstore.DAO.ClienteDAO;
import us.inturik.bikeuppstore.DAO.TiendaDAO;
import us.inturik.bikeuppstore.EB.Cliente;

public class ClienteLogica implements ClienteST {
	private ClienteDAO dao = null;

	public ClienteLogica() {
		// TODO Auto-generated constructor stub
		dao = SimpleDatastoreServiceFactory.getSimpleDatastoreService().getDAO(
				ClienteDAO.class);

	}

	@Override
	public List<Cliente> getClientesTienda(int idTienda) {
		// TODO Auto-generated method stub
		return dao.getClientesTienda(idTienda);
	}

	@Override
	public Cliente getClienteTienda(String cedula, int idTienda) {
		// TODO Auto-generated method stub
		return dao.getClienteTienda(cedula, idTienda);
	}

	@Override
	public boolean adicionarCliente(Cliente objCliente) {
		// TODO Auto-generated method stub
		return dao.adicionarCliente(objCliente);
	}

}
