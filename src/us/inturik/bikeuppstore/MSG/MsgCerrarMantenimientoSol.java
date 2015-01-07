package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ContextRequestDTO;

public class MsgCerrarMantenimientoSol {
	private ContextRequestDTO contextoSolDTO;
	private String idMantenimiento;

	public ContextRequestDTO getContextoSolDTO() {
		return contextoSolDTO;
	}

	public void setContextoSolDTO(ContextRequestDTO contextoSolDTO) {
		this.contextoSolDTO = contextoSolDTO;
	}

	public String getIdMantenimiento() {
		return idMantenimiento;
	}

	public void setIdMantenimiento(String idMantenimiento) {
		this.idMantenimiento = idMantenimiento;
	}
}
