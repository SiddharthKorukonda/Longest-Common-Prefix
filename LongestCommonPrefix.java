/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 2
   Question 3 (LongestCommonPrefix.java)
 */

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = s.nextLine();
        System.out.print("Enter the second string: ");
        String second = s.nextLine();

        int lengthFirst = first.length();
        int lengthSecond = second.length();

        String common = "";

        if (lengthFirst<=lengthSecond) {
            for (int i=0; i<lengthFirst; i++) {
                if (first.charAt(i)!=second.charAt(i)) {
                    break;
                }
                else {
                    common+=first.charAt(i);
                }
            }
        }
        else {
            for (int i=0; i<lengthSecond; i++) {
                if (first.charAt(i)!=second.charAt(i)) {
                    break;
                }
                else {
                    common+=second.charAt(i);
                }
            }
        }
        if (common.equals("")) {
            System.out.print(first+" and "+second+" have no common prefix");
        }
        else {
            System.out.print("The common prefix is: "+common);
        }
    }
}
