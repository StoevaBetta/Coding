import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Map<Long, String> studentsList = new HashMap<Long, String>(5);

		String name = "";
		Long id = (long) 0;

		Scanner s = new Scanner(System.in);

		while (true) {

			if (studentsList.size() > 4) {
				break;
			}

			System.out.println("Enter ID:");
			id = Long.valueOf(s.next());

			System.out.println("Enter name:");
			name = s.next();

			studentsList.put(id, name);
		}

		// print the hashtable data
		System.out.println("\nStudents list:\n");
		for (Long n : studentsList.keySet()) {
			System.out.println("Name:\t" + n + "\nID:\t" + studentsList.get(n) + "\n");
		}

		// for (Entry<Long, String> studentList : studentsList.entrySet()) {
		// System.out.printf("%d has ID %s%n", studentList.getValue(),
		// studentList.getKey());
		//}

		System.out.println("Enter new ID:");
		Long input = (long) 0;
		input = Long.valueOf(s.next());

		if (studentsList.containsKey(input)) {
			System.out.println(studentsList.get(input));
		}
	}
}
        
	
		
	
