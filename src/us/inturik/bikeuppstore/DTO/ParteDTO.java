package us.inturik.bikeuppstore.DTO;

public class ParteDTO {

	public Integer id;
	public String codigo;
	public Integer valor;
	public String nombre;
	public Integer idMantenimiento;

	public Integer getIdMantenimiento() {
		return idMantenimiento;
	}

	public void setIdMantenimiento(Integer idMantenimiento) {
		this.idMantenimiento = idMantenimiento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
