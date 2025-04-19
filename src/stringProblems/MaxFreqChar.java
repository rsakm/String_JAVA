package stringProblems;

import java.util.Scanner;

public class MaxFreqChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = s.nextLine();
        System.out.println("Maximum occurring character is : "+maxFreqChar(str));

    }
    public static char maxFreqChar(String str){
        int[] charArry = new int[256];
        int n = str.length();
        for (int i = 0;i<n;i++){
            charArry[str.charAt(i)]++;
        }


        char c = ' ';
        int max = -1;
        for (int i =0;i<n;i++){
            if (max < charArry[str.charAt(i)]){
                max = charArry[str.charAt(i)];
                c= str.charAt(i);
            }
        }
        return c;
    }
}
