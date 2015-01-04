package us.inturik.bikeuppstore.EB;

import com.zupcat.cache.CacheStrategy;
import com.zupcat.model.DatastoreEntity;
import com.zupcat.model.config.STRING;
import com.zupcat.property.BooleanProperty;
import com.zupcat.property.DataObjectProperty;
import com.zupcat.property.StringProperty;

public class ContextoRespuesta extends DatastoreEntity {
	public StringProperty IDTRANSACCION;
	public DataObjectProperty FECHATRANSACCION;
	public BooleanProperty ESTADOTRANSACCION;

	public ContextoRespuesta() {
		// TODO Auto-generated constructor stub
	}

	public ContextoRespuesta(CacheStrategy arg0) {
		super(CacheStrategy.SESSION_CACHE);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void config() {
	/*	// TODO Auto-generated method stub
		IDTRANSACCION = new STRING(this).build();
		FECHATRANSACCION = new DATE;
		ESTADOTRANSACCION;*/

	}

}
