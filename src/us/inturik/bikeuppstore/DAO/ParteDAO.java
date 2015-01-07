package us.inturik.bikeuppstore.DAO;

import us.inturik.bikeuppstore.EB.Parte;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.zupcat.dao.DAO;

public class ParteDAO extends DAO<Parte> {
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

	public ParteDAO() {
		super(Parte.class);
	}

	/**
	 * @metodo adicionarParte: Permite adicionar una parte de cambio al
	 *         formulario.
	 * @param Parte
	 *            parte
	 * @return boolean adiciono
	 */
	public boolean adicionarParte(Parte parte) {
		boolean adiciono = false;
		try {
			this.updateOrPersistAsync(parte);
			adiciono = true;
		} catch (Exception e) {
			// TODO: handle exception
			adiciono = false;
		}
		return adiciono;
	}

	/**
	 * @metodo quitarParte: Permite quitar una parte de cambio al formulario.
	 * @param String
	 *            idParte
	 * @return boolean quito
	 */
	public boolean quitarParte(String idParte) {
		boolean quito = false;
		try {
			this.remove(idParte);
			quito = true;
		} catch (Exception e) {
			quito = false;
		}

		return quito;
	}

}
