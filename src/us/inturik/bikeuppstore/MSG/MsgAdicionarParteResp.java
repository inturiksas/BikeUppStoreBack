package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ContextResponseDTO;

public class MsgAdicionarParteResp {
	private ContextResponseDTO contextResponse;
	private boolean adiciono;

	public boolean isAdiciono() {
		return adiciono;
	}

	public void setAdiciono(boolean adiciono) {
		this.adiciono = adiciono;
	}

	public ContextResponseDTO getContextResponse() {
		return contextResponse;
	}

	public void setContextResponse(ContextResponseDTO contextResponse) {
		this.contextResponse = contextResponse;
	}

}
