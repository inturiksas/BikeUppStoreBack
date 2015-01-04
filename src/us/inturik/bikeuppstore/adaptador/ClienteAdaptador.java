package us.inturik.bikeuppstore.adaptador;

import us.inturik.bikeuppstore.DTO.ClienteDTO;
import us.inturik.bikeuppstore.EB.Cliente;
import us.inturik.bikeuppstore.adaptador.util.Adaptador;

public class ClienteAdaptador extends Adaptador<ClienteDTO, Cliente> {

	@Override
	public ClienteDTO transformDTO(Cliente model) {
		ClienteDTO clienteDTO = new ClienteDTO();
		if (model != null) {
			clienteDTO.setId(model.ID.get());
			clienteDTO.setCedula(model.CEDULA.get());
			clienteDTO.setDireccion(model.DIRECCION.get());
			clienteDTO.setEmail(model.EMAIL.get());
			clienteDTO.setIdtienda(model.IDTIENDA.get());
			clienteDTO.setNombre(model.NOMBRE.get());
			clienteDTO.setPeso(model.PESO.get());
		}
		return clienteDTO;
	}

	@Override
	public Cliente transformModel(ClienteDTO dto) {
		Cliente modeloCliente = new Cliente();
		if (dto != null) {
			modeloCliente.CEDULA.set(dto.getCedula());
			modeloCliente.DIRECCION.set(dto.getDireccion());
			modeloCliente.EMAIL.set(dto.getEmail());
			modeloCliente.ID.set(dto.getId());
			modeloCliente.IDTIENDA.set(dto.getIdtienda());
			modeloCliente.NOMBRE.set(dto.getNombre());
			modeloCliente.PESO.set(dto.getPeso());
			modeloCliente.TELEFONO.set(dto.getTelefono());
		}
		return modeloCliente;
	}

}
