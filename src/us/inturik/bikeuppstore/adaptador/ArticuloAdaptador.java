package us.inturik.bikeuppstore.adaptador;

import us.inturik.bikeuppstore.DTO.ArticuloDTO;
import us.inturik.bikeuppstore.EB.Articulo;
import us.inturik.bikeuppstore.adaptador.util.Adaptador;

public class ArticuloAdaptador extends Adaptador<ArticuloDTO, Articulo> {

	@Override
	public ArticuloDTO transformDTO(Articulo model) {
		ArticuloDTO articuloDTO = new ArticuloDTO();
		if (model != null) {
			articuloDTO.setColor(model.COLOR.get());
			articuloDTO.setId(model.ID.get());
			articuloDTO.setIdcliente(model.IDCLIENTE.get());
			articuloDTO.setMarca(model.MARCA.get());
			articuloDTO.setNombre(model.NOMBRE.get());
			articuloDTO.setReferencia(model.REFERENCIA.get());
		}
		return articuloDTO;
	}

	@Override
	public Articulo transformModel(ArticuloDTO dto) {
		Articulo modeloArticulo = new Articulo();
		if (dto != null) {
			modeloArticulo.COLOR.set(dto.getColor());
			modeloArticulo.ID.set(dto.getId());
			modeloArticulo.IDCLIENTE.set(dto.getIdcliente());
			modeloArticulo.MARCA.set(dto.getMarca());
			modeloArticulo.NOMBRE.set(dto.getNombre());
			modeloArticulo.REFERENCIA.set(dto.getReferencia());
		}
		return modeloArticulo;
	}

}
