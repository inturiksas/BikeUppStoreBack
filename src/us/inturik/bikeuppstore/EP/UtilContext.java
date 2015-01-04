package us.inturik.bikeuppstore.EP;

import java.util.Date;

import us.inturik.bikeuppstore.DTO.ContextRequestDTO;
import us.inturik.bikeuppstore.DTO.ContextResponseDTO;

public class UtilContext {

	public static ContextResponseDTO getFillContextResponseDTOBasic(
			ContextRequestDTO request) {

		ContextResponseDTO contextResponse = new ContextResponseDTO();
		contextResponse.setIdTransaccion(request.getIdTransaction());
		contextResponse.setTransactionDate(new Date());
		contextResponse.setTransactionState(true);

		return contextResponse;

	}

	public static ContextResponseDTO getFillContextResponseDTOBasic(
			String idTransaction) {

		ContextResponseDTO contextResponse = new ContextResponseDTO();
		contextResponse.setIdTransaccion(idTransaction);
		contextResponse.setTransactionDate(new Date());
		contextResponse.setTransactionState(true);

		return contextResponse;

	}

}
