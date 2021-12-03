import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();

            BracketsChecker b = new BracketsChecker(input);
            b.checkBrackets();

        }

    }
}

/**
 * This is additional text.
 * implement a stack
 * - each element in the stack should hold the bracket character and the index
 * of the bracket
 * 
 ** opening BracketsChecker should be matched with the correct closing
 * BracketsChecker to be popped from the stack
 * 
 * 
 * pushing to empty stack:
 * if closing bracket:
 * return index of closing bracket;
 * 
 * pushing opening bracket to stack:
 * continue;
 * 
 * pushing closing bracket to stack:
 * if top (opening bracket) != new_top (closing bracket):
 * return index of new_top
 * if top (opening bracket) == new_top (closing bracket):
 * pop and pop again
 * 
 * 
 * by the end of the loop
 * if stack is empty
 * output Success
 * else:
 * pop the top until top == bottom //* getting the first unmatched opening
 * bracket
 * return index of top
 */

/**
 * convert string input to char array to int array
 * sort int array
 * counts of 41 and 43, 91 and 93, 123 and 125 should match
 */

/*
 * 40 - (
 * 41 - )
 * 91 - [
 * 93 - ]
 * 123- {
 * 125- }
 */
