

public class Main {

    public static void main (String[] args) {
        String input1 = "What is Recursion?\n" +
                "The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called as recursive function. Using recursive algorithm, certain problems can be solved quite easily. Examples of such problems are Towers of Hanoi (TOH), Inorder/Preorder/Postorder Tree Traversals, DFS of Graph, etc.\n" +
                "\n" +
                "What is base condition in recursion?\n" +
                "In recursive program, the solution to base case is provided and solution of bigger problem is expressed in terms of smaller problems.";

        System.out.println("Recursive out: " + recursiveVowels(input1));
        System.out.println("For loop out: " + forVowels(input1));
    }

    private static int recursiveVowels(String text) {
        char firstChar;

        int temp = text.length();
        text = text.toLowerCase();
        if (text.length() < 1) {
            return 0;
        }
        else {
            firstChar = text.charAt(0);
        }

        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            return recursiveVowels(text.substring(1)) + 1;
        }
        else {
            return recursiveVowels(text.substring(1));
        }
    }

    private static int forVowels(String text) {
        int temp = 0;
        String firstCahr;
        text = text.toLowerCase();
        for(int x=0; x < text.length(); x++) {
            firstCahr = text.substring(x, x+1);
            if(firstCahr.equals("a") || firstCahr.equals("e") || firstCahr.equals("i") || firstCahr.equals("o") || firstCahr.equals("u")) {
                temp++;
            }
        }
        return temp;
    }
}

