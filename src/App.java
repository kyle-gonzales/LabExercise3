
public class App {
    public static void main(String[] args) throws Exception {
        

        String str = "Hello world!";

        char[] chars = str.toCharArray();

        int[] str_ascii = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            str_ascii[i] = (int) chars[i];            
        }

        for (int i : str_ascii) {
            System.out.println(i);
        }
    }
}

/**
 * implement a stack
 *      - each element in the stack should hold the bracket character and the index of the bracket
 * 
 ** opening brackets should be matched with the correct closing brackets to be popped from the stack
 * 
 * 
 * pushing to empty stack: 
 *      if closing bracket:
 *          return index of closing bracket;
 * 
 * pushing opening bracket to stack:
 *      continue;
 * 
 * pushing closing bracket to stack:
 *      if top (opening bracket) != new_top (closing bracket):
 *          return index of new_top
 *      if top (opening bracket) == new_top (closing bracket):
 *          pop and pop again
 *      
 * 
 * by the end of the loop
 *      if stack is empty
 *          output Success
 *      else:
 *          pop the top until top == bottom //* getting the first unmatched opening bracket
 *          return index of top
 */

/**
 * convert string input to char array to int array
 * sort int array
 * counts of 41 and 43, 91 and 93, 123 and 125 should match
 */

/*
40 - (
41 - )
91 - [
93 - ]
123- {
125- }
*/
