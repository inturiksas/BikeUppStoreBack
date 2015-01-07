package us.inturik.bikeuppstore.adaptador;

import us.inturik.bikeuppstore.DTO.ParteDTO;
import us.inturik.bikeuppstore.EB.Parte;
import us.inturik.bikeuppstore.adaptador.util.Adaptador;

public class ParteAdaptador extends Adaptador<ParteDTO, Parte> {

	@Override
	public ParteDTO transformDTO(Parte model) {
		ParteDTO objDTO = new ParteDTO();
		if (model != null) {
			objDTO.setCodigo(model.CODIGO.get());
			objDTO.setId(model.ID.get());
			objDTO.setIdMantenimiento(model.IDMANTENIMIENTO.get());
			objDTO.setNombre(model.NOMBRE.get());
			objDTO.setValor(model.VALOR.get());
		}
		return objDTO;
	}

	@Override
	public Parte transformModel(ParteDTO dto) {
		Parte model = new Parte();
		if (dto != null) {
			model.ID.set(dto.getId());
			model.CODIGO.set(dto.getCodigo());
			model.IDMANTENIMIENTO.set(dto.getIdMantenimiento());
			model.NOMBRE.set(dto.getNombre());
			model.VALOR.set(dto.getValor());
		}
		return model;
	}

}
