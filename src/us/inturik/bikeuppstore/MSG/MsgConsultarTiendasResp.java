package us.inturik.bikeuppstore.MSG;

import java.util.List;

import us.inturik.bikeuppstore.DTO.ContextResponseDTO;
import us.inturik.bikeuppstore.DTO.TiendaDTO;

public class MsgConsultarTiendasResp {

	private ContextResponseDTO contextoResp;
	private List<TiendaDTO> lstTiendasDTO;

	public ContextResponseDTO getContextoResp() {
		return contextoResp;
	}

	public void setContextoResp(ContextResponseDTO contextoResp) {
		this.contextoResp = contextoResp;
	}

	public List<TiendaDTO> getLstTiendasDTO() {
		return lstTiendasDTO;
	}

	public void setLstTiendasDTO(List<TiendaDTO> lstTiendasDTO) {
		this.lstTiendasDTO = lstTiendasDTO;
	}

}
