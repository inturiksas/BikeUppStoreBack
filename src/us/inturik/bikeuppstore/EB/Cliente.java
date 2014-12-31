package us.inturik.bikeuppstore.EB;

import com.zupcat.cache.CacheStrategy;
import com.zupcat.model.DatastoreEntity;
import com.zupcat.model.config.INT;
import com.zupcat.model.config.STRING;
import com.zupcat.property.IntegerProperty;
import com.zupcat.property.StringProperty;

public class Cliente extends DatastoreEntity {
	public IntegerProperty ID;
	public StringProperty CEDULA;
	public StringProperty NOMBRE;
	public StringProperty DIRECCION;
	public StringProperty PESO;
	public StringProperty TELEFONO;
	public StringProperty EMAIL;
	public IntegerProperty IDTIENDA;

	public Cliente() {
		super(CacheStrategy.SESSION_CACHE);
	}

	@Override
	protected void config() {
		// TODO Auto-generated method stub
		ID = new INT(this).build();
		CEDULA = new STRING(this).build();
		NOMBRE = new STRING(this).build();
		DIRECCION = new STRING(this).build();
		PESO = new STRING(this).build();
		TELEFONO = new STRING(this).build();
		EMAIL = new STRING(this).build();
		IDTIENDA = new INT(this).build();

	}

}
