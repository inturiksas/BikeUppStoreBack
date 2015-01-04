package us.inturik.bikeuppstore.DTO;

public class CotizacionDTO {

	public Integer id;
	public Integer idparte;
	public Integer total;
	public Integer idmantenimiento;
	public Integer estado;

	public Integer getIdparte() {
		return idparte;
	}

	public void setIdparte(Integer idparte) {
		this.idparte = idparte;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getIdmantenimiento() {
		return idmantenimiento;
	}

	public void setIdmantenimiento(Integer idmantenimiento) {
		this.idmantenimiento = idmantenimiento;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
