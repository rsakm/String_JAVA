package sringMethods;

public class StringConversion {
    public static void main(String[] args) {
        String name = "Rajshree";

//        // case conversion
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

//        // Type Conversion
        int a = 20, b= 30;
        System.out.println(a+b);
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        System.out.println(s1+s2);

        char[] c = name.toCharArray();
        System.out.println(c);



    }
    
}
