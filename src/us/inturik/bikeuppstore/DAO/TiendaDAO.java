package us.inturik.bikeuppstore.DAO;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import us.inturik.bikeuppstore.EB.Tienda;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.zupcat.dao.DAO;
import com.zupcat.property.IntegerProperty;
import com.zupcat.property.StringProperty;
import com.zupcat.service.SimpleDatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class TiendaDAO extends DAO<Tienda> {
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	// getting a DAO instance
	
	public TiendaDAO() {
		super(Tienda.class);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @metodo getTiendas:
	 * @param
	 * @return List<Tienda>
	 */

	public List<Tienda> getTiendas() {
		return this.getAll();
	}

	/**
	 * @metodo crearTienda: Permite crear una tienda dentro del sistema.
	 * @param Tienda
	 *            objTienda
	 * @return List<Tienda>
	 */
	public boolean crearTienda(Tienda objTienda) {
		boolean bGrabo = false;
		try {
			// for faster, asynchronous update: dao.updateOrPersistAsync(u);
			this.updateOrPersistAsync(objTienda);
			bGrabo = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return bGrabo;
	}

	/**
	 * @metodo cambiarEstadoTienda: Permie cambiar el estado de una tienda
	 *         dentro del sistema
	 * @param int idTienda, boolena estado
	 * @return N/a
	 */
	public void cambiarEstadoTienda(String idTienda, Integer estado) {
		Tienda objTienda = this.findById(idTienda);
		objTienda.ESTADO.set(estado);
	}

	/**
	 * @metodo verificarTienda: Permite verificar is existe una tienda con ese
	 *         login y pass
	 * @param String
	 *            login, String password
	 * @return Tienda
	 */
	public Tienda verificarTienda(String login, String password) {

		Filter filtroLogin = new Query.FilterPredicate(
				sample.LOGIN.getPropertyName(), Query.FilterOperator.EQUAL,
				login);
		Filter filtroPAssword = new Query.FilterPredicate(
				sample.PASSWORD.getPropertyName(), Query.FilterOperator.EQUAL,
				password);

		// Use CompositeFilter to combine multiple filters
		Filter filtro = Query.CompositeFilterOperator.and(filtroLogin,
				filtroPAssword);

		// Use class Query to assemble a query
		Query q = new Query("Tienda").setFilter(filtro);

		// Use PreparedQuery interface to retrieve results
		PreparedQuery pq = datastore.prepare(q);
		Tienda objTienda = new Tienda();

		for (Entity resulta : pq.asIterable()) {
			Integer id = (Integer) resulta.getProperty("id");
			String nit = (String) resulta.getProperty("nit");
			String nombre = (String) resulta.getProperty("nombre");
			String telefono = (String) resulta.getProperty("telefono");
			String direccion = (String) resulta.getProperty("direccion");
			Integer estado = (Integer) resulta.getProperty("estado");
			String login1 = (String) resulta.getProperty("login");
			String password1 = (String) resulta.getProperty("password");
			// Seteo las variables al objeto a devolver
			objTienda.ID.set(id);
			objTienda.NIT.set(nit);
			objTienda.NOMBRE.set(nombre);
			objTienda.TELEFONO.set(telefono);
			objTienda.DIRECCION.set(direccion);
			objTienda.ESTADO.set(estado);
			objTienda.LOGIN.set(login1);
			objTienda.PASSWORD.set(password1);
		}

		return objTienda;
	}
}
