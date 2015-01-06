package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ClienteDTO;
import us.inturik.bikeuppstore.DTO.ContextResponseDTO;

public class MsgConsultarClienteTiendaResp {
	private ContextResponseDTO contextoResp;
	private ClienteDTO clienteDTO;

	public ContextResponseDTO getContextoResp() {
		return contextoResp;
	}

	public void setContextoResp(ContextResponseDTO contextoResp) {
		this.contextoResp = contextoResp;
	}

	public ClienteDTO getClienteDTO() {
		return clienteDTO;
	}

	public void setClienteDTO(ClienteDTO clienteDTO) {
		this.clienteDTO = clienteDTO;
	}

}
