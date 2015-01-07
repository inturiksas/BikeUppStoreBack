package us.inturik.bikeuppstore.EP;

import java.util.List;

import us.inturik.bikeuppstore.BL.ParteLogica;
import us.inturik.bikeuppstore.DTO.ContextResponseDTO;
import us.inturik.bikeuppstore.EB.Parte;
import us.inturik.bikeuppstore.MSG.MsgAdicionarParteResp;
import us.inturik.bikeuppstore.MSG.MsgAdicionarParteSol;
import us.inturik.bikeuppstore.MSG.MsgQuitarParteResp;
import us.inturik.bikeuppstore.adaptador.ParteAdaptador;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;

@Api(name = "parteendpoint", namespace = @ApiNamespace(ownerDomain = "bikeuppstore.inturik.us", ownerName = "bikeuppstore.inturik.us", packagePath = "inturik.endpoints"), version = "v1")
public class ParteEndpoint {

	@ApiMethod(name = "quitarParte", path = "quitarParte", httpMethod = HttpMethod.POST)
	public MsgQuitarParteResp quitarParte(
			@Named("idTransaction") String idTransaction,
			@Named("user") String user,
			@Named("application") String application,
			// los del metodo
			@Named("idtienda") String idParte) throws Exception {
		MsgQuitarParteResp msgResponse = new MsgQuitarParteResp();
		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(idTransaction);
		msgResponse.setContextResponse(contextResponse);
		ParteLogica logic = new ParteLogica();
		logic.quitarParte(idParte);

		return msgResponse;

	}

	@ApiMethod(name = "adicionarParte", path = "adicionarParte", httpMethod = HttpMethod.POST)
	public MsgAdicionarParteResp adicionarParte(
			MsgAdicionarParteSol msgAdicionarParteSol) throws Exception {
		MsgAdicionarParteResp msgResponse = new MsgAdicionarParteResp();
		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(msgAdicionarParteSol
						.getContextoSolDTO());
		msgResponse.setContextResponse(contextResponse);
		try {
			ParteLogica logic = new ParteLogica();
			ParteAdaptador adapter = new ParteAdaptador();
			List<Parte> lstPartes = adapter
					.transformListModel(msgAdicionarParteSol.getLstParteDTO());
			logic.adicionarParte(lstPartes);

		} catch (Exception e) {
			msgResponse.getContextResponse().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}
		return msgResponse;

	}
}
