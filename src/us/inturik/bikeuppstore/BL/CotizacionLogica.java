package us.inturik.bikeuppstore.BL;

import com.zupcat.service.SimpleDatastoreServiceFactory;

import us.inturik.bikeuppstore.DAO.ClienteDAO;
import us.inturik.bikeuppstore.DAO.CotizacionDAO;
import us.inturik.bikeuppstore.DAO.MantenimientoDAO;
import us.inturik.bikeuppstore.EB.Cliente;
import us.inturik.bikeuppstore.EB.Cotizacion;
import us.inturik.bikeuppstore.EB.Mantenimiento;

public class CotizacionLogica implements CotizacionST {
	private CotizacionDAO daoCot = null;
	private MantenimientoDAO daoMan = null;
	private ClienteDAO daoCli = null;

	public CotizacionLogica() {
		daoCot = new CotizacionDAO();
		daoMan = new MantenimientoDAO();
		daoCli = new ClienteDAO();
		SimpleDatastoreServiceFactory.getSimpleDatastoreService().registerDAO(
				daoCot);
		SimpleDatastoreServiceFactory.getSimpleDatastoreService().registerDAO(
				daoMan);
		SimpleDatastoreServiceFactory.getSimpleDatastoreService().registerDAO(
				daoCli);
	}

	@Override
	public boolean autorizarCotizacion(String idCotizacion) {
		boolean autorizo = false;
		if (idCotizacion != null) {
			autorizo = daoCot.autorizarCotizacion(idCotizacion);
		}
		return autorizo;
	}

	@Override
	public Cotizacion enviarCotizacion(String idCotizacion) {
		Cotizacion cotiza = new Cotizacion();
		if (idCotizacion != null) {
			cotiza = daoCot.findById(idCotizacion);
			/*
			 * Enviar el email al cliente
			 */
			Mantenimiento mant = daoMan.findById(cotiza.IDMANTENIMIENTO.get()
					.toString());
			Cliente cliente = daoCli.findById(mant.IDCLIENTE.get().toString());
			String email = cliente.EMAIL.get();
			// Después de enviarlo, se cambia el estado
			daoCot.enviarCotizacion(idCotizacion);
		}
		return cotiza;
	}
}
