package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ContextResponseDTO;

public class MsgAdicionarClienteResp {

	private ContextResponseDTO contextoResp;
	private boolean adiciono;

	public ContextResponseDTO getContextoResp() {
		return contextoResp;
	}

	public void setContextoResp(ContextResponseDTO contextoResp) {
		this.contextoResp = contextoResp;
	}

	public boolean isAdiciono() {
		return adiciono;
	}

	public void setAdiciono(boolean adiciono) {
		this.adiciono = adiciono;
	}
}
