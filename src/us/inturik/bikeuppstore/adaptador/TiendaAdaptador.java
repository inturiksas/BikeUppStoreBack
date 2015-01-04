package us.inturik.bikeuppstore.adaptador;

import us.inturik.bikeuppstore.DTO.TiendaDTO;
import us.inturik.bikeuppstore.EB.Tienda;
import us.inturik.bikeuppstore.adaptador.util.Adaptador;

public class TiendaAdaptador extends Adaptador<TiendaDTO, Tienda> {

	@Override
	public TiendaDTO transformDTO(Tienda model) {

		TiendaDTO objTiendaDTO = new TiendaDTO();

		if (model != null) {
			objTiendaDTO.setDireccion(model.DIRECCION.get());
			objTiendaDTO.setEstado(model.ESTADO.get());
			objTiendaDTO.setId(model.ID.get());
			objTiendaDTO.setNit(model.NIT.get());
			objTiendaDTO.setNombre(model.NOMBRE.get());
			objTiendaDTO.setTelefono(model.TELEFONO.get());
		}

		return objTiendaDTO;
	}

	@Override
	public Tienda transformModel(TiendaDTO dto) {
		Tienda modeloTienda = new Tienda();
		if (dto != null) {
			modeloTienda.ID.set(dto.getId());
			modeloTienda.DIRECCION.set(dto.getDireccion());
			modeloTienda.ESTADO.set(dto.getEstado());
			modeloTienda.LOGIN.set(dto.getLogin());
			modeloTienda.PASSWORD.set(dto.getPassword());
			modeloTienda.NIT.set(dto.getNit());
			modeloTienda.NOMBRE.set(dto.getNombre());
			modeloTienda.TELEFONO.set(dto.getTelefono());
		}
		return modeloTienda;
	}

}
