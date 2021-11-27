import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by gerganastoeva on 10/25/17.
 */

    public class l4T3HashMup {

    public static void main(String[] args) {
        Map<Long, String> dataList = new HashMap<Long, String>(5);
        Scanner s = new Scanner(System.in);

        String name = null;
        long id = (long) 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter ID: ");
            id = Long.valueOf(s.next());
            System.out.println("Enter Name: ");
            name = s.next();
            String map = dataList.put(id, name);

        }

        dataList.forEach((k, v) -> System.out.println("ID: " + k + " Name:" + v));

        System.out.println("Enter ID to Search: ");
        Long idSearch = Long.valueOf(s.next());


        if(dataList.containsKey(idSearch)) {
            System.out.println("ID found. Name is: " + dataList.get(idSearch)); 

        }else{
            System.out.println("Not found");
        }
    }
}

