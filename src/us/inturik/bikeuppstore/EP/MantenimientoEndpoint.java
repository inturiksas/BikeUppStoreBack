package us.inturik.bikeuppstore.EP;

import us.inturik.bikeuppstore.BL.MantenimientoLogica;
import us.inturik.bikeuppstore.DTO.ContextResponseDTO;
import us.inturik.bikeuppstore.EB.Mantenimiento;
import us.inturik.bikeuppstore.MSG.MsgCambiarEstadoTiendaResp;
import us.inturik.bikeuppstore.MSG.MsgCerrarMantenimientoResp;
import us.inturik.bikeuppstore.MSG.MsgCrearMantenimientoResp;
import us.inturik.bikeuppstore.adaptador.MantenimientoAdaptador;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;

@Api(name = "mantenimientoendpoint", namespace = @ApiNamespace(ownerDomain = "bikeuppstore.inturik.us", ownerName = "bikeuppstore.inturik.us", packagePath = "inturik.endpoints"), version = "v1")
public class MantenimientoEndpoint {

	@ApiMethod(name = "cerrarMantenimiento", path = "cerrarMantenimiento", httpMethod = HttpMethod.GET)
	public MsgCerrarMantenimientoResp cerrarMantenimiento(
			@Named("idTransaction") String idTransaction,
			@Named("user") String user,
			@Named("application") String application,
			// los del metodo
			@Named("idmantenimiento") String idMantenimiento) {
		MsgCerrarMantenimientoResp msgResponse = new MsgCerrarMantenimientoResp();
		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(idTransaction);
		msgResponse.setContextResponse(contextResponse);
		try {
			MantenimientoLogica manLog = new MantenimientoLogica();
			msgResponse.setCerrado(manLog.cerrarMantenimiento(idMantenimiento));
		} catch (Exception e) {
			msgResponse.getContextResponse().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}
		return msgResponse;
	}

	@ApiMethod(name = "crearMantenimiento", path = "crearMantenimiento", httpMethod = HttpMethod.GET)
	public MsgCrearMantenimientoResp crearMantenimiento(
			@Named("idTransaction") String idTransaction,
			@Named("user") String user,
			@Named("application") String application,
			// los del metodo
			@Named("id") Integer id,
			@Named("estado") Integer estado,
			@Named("fecha_ingreso") String fecha_ingreso,
			@Named("fecha_salida") String fecha_salida,
			@Named("recibido") String recibido,
			@Named("valor_mo") Integer valor_mo,
			@Named("idtienda") Integer idtienda,
			@Named("idcliente") Integer idcliente,
			@Named("idarticulo") Integer idarticulo,
			@Named("valor_man_preventivo") Integer valor_man_preventivo,
			@Named("valor_man_general") Integer valor_man_general,
			@Named("valor_man_susdel_general") Integer valor_man_susdel_general,
			@Named("valor_man_susdel_pp") Integer valor_man_susdel_pp,
			@Named("valor_man_susdel_correctivo") Integer valor_man_susdel_correctivo,
			@Named("valor_man_sustra_general") Integer valor_man_sustra_general,
			@Named("valor_man_sustra_pp") Integer valor_man_sustra_pp,
			@Named("valor_man_sustra_correctivo") Integer valor_man_sustra_correctivo,
			@Named("valor_man_bujes") Integer valor_man_bujes,
			@Named("total_partes") Integer total_partes,
			@Named("total_mantenimiento") Integer total_mantenimiento,
			@Named("total") Integer total) {
		MsgCrearMantenimientoResp msgResponse = new MsgCrearMantenimientoResp();
		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(idTransaction);
		msgResponse.setContextResponse(contextResponse);

		try {
			Mantenimiento mante = new Mantenimiento();
			mante.ID.set(id);
			mante.ESTADO.set(estado);
			mante.FECHA_INGRESO.set(fecha_ingreso);
			mante.FECHA_SALIDA.set(fecha_salida);
			mante.IDARTICULO.set(idarticulo);
			mante.IDCLIENTE.set(idcliente);
			mante.IDTIENDA.set(idtienda);
			mante.RECIBIDO.set(recibido);
			mante.TOTAL.set(total);
			mante.TOTAL_MANTENIMIENTO.set(total_mantenimiento);
			mante.TOTAL_PARTES.set(total_partes);
			mante.VALOR_MAN_BUJES.set(valor_man_bujes);
			mante.VALOR_MAN_GENERAL.set(valor_man_general);
			mante.VALOR_MAN_PREVENTIVO.set(valor_man_preventivo);
			mante.VALOR_MAN_SUSDEL_CORRECTIVO.set(valor_man_susdel_correctivo);
			mante.VALOR_MAN_SUSDEL_GENERAL.set(valor_man_susdel_general);
			mante.VALOR_MAN_SUSDEL_PP.set(valor_man_susdel_pp);
			mante.VALOR_MAN_SUSTRA_CORRECTIVO.set(valor_man_sustra_correctivo);
			mante.VALOR_MAN_SUSTRA_GENERAL.set(valor_man_sustra_general);
			mante.VALOR_MAN_SUSTRA_PP.set(valor_man_sustra_pp);
			mante.VALOR_MO.set(valor_mo);

			MantenimientoLogica manLog = new MantenimientoLogica();
			// MantenimientoAdaptador adapter = new MantenimientoAdaptador();
			msgResponse.setCreado(manLog.crearMantenimiento(mante));
		} catch (Exception e) {
			msgResponse.getContextResponse().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}

		return msgResponse;
	}
}
