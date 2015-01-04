package us.inturik.bikeuppstore.MSG;

import java.util.List;

import us.inturik.bikeuppstore.DTO.ContextResponseDTO;
import us.inturik.bikeuppstore.DTO.TiendaDTO;

;

public class MsgVerificarTiendaResp {

	private ContextResponseDTO contextResponse;
	private TiendaDTO Tienda;

	public TiendaDTO getTienda() {
		return Tienda;
	}

	public void setTienda(TiendaDTO tienda) {
		Tienda = tienda;
	}

	public ContextResponseDTO getContextResponse() {
		return contextResponse;
	}

	public void setContextResponse(ContextResponseDTO contextResponse) {
		this.contextResponse = contextResponse;
	}

	
}
