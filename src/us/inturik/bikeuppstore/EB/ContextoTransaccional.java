package us.inturik.bikeuppstore.EB;

import com.zupcat.cache.CacheStrategy;
import com.zupcat.model.DatastoreEntity;
import com.zupcat.model.config.INT;
import com.zupcat.model.config.STRING;
import com.zupcat.property.IntegerProperty;
import com.zupcat.property.StringProperty;

public class ContextoTransaccional extends DatastoreEntity {

	public IntegerProperty IDTRANSACCION;
	public StringProperty NOMBREUSUARIO;
	public StringProperty NOMBREAPP;
	public IntegerProperty PAGINANUMERO;
	public IntegerProperty TAMANOPAGINA;

	public ContextoTransaccional() {
		// TODO Auto-generated constructor stub
		super(CacheStrategy.SESSION_CACHE);
	}

	@Override
	protected void config() {
		// TODO Auto-generated method stub
		IDTRANSACCION = new INT(this).build();
		NOMBREUSUARIO = new STRING(this).build();
		NOMBREAPP = new STRING(this).build();
		PAGINANUMERO = new INT(this).build();
		TAMANOPAGINA = new INT(this).build();

	}

}
