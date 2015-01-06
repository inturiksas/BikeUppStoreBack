package us.inturik.bikeuppstore.EP;

import java.util.List;

import us.inturik.bikeuppstore.BL.ClienteLogica;
import us.inturik.bikeuppstore.DTO.ClienteDTO;
import us.inturik.bikeuppstore.DTO.ContextResponseDTO;
import us.inturik.bikeuppstore.EB.Cliente;
import us.inturik.bikeuppstore.MSG.MsgAdicionarClienteResp;
import us.inturik.bikeuppstore.MSG.MsgConsultarClienteTiendaResp;
import us.inturik.bikeuppstore.MSG.MsgConsultarClientesTiendaResp;
import us.inturik.bikeuppstore.adaptador.ClienteAdaptador;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;

@Api(name = "clienteendpoint", namespace = @ApiNamespace(ownerDomain = "bikeuppstore.inturik.us", ownerName = "bikeuppstore.inturik.us", packagePath = "inturik.endpoints"), version = "v1")
public class ClienteEndpoint {

	private List<ClienteDTO> lstClientesDTO;

	@ApiMethod(name = "getClientesTienda", path = "getClientesTienda", httpMethod = HttpMethod.GET)
	public MsgConsultarClientesTiendaResp getClientesTienda(
			@Named("idTransaction") String idTransaction,
			@Named("user") String user,
			@Named("application") String application,
			// los del metodo
			@Named("idtienda") Integer idtienda) {
		MsgConsultarClientesTiendaResp msgResponse = new MsgConsultarClientesTiendaResp();
		try {
			ClienteLogica clienteLog = new ClienteLogica();
			ClienteDTO objClienteDTO = new ClienteDTO();
			lstClientesDTO = null;
			List<Cliente> lstClientes = clienteLog.getClientesTienda(idtienda);
			for (Cliente cliente : lstClientes) {
				objClienteDTO.setId(cliente.ID.get());
				objClienteDTO.setCedula(cliente.CEDULA.get());
				objClienteDTO.setDireccion(cliente.DIRECCION.get());
				objClienteDTO.setEmail(cliente.EMAIL.get());
				objClienteDTO.setIdtienda(cliente.IDTIENDA.get());
				objClienteDTO.setNombre(cliente.NOMBRE.get());
				objClienteDTO.setPeso(cliente.PESO.get());
				objClienteDTO.setTelefono(cliente.TELEFONO.get());

				lstClientesDTO.add(objClienteDTO);

			}
			msgResponse.setLstClientesDTO(lstClientesDTO);
		} catch (Exception e) {
			msgResponse.getContextoResp().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}

		return msgResponse;
	}

	@ApiMethod(name = "adicionarCliente", path = "adicionarCliente", httpMethod = HttpMethod.POST)
	public MsgAdicionarClienteResp getAdicionarCliente(
			@Named("idTransaction") String idTransaction,
			@Named("user") String user,
			@Named("application") String application,
			// los del metodo
			@Named("id") Integer id, @Named("cedula") String cedula,
			@Named("nombre") String nombre, @Named("telefono") String telefono,
			@Named("direccion") String direccion, @Named("peso") String peso,
			@Named("email") String email, @Named("idtienda") Integer idtienda) {
		MsgAdicionarClienteResp msgResponse = new MsgAdicionarClienteResp();
		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(idTransaction);
		msgResponse.setContextoResp(contextResponse);
		try {
			ClienteLogica clienteLog = new ClienteLogica();
			ClienteAdaptador objAdap = new ClienteAdaptador();
			Cliente objCliente = new Cliente();

			objCliente.ID.set(id);
			objCliente.CEDULA.set(cedula);
			objCliente.DIRECCION.set(direccion);
			objCliente.EMAIL.set(email);
			objCliente.IDTIENDA.set(idtienda);
			objCliente.NOMBRE.set(nombre);
			objCliente.PESO.set(peso);
			objCliente.TELEFONO.set(telefono);

			boolean adiciono = clienteLog.adicionarCliente(objCliente);
			msgResponse.setAdiciono(adiciono);
		} catch (Exception e) {
			msgResponse.getContextoResp().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}
		return msgResponse;

	}

	@ApiMethod(name = "getClienteTienda", path = "getClienteTienda", httpMethod = HttpMethod.GET)
	public MsgConsultarClienteTiendaResp getClienteTienda(
			@Named("idTransaction") String idTransaction,
			@Named("user") String user,
			@Named("application") String application,
			// los del metodo
			@Named("idtienda") Integer idTienda, @Named("cedula") String cedula)
			throws Exception {
		MsgConsultarClienteTiendaResp msgResponse = new MsgConsultarClienteTiendaResp();
		ContextResponseDTO contextResponse = UtilContext
				.getFillContextResponseDTOBasic(idTransaction);
		msgResponse.setContextoResp(contextResponse);

		try {
			ClienteLogica clienteLog = new ClienteLogica();
			ClienteAdaptador objAdap = new ClienteAdaptador();
			Cliente cliente = clienteLog.getClienteTienda(cedula, idTienda);
			msgResponse.setClienteDTO(objAdap.transformDTO(cliente));
		} catch (Exception e) {
			msgResponse.getContextoResp().setTransactionState(false);
			// Error.SendError(e.getMessage());
			throw e;
		}
		return msgResponse;
	}

}
