package us.inturik.bikeuppstore.EB;

import com.zupcat.cache.CacheStrategy;
import com.zupcat.model.DatastoreEntity;
import com.zupcat.model.config.INT;
import com.zupcat.model.config.STRING;
import com.zupcat.property.IntegerProperty;
import com.zupcat.property.StringProperty;

public class Articulo extends DatastoreEntity {

	public Articulo() {
		super(CacheStrategy.SESSION_CACHE);
		// TODO Auto-generated constructor stub
	}

	public IntegerProperty ID;
	public IntegerProperty IDCLIENTE;
	public StringProperty NOMBRE;
	public StringProperty MARCA;
	public StringProperty REFERENCIA;
	public StringProperty COLOR;

	@Override
	protected void config() {
		// TODO Auto-generated method stub
		ID = new INT(this).build();
		IDCLIENTE = new INT(this).build();
		NOMBRE = new STRING(this).build();
		MARCA = new STRING(this).build();
		REFERENCIA = new STRING(this).build();
		COLOR = new STRING(this).build();

	}

}
