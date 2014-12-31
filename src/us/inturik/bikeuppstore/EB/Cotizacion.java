package us.inturik.bikeuppstore.EB;

import com.zupcat.cache.CacheStrategy;
import com.zupcat.model.DatastoreEntity;
import com.zupcat.model.config.INT;
import com.zupcat.property.IntegerProperty;

public class Cotizacion extends DatastoreEntity {

	public Cotizacion() {
		// TODO Auto-generated constructor stub
		super(CacheStrategy.SESSION_CACHE);
	}

	public IntegerProperty ID;
	public IntegerProperty IDMANTENIMIENTO;
	public IntegerProperty IDPARTE;
	public IntegerProperty ESTADO;
	public IntegerProperty VALOR;

	@Override
	protected void config() {
		// TODO Auto-generated method stub
		ID = new INT(this).build();
		IDMANTENIMIENTO = new INT(this).build();
		IDPARTE = new INT(this).build();
		ESTADO = new INT(this).build();
		VALOR = new INT(this).build();
	}

}
