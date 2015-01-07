package us.inturik.bikeuppstore.MSG;

import java.util.List;

import us.inturik.bikeuppstore.DTO.ContextRequestDTO;
import us.inturik.bikeuppstore.DTO.ParteDTO;
import us.inturik.bikeuppstore.EB.Parte;

public class MsgAdicionarParteSol {
	private ContextRequestDTO contextoSolDTO;
	private List<ParteDTO> lstParteDTO;

	public ContextRequestDTO getContextoSolDTO() {
		return contextoSolDTO;
	}

	public void setContextoSolDTO(ContextRequestDTO contextoSolDTO) {
		this.contextoSolDTO = contextoSolDTO;
	}

	public List<ParteDTO> getLstParteDTO() {
		return lstParteDTO;
	}

	public void setLstParteDTO(List<ParteDTO> lstParteDTO) {
		this.lstParteDTO = lstParteDTO;
	}
}
