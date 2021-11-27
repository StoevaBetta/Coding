import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMAp {
    public static void main(String[] args) {
        Map<Long, String> PersonalData = new HashMap<Long, String>(5);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please, enter ID: ");
        long id = Long.valueOf(scanner.next());

        System.out.println("Please, enter name: ");
        String name = scanner.next();



        PersonalData.put(id, name);


        if (PersonalData.containsKey(id)) {
            System.out.println(PersonalData.get(id));
        }

    }
}
