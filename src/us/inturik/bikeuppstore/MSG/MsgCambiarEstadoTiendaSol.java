package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ContextRequestDTO;

public class MsgCambiarEstadoTiendaSol {
	private ContextRequestDTO contextoSolDTO;
	private Integer estado;

	public ContextRequestDTO getContextoSolDTO() {
		return contextoSolDTO;
	}

	public void setContextoSolDTO(ContextRequestDTO contextoSolDTO) {
		this.contextoSolDTO = contextoSolDTO;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
