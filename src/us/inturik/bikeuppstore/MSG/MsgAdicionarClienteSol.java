package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ClienteDTO;
import us.inturik.bikeuppstore.DTO.ContextRequestDTO;

public class MsgAdicionarClienteSol {
	private ContextRequestDTO contextoSolDTO;
	private ClienteDTO clienteDTO;

	public ContextRequestDTO getContextoSolDTO() {
		return contextoSolDTO;
	}

	public void setContextoSolDTO(ContextRequestDTO contextoSolDTO) {
		this.contextoSolDTO = contextoSolDTO;
	}

	public ClienteDTO getClienteDTO() {
		return clienteDTO;
	}

	public void setClienteDTO(ClienteDTO clienteDTO) {
		this.clienteDTO = clienteDTO;
	}

}
