package us.inturik.bikeuppstore.BL;

import java.util.List;

import us.inturik.bikeuppstore.EB.Cliente;

public interface ClienteST {
	public List<Cliente> getClientesTienda(int idTienda);

	public Cliente getClienteTienda(String cedula, int idTienda);

	public boolean adicionarCliente(Cliente objCliente);
}
