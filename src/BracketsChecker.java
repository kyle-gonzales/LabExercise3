public class BracketsChecker {
    private Stack<Node> bStack = new Stack<>();
    private String[] bString;
    String[] BracketsChecker = { "[", "]", "(", ")", "{", "}" };

    BracketsChecker() {

    }

    BracketsChecker(String str) {
        bString = new String[str.length()];
        bString = str.split("");
    }

    public void checkBrackets() {
        for (int i = 0; i < bString.length; i++) {
            if (isBracket(bString[i])) {
                Node node = new Node(bString[i], i + 1);
                String reverse = getClosing(node.bracket);

                if (isOpening(node.bracket)) {
                    bStack.push(node);
                } else {
                    if (bStack.isEmpty() || (!isMatching(bStack.pop().bracket, reverse))) {
                        System.out.println(node.index);
                        return;
                    }
                }
            }
    }
        if (bStack.isEmpty()) {
            System.out.println("Success");
        } else { //* return index of unmatched BracketsChecker
            Node n = new Node();
            while (bStack.size() != 1) {
                bStack.pop();
            }
            n = bStack.pop();
            System.out.println(n.index);
        }
    }

    //Helper Functions

    private boolean isBracket(String b) {
        for (String i : BracketsChecker) {
            if (b.equals(i))
                return true;
        }
        return false;
    }

    private boolean isOpening(String b) { //opening BracketsChecker are placed in even indices
        return indexOf(b) % 2 == 0;
    }

    private boolean isMatching(String c, String reverse) {
        if (c.equals(BracketsChecker[0]) && reverse.equals(BracketsChecker[1])) {
            return true;
        } else if (c.equals(BracketsChecker[2]) && reverse.equals(BracketsChecker[3])) {
            return true;
        } else if (c.equals(BracketsChecker[4]) && reverse.equals(BracketsChecker[5])) {
            return true;
        }
        return false;

    }

    private int indexOf(String c) {
        int index = -1;
        for (int i = 0; i < BracketsChecker.length; i++) {
            if (c.equals(BracketsChecker[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    private String getClosing(String c) {
        if (isOpening(c))
            return BracketsChecker[indexOf(c) + 1]; // closing BracketsChecker are adjacent to their respective opening BracketsChecker
        return BracketsChecker[indexOf(c)];
    }


}
