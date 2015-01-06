package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ContextRequestDTO;

public class MsgConsultarClienteTiendaSol {

	private ContextRequestDTO contextoSolDTO;
	private Integer idTienda;
	private String cedula;

	public ContextRequestDTO getContextoSolDTO() {
		return contextoSolDTO;
	}

	public void setContextoSolDTO(ContextRequestDTO contextoSolDTO) {
		this.contextoSolDTO = contextoSolDTO;
	}

	public Integer getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Integer idTienda) {
		this.idTienda = idTienda;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
