package us.inturik.bikeuppstore.EB;

import com.zupcat.cache.CacheStrategy;
import com.zupcat.model.DatastoreEntity;
import com.zupcat.model.config.INT;
import com.zupcat.model.config.STRING;
import com.zupcat.property.IntegerProperty;
import com.zupcat.property.StringProperty;

public class Parte extends DatastoreEntity {

	public Parte() {
		// TODO Auto-generated constructor stub
		super(CacheStrategy.SESSION_CACHE);
	}

	public IntegerProperty ID;
	public StringProperty CODIGO;
	public StringProperty NOMBRE;
	public IntegerProperty VALOR;
	public IntegerProperty IDMANTENIMIENTO;

	@Override
	protected void config() {
		// TODO Auto-generated method stub
		ID = new INT(this).build();
		CODIGO = new STRING(this).build();
		NOMBRE = new STRING(this).build();
		VALOR = new INT(this).build();
		IDMANTENIMIENTO = new INT(this).build();
	}

}
