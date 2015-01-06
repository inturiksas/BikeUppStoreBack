package us.inturik.bikeuppstore.MSG;

import java.util.List;

import us.inturik.bikeuppstore.DTO.ContextResponseDTO;
import us.inturik.bikeuppstore.DTO.ClienteDTO;

public class MsgConsultarClientesTiendaResp {
	private ContextResponseDTO contextoResp;
	private List<ClienteDTO> lstClientesDTO;

	public ContextResponseDTO getContextoResp() {
		return contextoResp;
	}

	public void setContextoResp(ContextResponseDTO contextoResp) {
		this.contextoResp = contextoResp;
	}

	public List<ClienteDTO> getLstClientesDTO() {
		return lstClientesDTO;
	}

	public void setLstClientesDTO(List<ClienteDTO> lstClientesDTO) {
		this.lstClientesDTO = lstClientesDTO;
	}
}
