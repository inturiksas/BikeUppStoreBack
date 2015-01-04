package us.inturik.bikeuppstore.BL;

import java.util.List;

import us.inturik.bikeuppstore.EB.Tienda;

public interface TiendaST {
	public List<Tienda> getTiendas();

	public void crearTienda(List<Tienda> objTienda);

	public Tienda verificarTienda(String login, String password);

}
