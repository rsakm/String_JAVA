package stringProblems;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.nextLine();

        String rev = "";
        int n = str.length();
        for (int i = n-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("Reversed String is: "+rev);
    }
}
