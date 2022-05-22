import java.sql.Struct;
import java.util.Scanner;

public class LongestCommonPrefix {
    // Given the array of strings A, you need to find the longest string S which is the prefix of ALL the strings in the array.

    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        String[] array = new String[n];


        for (int i = 0; i < n; i++) array[i] = s1.next();


        String x = commonPrefix(array, n);

        System.out.println(x);
    }

    private static String commonPrefix(String[] arr, int n) {

            String prefix = arr[0];
            for(int i=1; i<n; i++){
                prefix = compare(prefix,arr[i]);
            }
            return prefix;
    }

    private static String compare(String prefix, String s) {
        String res ="";
        for (int i=0, j=0; i<prefix.length() && j<s.length(); i++, j++){
            if(prefix.charAt(i) != s.charAt(j)){
                break;
            }
            res+=prefix.charAt(i);
        }

        return res;
    }

}

/*
    How To Solve Any Programming Problem In 10 Steps :raised_hands:

        1.  Read the problem at least three times (or however many makes you feel comfortable)
            You can’t solve a problem you don’t understand.
            There is a difference between the problem and the problem you think you are solving.
            It’s easy to start reading the first few lines in a problem and assume the rest of it because it’s similar to something you’ve seen in the past.
            If you are making even a popular game like Hangman, be sure to read through any rules even if you’ve played it before.

        2.  Work through the problem manually with at least three sets of sample data
            Take out a piece of paper and work through the problem manually.
            Think of at least three sets of sample data you can use.

        3. Simplify and optimize your steps
            Look for patterns and see if there’s anything you can generalize.
            See if you can reduce any steps or if you are repeating any steps.

        4. Write pseudocode
            Even after you’ve worked out general steps, writing out pseudocode that you can translate into code will help with defining the structure of your code and make coding a lot easier.
            Write pseudocode line by line.
            You can do this either on paper or as comments in your code editor.
            If you’re starting out and find blank screens to be daunting or distracting, I recommend doing it on paper.
            Don’t get caught up with the syntax.
            Focus on the logic and steps.

        5. Translate pseudocode into code and debug
            When you have your pseudocode ready, translate each line into real code in the language you are working on.

        6. Simplify and optimize your code
            You’ve probably noticed by now that simplifying and optimizing are recurring themes.
            Simplifying and optimizing your code may require you to iterate a few times.

        7. Debug
            This step really should be throughout the process.
            Debugging throughout will help you catch any syntax errors or gaps in logic sooner rather than later.
            Take advantage of your Integrated Development Environment (IDE) and debugger.

        8. Write useful comments
            You may not always remember what every single line meant a month later.
            And someone else working on your code may not know either.
            That’s why it’s important to write useful comments to avoid problems and save time later on if you need to come back to it.

        9. Get feedback through code reviews
            Get feedback from your teammates, Mentors and other developers.
            Check out Stack Overflow. See how others tackled the problem and learn from them.
            There are sometimes several ways to approach a problem.
            Find out what they are and you’ll get better and quicker at coming up with them yourself.

        10. Practice, practice, practice
            Even experienced developers are always practicing and learning.
            If you get helpful feedback, implement it. Redo a problem or do similar problems.
            Keep pushing yourself. With each problem you solve, the better a developer you become.
            Celebrate each success and be sure to remember how far you’ve come.
            Remember that programming, like with anything, comes easier and more naturally with time.
*/
