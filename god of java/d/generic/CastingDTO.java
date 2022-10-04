package d.generic;
import java.io.Serializable;
public class CastingDTO implements Serializable {
	private Object obj;
	public void setObject(Object obj) {
		this.obj = obj;
	}
	
	public Object getObject() {
		return obj;
	}
}
