package us.inturik.bikeuppstore.MSG;

import java.util.List;

import us.inturik.bikeuppstore.DTO.ContextResponseDTO;
import us.inturik.bikeuppstore.DTO.TiendaDTO;

public class MsgCambiarEstadoTiendaResp {

	private ContextResponseDTO contextoResp;
	private TiendaDTO objTiendaDTO;

	public TiendaDTO getObjTiendasDTO() {
		return objTiendaDTO;
	}

	public void setObjTiendaDTO(TiendaDTO objTiendaDTO) {
		this.objTiendaDTO = objTiendaDTO;
	}

	public ContextResponseDTO getContextoResp() {
		return contextoResp;
	}

	public void setContextoResp(ContextResponseDTO contextoResp) {
		this.contextoResp = contextoResp;
	}

}
