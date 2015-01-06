package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ContextRequestDTO;

public class MsgConsultarClientesTiendaSol {
	private ContextRequestDTO contextoSolDTO;
	private Integer idTienda;

	public ContextRequestDTO getContextoSolDTO() {
		return contextoSolDTO;
	}

	public void setContextoSolDTO(ContextRequestDTO contextoSolDTO) {
		this.contextoSolDTO = contextoSolDTO;
	}

	public Integer getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Integer idTienda) {
		this.idTienda = idTienda;
	}
}
