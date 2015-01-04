package us.inturik.bikeuppstore.MSG;

import us.inturik.bikeuppstore.DTO.ContextRequestDTO;

public class MsgVerificarTiendaSol {

	private ContextRequestDTO contextoSolDTO;
	private String login;
	private String password;
	public ContextRequestDTO getContextoSolDTO() {
		return contextoSolDTO;
	}
	public void setContextoSolDTO(ContextRequestDTO contextoSolDTO) {
		this.contextoSolDTO = contextoSolDTO;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
