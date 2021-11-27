import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] myArray = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            myArray[i] = scanner.nextInt();
        }



        for (int i = myArray.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {

                //1.a = a+b
                //2.b = a-b
                //3.a = a-b
                myArray[0] = myArray[0] + myArray[1];
                myArray[1] = myArray[0] - myArray[1];
                myArray[0] = myArray[0] - myArray[1];

                myArray[2] = myArray[2] + myArray[3];
                myArray[3] = myArray[2] - myArray[3];
                myArray[2] = myArray[2] - myArray[3];

                myArray[4] = myArray[4] + myArray[5];
                myArray[5] = myArray[4] - myArray[5];
                myArray[4] = myArray[4] - myArray[5];

                myArray[6] = myArray[6] + myArray[7];
                myArray[7] = myArray[6] - myArray[7];
                myArray[6] = myArray[6] - myArray[7];

                myArray[8] = myArray[8] + myArray[9];
                myArray[9] = myArray[8] - myArray[9];
                myArray[8] = myArray[8] - myArray[9];
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

}
