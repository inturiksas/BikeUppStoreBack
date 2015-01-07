package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ContextResponseDTO;

public class MsgCrearMantenimientoResp {
	private ContextResponseDTO contextResponse;
	private boolean creado;

	public ContextResponseDTO getContextResponse() {
		return contextResponse;
	}

	public void setContextResponse(ContextResponseDTO contextResponse) {
		this.contextResponse = contextResponse;
	}

	public boolean isCreado() {
		return creado;
	}

	public void setCreado(boolean creado) {
		this.creado = creado;
	}
}
