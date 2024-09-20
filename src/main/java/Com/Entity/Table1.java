package Com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "hotel_table")
public class Table1 {

	@Id
	private int tid;
	private int table_Size;
	private String table_Name;

	public Table1() {
		super();
	}

	public Table1(int tid, int table_Size, String table_Name) {
		super();
		this.tid = tid;
		this.table_Size = table_Size;
		this.table_Name = table_Name;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getTable_Size() {
		return table_Size;
	}

	public void setTable_Size(int table_Size) {
		this.table_Size = table_Size;
	}

	public String getTable_Name() {
		return table_Name;
	}

	public void setTable_Name(String table_Name) {
		this.table_Name = table_Name;
	}

	@Override
	public String toString() {
		return "Table1 [tid=" + tid + ", table_Size=" + table_Size + ", table_Name=" + table_Name + "]";
	}

}
