package us.inturik.bikeuppstore.EP;

import us.inturik.bikeuppstore.BL.CotizacionLogica;
import us.inturik.bikeuppstore.DTO.ContextResponseDTO;
import us.inturik.bikeuppstore.MSG.MsgAutorizarCotizacionResp;
import us.inturik.bikeuppstore.MSG.MsgEnviarCotizacionResp;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;

@Api(name = "cotizacionendpoint", namespace = @ApiNamespace(ownerDomain = "bikeuppstore.inturik.us", ownerName = "bikeuppstore.inturik.us", packagePath = "inturik.endpoints"), version = "v1")
public class CotizacionEndpoint {

	@ApiMethod(name = "autorizarCotizacion", path = "autorizarCotizacion", httpMethod = HttpMethod.GET)
	public MsgAutorizarCotizacionResp autorizarCotizacion(
			@Named("idTransaction") String idTransaction,
			@Named("user") String user,
			@Named("application") String application,
			// los del metodo
			@Named("idcotizacion") String idCotizacion) throws Exception {
		MsgAutorizarCotizacionResp msgResponse = new MsgAutorizarCotizacionResp();
		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(idTransaction);
		msgResponse.setContextResponse(contextResponse);
		try {
			CotizacionLogica logic = new CotizacionLogica();
			logic.autorizarCotizacion(idCotizacion);
		} catch (Exception e) {
			msgResponse.getContextResponse().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}
		return msgResponse;
	}

	@ApiMethod(name = "enviarCotizacion", path = "enviarCotizacion", httpMethod = HttpMethod.GET)
	public MsgEnviarCotizacionResp enviarCotizacion(
			@Named("idTransaction") String idTransaction,
			@Named("user") String user,
			@Named("application") String application,
			// los del metodo
			@Named("idtienda") String idCotizacion) throws Exception {
		MsgEnviarCotizacionResp msgResponse = new MsgEnviarCotizacionResp();
		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(idTransaction);
		msgResponse.setContextResponse(contextResponse);
		try {
			CotizacionLogica logic = new CotizacionLogica();
			logic.enviarCotizacion(idCotizacion);
		} catch (Exception e) {
			msgResponse.getContextResponse().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}
		return msgResponse;
	}

}
