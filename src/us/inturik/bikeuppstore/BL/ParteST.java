package us.inturik.bikeuppstore.BL;

import java.util.List;

import us.inturik.bikeuppstore.EB.Parte;

public interface ParteST {
	public boolean adicionarParte(List<Parte> lstPartes);

	public boolean quitarParte(String idParte);
}
