import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		Address addressA = new Address("United State", "New York", "344 Road", 012);
		Person a = new Person("AA", 50, addressA);
		List<Allergy> allergyList = new ArrayList<>();
		allergyList.add(new Allergy("aaa", Severity.HIGH));
		allergyList.add(new Allergy("bbb", Severity.LOW));
		List<Disease> diseaseList = new ArrayList<>();
		diseaseList.add(new Disease("AAA"));
		diseaseList.add(new Disease("BBB"));
		Patient p = new Patient("AA", 50, addressA, allergyList, diseaseList);
		System.out.println("Patient Name : " + p.getName());
		System.out.println("This Patient Allergy info:");
		System.out.println(p.getAllAllergies());	
		System.out.println("THis Patient Disease info:");
		System.out.println(p.getAllDisease());
		
	}
}
