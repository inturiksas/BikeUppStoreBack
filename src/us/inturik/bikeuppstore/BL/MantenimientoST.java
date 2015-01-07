package us.inturik.bikeuppstore.BL;

import us.inturik.bikeuppstore.EB.Mantenimiento;

public interface MantenimientoST {
	public boolean crearMantenimiento(Mantenimiento mante);

	public boolean cerrarMantenimiento(String idMantemiento);
}
