Source files are in the `src` folder.


# Algorithm: 
1. Take input from user.
2. Create a new BracketsChecker object.
    - Initialized by converting the string to a list of String items
3. checkBrackets()


##checkBrackets() alg:

> For each string item in bString
>   If the string item is a bracket:
>   create a node of the item's content and index
>        get the string's closing bracket
>        if the bracket is an opening bracket:
>            push to stack
>        else:
>            if stack is empty or brackets don't match:
>                print the index of the current item of the unmatched/mismatched closing bracket

>If the stack is empty:
>    print success
>else:
>    print the index of the first unmatched opening bracket by popping out all the other brackets from the stack until one is left.

=