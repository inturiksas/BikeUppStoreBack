package us.inturik.bikeuppstore.DAO;

import us.inturik.bikeuppstore.EB.Mantenimiento;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.zupcat.dao.DAO;

public class MantenimientoDAO extends DAO<Mantenimiento> {
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	private final Integer MAN_ABIERTO = 1;
	private final Integer MAN_CERRADO = 0;

	public MantenimientoDAO() {
		super(Mantenimiento.class);
	}

	/**
	 * @metodo crearMantenimiento: Permite guardar el registro de un
	 *         mantenimiento. Sin importar si está cerrada o nó.
	 * @param Mantenimiento
	 *            mante
	 * @return boolean guardo
	 */
	public boolean crearMantenimiento(Mantenimiento mante) {
		boolean guardo = false;
		try {
			this.updateOrPersistAsync(mante);
			guardo = true;
		} catch (Exception e) {
			// TODO: handle exception
			guardo = false;
		}
		return guardo;

	}

	/**
	 * @metodo cerrarMantenimiento: Permite cerrar una orden de mantenimiento,
	 *         cambiando así su estado.
	 * @param Integer
	 *            idMantemiento
	 * @return boolean cerro
	 */
	public boolean cerrarMantenimiento(String idMantenimiento) {
		boolean cerro = false;
		try {
			Mantenimiento objMan = this.findById(idMantenimiento);
			objMan.ESTADO.set(MAN_CERRADO);
			cerro = true;
		} catch (Exception e) {
			// TODO: handle exception
			cerro = false;
		}
		return cerro;
	}
}
