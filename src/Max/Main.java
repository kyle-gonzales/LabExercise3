package Max;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        try (//* main function
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of operations: ");
            int operationsCount = sc.nextInt();

            String[] operations = new String[operationsCount];

            
            int j = 0;

            while (j != operationsCount) {
                System.out.println("enter operation: ");
                operations[j] = sc.nextLine();
                j++;
            }
            // for (int i = 0; i < operationsCount; i++) {
            //     System.out.println("enter operation: ");
            //     operations[i] = sc.nextLine();
            // }

            for (int i = 0; i < operationsCount; i++) {
                if (operations[i].equals("pop")) {
                    s.pop();
                } else if (operations[i].equals("max")) {
                    System.out.println(s.max());
                } else if (operations[i].substring(0, 4).equals("push")) {
                    int elem = operations[i].charAt(operationsCount - 1);
                    System.out.println("The elem is: " + elem);
                } else {
                    System.out.println("Error: Invalid operation");
                    break;
                }
            }
        }



        
    }
}