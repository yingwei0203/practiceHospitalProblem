import java.util.List;
import java.util.Date;

public class Patient extends Person{
	private List<Allergy> allergy;
	private List<Disease> disease;
	private List<Medication> medication;
	private Temprature temprature;
	private Date lastSeen;
	public Patient(String name, int age, Address address, List<Allergy> allergy, List<Disease> disease) {
		super(name, age, address);
		this.allergy = allergy;
		this.disease = disease;
		this.lastSeen = new Date();
	}
	public Patient(String name, int age, Address address, List<Allergy> allergy, List<Disease> disease,
			List<Medication> medication, Temprature temprature, Date lastSeen) {
		super(name, age, address);
		this.allergy = allergy;
		this.disease = disease;
		this.medication = medication;
		this.temprature = temprature;
		this.lastSeen = new Date();
	}
	public List<Allergy> getAllergy() {
		return allergy;
	}
	public void setAllergy(List<Allergy> allergy) {
		this.allergy = allergy;
	}
	public List<Disease> getDisease() {
		return disease;
	}
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	public List<Medication> getMedication() {
		return medication;
	}
	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}
	public Temprature getTemprature() {
		return temprature;
	}
	public void setTemprature(Temprature temprature) {
		this.temprature = temprature;
	}
	public Date getLastSeen() {
		return lastSeen;
	}
	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	public boolean hasFever() {
		return temprature.getTemperature() > 38;
	}
	
	public String getAllAllergies() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < allergy.size(); i++) {
			sb.append(allergy.get(i).getName() + " ");
			sb.append(allergy.get(i).getSeverity());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public String getAllDisease() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < disease.size(); i++) {
			sb.append(disease.get(i).getName() + " ");
			sb.append("\n");
		}
		return sb.toString();
	}
	
	 public String getFullMedicines(){
	        String medicines = String.format("%s has the next medicines: ", this.getName());

	        for (int i = 0; i < medication.size(); i++) {
	            final String medicine;
	            if (this.getMedication().get(i).getEnd() != null) {
	                medicine = String.format("%s from %s to %s.",
	                        this.getMedication().get(i).getName(),
	                        this.getMedication().get(i).getStart(),
	                        this.getMedication().get(i).getEnd()
	                );
	            } else {
	                medicine = String.format("%s since %s.",
	                        this.getMedication().get(i).getName(),
	                        this.getMedication().get(i).getStart()
	                );
	            }
	            medicines += medicine + "\n";
	        }

	        return medicines;
	    }

	
	
	
}
