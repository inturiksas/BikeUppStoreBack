package us.inturik.bikeuppstore.BL;

import com.zupcat.service.SimpleDatastoreServiceFactory;

import us.inturik.bikeuppstore.DAO.MantenimientoDAO;
import us.inturik.bikeuppstore.EB.Mantenimiento;

public class MantenimientoLogica implements MantenimientoST {
	private MantenimientoDAO dao = null;

	public MantenimientoLogica() {
		dao = new MantenimientoDAO();
		SimpleDatastoreServiceFactory.getSimpleDatastoreService().registerDAO(
				dao);
	}

	@Override
	public boolean crearMantenimiento(Mantenimiento mante) {
		boolean creo = false;
		if (mante != null) {
			if (dao.crearMantenimiento(mante)) {
				creo = true;
			} else {
				creo = false;
			}
		}
		return creo;
	}

	@Override
	public boolean cerrarMantenimiento(String idMantenimiento) {
		boolean cerro = false;
		if (idMantenimiento != null) {
			if (dao.cerrarMantenimiento(idMantenimiento)) {
				cerro = true;
			} else {
				cerro = false;
			}
		}
		return cerro;
	}

}
