import java.util.Date;

public class Medication {
	private String name;
	private Date start;
	private Date end;
	public Medication(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
	
}
