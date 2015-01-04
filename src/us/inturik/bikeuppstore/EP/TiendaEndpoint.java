package us.inturik.bikeuppstore.EP;

import java.util.List;

import us.inturik.bikeuppstore.BL.TiendaLogica;
import us.inturik.bikeuppstore.DTO.ContextResponseDTO;
import us.inturik.bikeuppstore.EB.Tienda;
import us.inturik.bikeuppstore.MSG.MsgConsultarTiendasResp;
import us.inturik.bikeuppstore.MSG.MsgConsultarTiendasSol;
import us.inturik.bikeuppstore.MSG.MsgCrearTiendaResp;
import us.inturik.bikeuppstore.MSG.MsgCrearTiendaSol;
import us.inturik.bikeuppstore.adaptador.TiendaAdaptador;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

@Api(name = "tiendaendpoint", namespace = @ApiNamespace(ownerDomain = "bikeuppstore.inturik.us", ownerName = "bikeuppstore.inturik.us", packagePath = "inturik.endpoints"), version = "v1")
public class TiendaEndpoint {

	@ApiMethod(name = "crearTiendas", path = "crearTiendas", httpMethod = HttpMethod.POST)
	public MsgCrearTiendaResp crearTienda(MsgCrearTiendaSol msgCrearTiendaSol)
			throws Exception {
		MsgCrearTiendaResp msgResponse = new MsgCrearTiendaResp();
		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(msgCrearTiendaSol
						.getContextoSolDTO());
		msgResponse.setContextResponse(contextResponse);
		try {
			TiendaLogica objTiendaLogica = new TiendaLogica();
			TiendaAdaptador objTiendaAdpatador = new TiendaAdaptador();
			List<Tienda> lstTienda = objTiendaAdpatador
					.transformListModel(msgCrearTiendaSol.getObjTiendaDTO());
			objTiendaLogica.crearTienda(lstTienda);

		} catch (Exception e) {
			msgResponse.getContextResponse().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}

		return msgResponse;
	}

	@ApiMethod(name = "consultarTiendas", path = "consultarTiendas", httpMethod = HttpMethod.GET)
	public MsgConsultarTiendasResp consultarTiendas(
			@Named("idTransaction") String idTransaction,
			@Named("user") String user, @Named("application") String application)
			throws Exception {

		MsgConsultarTiendasResp msgResponse = new MsgConsultarTiendasResp();

		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(idTransaction);

		msgResponse.setContextoResp(contextResponse);

		try {
			TiendaLogica objTiendaLogica = new TiendaLogica();

			TiendaAdaptador objTiendaAdpatador = new TiendaAdaptador();

			msgResponse.setLstTiendasDTO(objTiendaAdpatador
					.transformListDTO(objTiendaLogica.getTiendas()));

		} catch (Exception e) {
			msgResponse.getContextoResp().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}

		return msgResponse;

	}

}
