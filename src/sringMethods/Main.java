package sringMethods;

public class Main {
    public static void main(String[] args) {
        String name = "Rajshree";
        System.out.println(name.length());  /// returns integer

        String str = null;
//        System.out.println(str.length());    /// Exception in thread "main" java.lang.NullPointerException
////        at sringMethods.Main.main(Main.java:9)

        String s = "";
        System.out.println(s.isEmpty());

//        str.isEmpty();   ////Exception in thread "main" java.lang.NullPointerException
//        at sringMethods.Main.main(Main.java:15)

/*

* length() and isEmpty() methods return NullPointerException when the value of string is null
*
*  */

        String s2 = "   abc   def    ";
        System.out.println(s2);
        System.out.println(s2.trim());
        System.out.println(s2.trim().length());
        String s3 = "      ";
        if(s3.trim().isEmpty()){
            System.out.println("s3 is empty");
        }else{
            System.out.println("Not empty");
        }


//        // String comparisions
        
        String s4 = "rajshree";
        System.out.println(name.equals(s4));
        System.out.println(name.equals("Rajshree"));
        String nam = "Rajshree";
        System.out.println(name.equals(nam));


        System.out.println(name.equalsIgnoreCase(s4));


        String a = "a";
        String b = "A";
        System.out.println(a.compareTo(b));   /// 32
        System.out.println(a.compareToIgnoreCase(b));   /// 0


        String c = "abc";
        String d = "Ang";
        System.out.println(c.compareTo(d));   //32
        System.out.println(c.compareToIgnoreCase(d));  //-12
        System.out.println(c.compareToIgnoreCase("Abd"));

//        // String addition and joining
        System.out.println(c+d);
        System.out.println(c+10+20);
        System.out.println(10+20+c);
        System.out.println(c+10/2);
//        System.out.println(c+10-2);    //// Error as c+10 gives abc10 (a string) and string minus is not valid


//        // concat
        System.out.println(c.concat(d));


//        // join
        System.out.println(String.join(",",c,d));
        String title = "Maurya";
        System.out.println(String.join(" ",name,title));
        System.out.println(String.join(";", c,d));
        System.out.println(String.join(",",c,null));
        System.out.println(String.join("null",c,d));  //// abcnullAng
//        System.out.println(String.join(null,c,d));    //// Exception thrown   java.lang.NullPointerException


//        // subSequence and substring
        String string = "this is demo";
        System.out.println(string.subSequence(3,9));  /// returns CharSequence

        System.out.println(string.substring(3));   /// returns String
        System.out.println(string.substring(3,9));            /// returns String
        System.out.println(string.substring(3,-1));    ////Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -4
        System.out.println(string.substring(0,0));   /// no output

    }
}
