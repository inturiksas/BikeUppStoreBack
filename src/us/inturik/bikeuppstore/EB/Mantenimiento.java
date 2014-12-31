package us.inturik.bikeuppstore.EB;

import com.zupcat.cache.CacheStrategy;
import com.zupcat.model.DatastoreEntity;
import com.zupcat.model.config.INT;
import com.zupcat.model.config.STRING;
import com.zupcat.property.IntegerProperty;
import com.zupcat.property.StringProperty;

public class Mantenimiento extends DatastoreEntity {

	public Mantenimiento() {
		// TODO Auto-generated constructor stub
		super(CacheStrategy.SESSION_CACHE);
	}

	public IntegerProperty ID;
	public IntegerProperty ESTADO;
	public StringProperty FECHA_INGRESO;
	public StringProperty FECHA_SALIDA;
	public StringProperty RECIBIDO;
	public IntegerProperty VALOR_MO;
	public IntegerProperty IDTIENDA;
	public IntegerProperty IDCLIENTE;
	public IntegerProperty IDARTICULO;
	public IntegerProperty VALOR_MAN_PREVENTIVO;
	public IntegerProperty VALOR_MAN_GENERAL;
	public IntegerProperty VALOR_MAN_SUSDEL_GENERAL;
	public IntegerProperty VALOR_MAN_SUSDEL_PP;
	public IntegerProperty VALOR_MAN_SUSDEL_CORRECTIVO;
	public IntegerProperty VALOR_MAN_SUSTRA_GENERAL;
	public IntegerProperty VALOR_MAN_SUSTRA_PP;
	public IntegerProperty VALOR_MAN_SUSTRA_CORRECTIVO;
	public IntegerProperty VALOR_MAN_BUJES;
	public IntegerProperty TOTAL_PARTES;
	public IntegerProperty TOTAL_MANTENIMIENTO;
	public IntegerProperty TOTAL;

	@Override
	protected void config() {
		// TODO Auto-generated method stub
		ID = new INT(this).build();
		ESTADO = new INT(this).build();
		FECHA_INGRESO = new STRING(this).build();
		FECHA_SALIDA = new STRING(this).build();
		RECIBIDO = new STRING(this).build();
		VALOR_MO = new INT(this).build();
		IDTIENDA = new INT(this).build();
		IDCLIENTE = new INT(this).build();
		IDARTICULO = new INT(this).build();
		VALOR_MAN_PREVENTIVO = new INT(this).build();
		VALOR_MAN_GENERAL = new INT(this).build();
		VALOR_MAN_SUSDEL_GENERAL = new INT(this).build();
		VALOR_MAN_SUSDEL_PP = new INT(this).build();
		VALOR_MAN_SUSDEL_CORRECTIVO = new INT(this).build();
		VALOR_MAN_SUSTRA_GENERAL = new INT(this).build();
		VALOR_MAN_SUSTRA_PP = new INT(this).build();
		VALOR_MAN_SUSTRA_CORRECTIVO = new INT(this).build();
		VALOR_MAN_BUJES = new INT(this).build();
		TOTAL_PARTES = new INT(this).build();
		TOTAL_MANTENIMIENTO = new INT(this).build();
		TOTAL = new INT(this).build();

	}

}
