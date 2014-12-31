package us.inturik.bikeuppstore.EB;

import com.zupcat.cache.CacheStrategy;
import com.zupcat.model.DatastoreEntity;
import com.zupcat.model.config.INT;
import com.zupcat.model.config.STRING;
import com.zupcat.property.IntegerProperty;
import com.zupcat.property.StringProperty;

public class Tienda extends DatastoreEntity {

	public IntegerProperty ID;
	public StringProperty NIT;
	public StringProperty NOMBRE;
	public StringProperty TELEFONO;
	public StringProperty DIRECCION;
	public IntegerProperty ESTADO;
	public StringProperty LOGIN;
	public StringProperty PASSWORD;

	public Tienda() {
		super(CacheStrategy.SESSION_CACHE);
	}

	@Override
	protected void config() {
		// TODO Auto-generated method stub
		ID = new INT(this).build();
		NIT = new STRING(this).build();
		NOMBRE = new STRING(this).build();
		TELEFONO = new STRING(this).build();
		DIRECCION = new STRING(this).build();
		ESTADO = new INT(this).build();
		LOGIN = new STRING(this).build();
		PASSWORD = new STRING(this).build();
	}
}
