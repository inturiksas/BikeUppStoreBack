package us.inturik.bikeuppstore.BL;

import us.inturik.bikeuppstore.EB.Cotizacion;

public interface CotizacionST {
	public boolean autorizarCotizacion(String idMantenmiento);

	public Cotizacion enviarCotizacion(String idCotizacion);
}
