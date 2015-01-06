package us.inturik.bikeuppstore.DAO;

import java.util.List;

import us.inturik.bikeuppstore.EB.Cliente;
import us.inturik.bikeuppstore.EB.Tienda;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.zupcat.dao.DAO;
import com.zupcat.service.SimpleDatastoreServiceFactory;

public class ClienteDAO extends DAO<Cliente> {
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	// getting a DAO instance
	private ClienteDAO dao = SimpleDatastoreServiceFactory
			.getSimpleDatastoreService().getDAO(ClienteDAO.class);

	public ClienteDAO() {
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @metodo adicionarCliente: Permite adicionar la información de un cliente
	 *         a una tienda.
	 * @param Cliente
	 *            objCliente
	 * @return boolean
	 */
	public boolean adicionarCliente(Cliente objCliente) {
		boolean adiciono = false;
		Entity cliente = new Entity("cliente", "cliente");
		cliente.setProperty("id", objCliente.ID.get());
		cliente.setProperty("peso", objCliente.PESO.get());
		cliente.setProperty("cedula", objCliente.CEDULA.get());
		cliente.setProperty("direccion", objCliente.DIRECCION.get());
		cliente.setProperty("email", objCliente.EMAIL.get());
		cliente.setProperty("nombre", objCliente.NOMBRE.get());
		cliente.setProperty("telefono", objCliente.TELEFONO.get());
		cliente.setProperty("idtienda", objCliente.IDTIENDA.get());
		if (datastore.put(cliente) != null) {
			adiciono = true;
		}
		return adiciono;
	}

	/**
	 * @metodo getClienteTienda: Permite consultar la información de un cliente
	 *         deuna tienda dentro del sistema.
	 * @param cedula
	 *            (String) ; idTienda (int)
	 * @return Cliente
	 */

	public Cliente getClienteTienda(String cedula, int idTienda) {
		Cliente objCliente = null;
		// Flitro de cedula
		Filter filtroCedula = new Query.FilterPredicate(
				sample.CEDULA.getPropertyName(), Query.FilterOperator.EQUAL,
				cedula);
		// Filtro idTienda
		Filter filtroIdTienda = new Query.FilterPredicate(
				sample.IDTIENDA.getPropertyName(), Query.FilterOperator.EQUAL,
				idTienda);
		// Adiciono el operador AND
		Filter filtro = Query.CompositeFilterOperator.and(filtroCedula,
				filtroIdTienda);
		// Use class Query to assemble a query
		Query q = new Query("cliente").setFilter(filtro);

		// Use PreparedQuery interface to retrieve results
		PreparedQuery pq = datastore.prepare(q);
		objCliente = new Cliente();

		for (Entity resulta : pq.asIterable()) {
			Integer id = (Integer) resulta.getProperty("id");
			String nombre = (String) resulta.getProperty("nombre");
			String peso = (String) resulta.getProperty("peso");
			Integer idtienda = (Integer) resulta.getProperty("idtienda");
			String direccion = (String) resulta.getProperty("direccion");
			String email = (String) resulta.getProperty("email");
			String telefono = (String) resulta.getProperty("telefono");
			String cedula1 = (String) resulta.getProperty("cedula");
			// Seteo las variables al objeto a devolver
			objCliente.ID.set(id);
			objCliente.NOMBRE.set(nombre);
			objCliente.PESO.set(peso);
			objCliente.IDTIENDA.set(idtienda);
			objCliente.DIRECCION.set(direccion);
			objCliente.EMAIL.set(email);
			objCliente.TELEFONO.set(telefono);
			objCliente.CEDULA.set(cedula1);

		}
		return objCliente;
	}

	/**
	 * @metodo getClientesTienda: Permite consultar todos los clientes de la
	 *         tienda.
	 * @param int idTienda
	 * @return List<Cliente>
	 */

	public List<Cliente> getClientesTienda(int idTienda) {
		List<Cliente> clientes = null;
		Filter filtroIdTienda = new Query.FilterPredicate(
				sample.IDTIENDA.getPropertyName(), Query.FilterOperator.EQUAL,
				idTienda);
		// Use class Query to assemble a query
		Query q = new Query("cliente").setFilter(filtroIdTienda);

		// Use PreparedQuery interface to retrieve results
		PreparedQuery pq = datastore.prepare(q);
		Cliente objCliente = new Cliente();

		for (Entity resulta : pq.asIterable()) {
			Integer id = (Integer) resulta.getProperty("id");
			String nombre = (String) resulta.getProperty("nombre");
			String peso = (String) resulta.getProperty("peso");
			Integer idtienda = (Integer) resulta.getProperty("idtienda");
			String direccion = (String) resulta.getProperty("direccion");
			String email = (String) resulta.getProperty("email");
			String telefono = (String) resulta.getProperty("telefono");
			String cedula = (String) resulta.getProperty("cedula");
			// Seteo las variables al objeto a devolver
			objCliente.ID.set(id);
			objCliente.NOMBRE.set(nombre);
			objCliente.PESO.set(peso);
			objCliente.IDTIENDA.set(idtienda);
			objCliente.DIRECCION.set(direccion);
			objCliente.EMAIL.set(email);
			objCliente.TELEFONO.set(telefono);
			objCliente.CEDULA.set(cedula);
			clientes.add(objCliente);
		}
		return clientes;
	}

}
