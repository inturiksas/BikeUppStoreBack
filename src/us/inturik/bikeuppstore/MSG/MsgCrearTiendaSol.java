package us.inturik.bikeuppstore.MSG;

import java.util.List;

import us.inturik.bikeuppstore.DTO.ContextRequestDTO;
import us.inturik.bikeuppstore.DTO.TiendaDTO;

public class MsgCrearTiendaSol {

	private ContextRequestDTO contextoSolDTO;
	private List<TiendaDTO> objTiendaDTO;

	public List<TiendaDTO> getObjTiendaDTO() {
		return objTiendaDTO;
	}

	public void setObjTiendaDTO(List<TiendaDTO> objTiendaDTO) {
		this.objTiendaDTO = objTiendaDTO;
	}

	public ContextRequestDTO getContextoSolDTO() {
		return contextoSolDTO;
	}

	public void setContextoSolDTO(ContextRequestDTO contextoSolDTO) {
		this.contextoSolDTO = contextoSolDTO;
	}
}
