package us.inturik.bikeuppstore.adaptador;

import us.inturik.bikeuppstore.DTO.CotizacionDTO;
import us.inturik.bikeuppstore.EB.Cotizacion;
import us.inturik.bikeuppstore.adaptador.util.Adaptador;

public class CotizacionAdaptador extends Adaptador<CotizacionDTO, Cotizacion> {

	@Override
	public CotizacionDTO transformDTO(Cotizacion model) {
		CotizacionDTO cotizacionDTO = new CotizacionDTO();
		if (model != null) {
			cotizacionDTO.setId(model.ID.get());
			cotizacionDTO.setEstado(model.ESTADO.get());
			cotizacionDTO.setIdmantenimiento(model.IDMANTENIMIENTO.get());
			cotizacionDTO.setTotal(model.VALOR.get());
		}

		return cotizacionDTO;
	}

	@Override
	public Cotizacion transformModel(CotizacionDTO dto) {
		Cotizacion cotizacion = new Cotizacion();
		if (dto != null) {
			cotizacion.ID.set(dto.getId());
			cotizacion.ESTADO.set(dto.getEstado());
			cotizacion.IDMANTENIMIENTO.set(dto.getIdmantenimiento());
			cotizacion.IDPARTE.set(dto.getIdparte());
			cotizacion.VALOR.set(dto.getTotal());
		}
		return cotizacion;
	}

}
