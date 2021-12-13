package Max;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();


        try (//* main function5

        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of operations: ");
            int operationsCount = sc.nextInt();
            String a = sc.nextLine(); //garbage variable
            a = null;
            String[] operations = new String[operationsCount];
            
            int j = 0;

            while (j != operationsCount) {
                System.out.println("enter operation: ");
                operations[j] = sc.nextLine();
                j++;
            }

            for (int i = 0; i < operationsCount; i++) {
                if (operations[i].equals("pop")) {
                    s.pop();
                } else if (operations[i].equals("max")) {
                    System.out.println(s.max());
                } else if (operations[i].length() > 4 && operations[i].substring(0, 4).equals("push")) {
                    // System.out.println("the operation is: " + operations[i]);
                    char elem = operations[i].charAt(operations[i].length() - 1);
                    int num = Character.getNumericValue(elem);
                    System.out.println("The elem is: " + num);
                    s.push(num);
                } else {
                    System.out.println("Error: Invalid operation at index: " + i);
                    break;
                }
            }
        }
        
    }
    
}