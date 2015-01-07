package us.inturik.bikeuppstore.DAO;

import us.inturik.bikeuppstore.EB.Cotizacion;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.zupcat.dao.DAO;

public class CotizacionDAO extends DAO<Cotizacion> {
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

	private final Integer COT_AUTOTIZADA = 1;
	private final Integer COT_NOAUTORIZADA = 0;

	public CotizacionDAO() {
		super(Cotizacion.class);
	}

	/**
	 * @metodo enviarCotizacion: Permite enviar un email con la información de
	 *         las partes a cotizar con su precio.
	 * @param String
	 *            idMantenmiento
	 * @return void
	 */
	public Cotizacion enviarCotizacion(String idCotizacion) {
		Cotizacion coti = this.findById(idCotizacion);
		coti.ESTADO.set(COT_NOAUTORIZADA);
		return coti;
	}

	/**
	 * @metodo autorizarCotizacion: Permite autorizar o nó una cotización.
	 *         Cambiando el estado y calculando los precios totales.
	 * @param String
	 *            idMantenmiento
	 * @return boolean autorizo
	 */
	public boolean autorizarCotizacion(String idCotizacion) {
		boolean autorizo = false;
		try {
			Cotizacion cotiza = this.findById(idCotizacion);
			cotiza.ESTADO.set(COT_AUTOTIZADA);
			this.updateOrPersist(cotiza);
			autorizo = true;
		} catch (Exception e) {
			autorizo = false;
		}
		return autorizo;
	}

}
