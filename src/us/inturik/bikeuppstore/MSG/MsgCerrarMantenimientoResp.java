package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ContextResponseDTO;

public class MsgCerrarMantenimientoResp {
	private ContextResponseDTO contextResponse;
	private boolean cerrado;
	public ContextResponseDTO getContextResponse() {
		return contextResponse;
	}
	public void setContextResponse(ContextResponseDTO contextResponse) {
		this.contextResponse = contextResponse;
	}
	public boolean isCerrado() {
		return cerrado;
	}
	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}
}
