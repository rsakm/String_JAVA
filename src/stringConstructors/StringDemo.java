package stringConstructors;
import java.lang.String;
public class StringDemo {
    public static void main(String[] args) {

//        no argument constructor
        String s1 = new String();
        System.out.println(s1.length());

//        String literal constructor
        String s2 = new String("Rajshree");

//        StringBuffer constructor
        StringBuffer sb = new StringBuffer("Rajshree");
        String s3 = new String(sb);
        System.out.println(s3);

//        StringBuilder constructor
        StringBuilder sb1 = new StringBuilder("Rajshree");  /// mutable object
        String s4 = new String(sb1);                        /// immutable object
        System.out.println(s4);

//        byte array constructor
        byte[] b = {101,102,103};
        String s5 = new String(b);
        System.out.println(s5);  /// byte to char --- 101->e, 102->g, 103->g :    efg

//        char array constructor
        char[] ch = {'r','a','j'};
        String s6 = new String(ch);
        System.out.println(s6);

    }
}
