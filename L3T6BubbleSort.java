import java.util.Scanner;

public class L3T6BubbleSort {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please insert array's size: ");

    int n = scanner.nextInt();
    int [] myArray = new int [n];



    for (int i = 0; i < n; i++){
        System.out.printf("Element %d: ", i + 1);
        myArray[i] = scanner.nextInt();
    }

    for (int i = myArray.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

}