package Com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@javax.persistence.Table(name = "order1")
public class Order1 {

	@Id
	@Column(name = "orderid")
	private int oid;

	@Column(name = "orderName")
	private String onameString;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOnameString() {
		return onameString;
	}

	public void setOnameString(String onameString) {
		this.onameString = onameString;
	}

	public Order1(int oid, String onameString) {
		super();
		this.oid = oid;
		this.onameString = onameString;
	}

	public Order1() {
		super();
	}

	public Order1(String onameString, int oid) {
		super();
		this.oid = oid;
		this.onameString = onameString;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", onameString=" + onameString + "]";
	}

}
