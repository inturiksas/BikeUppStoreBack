package us.inturik.bikeuppstore.MSG;

import java.util.List;

import us.inturik.bikeuppstore.DTO.ContextRequestDTO;
import us.inturik.bikeuppstore.DTO.MantenimientoDTO;

public class MsgCrearMantenimientoSol {
	private ContextRequestDTO contextoSolDTO;
	private List<MantenimientoDTO> manteDTO;

	public List<MantenimientoDTO> getManteDTO() {
		return manteDTO;
	}

	public void setManteDTO(List<MantenimientoDTO> manteDTO) {
		this.manteDTO = manteDTO;
	}

	public ContextRequestDTO getContextoSolDTO() {
		return contextoSolDTO;
	}

	public void setContextoSolDTO(ContextRequestDTO contextoSolDTO) {
		this.contextoSolDTO = contextoSolDTO;
	}

}
