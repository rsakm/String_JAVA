package stringProblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        if(str.equals(reverseString(str))){
            System.out.println("Given String is a palindrome.");
        }else
            System.out.println("String is not a palindrome");
    }
    public static String reverseString(String str){
        int n = str.length();
        String rev = "";
        for (int i = n-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return  rev;
    }
}
