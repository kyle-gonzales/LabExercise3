Source files are in the `src` folder.


# Algorithm: 
1. Take input from user.
2. Create a new BracketsChecker object.
    - Initialized by converting the string to a list of String items
3. checkBrackets()


##checkBrackets() alg:

&lt;p&gt; For each string item in bString
&lt;p&gt;   If the string item is a bracket:
&lt;p&gt;   create a node of the item's content and index
&lt;p&gt;        get the string's closing bracket
&lt;p&gt;        if the bracket is an opening bracket:
&lt;p&gt;            push to stack
&lt;p&gt;        else:
&lt;p&gt;            if stack is empty or brackets don't match:
&lt;p&gt;                print the index of the current item of the unmatched/mismatched closing bracket

>If the stack is empty:
>    print success
>else:
>    print the index of the first unmatched opening bracket by popping out all the other brackets from the stack until one is left.