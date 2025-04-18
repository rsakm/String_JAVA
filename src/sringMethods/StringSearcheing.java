package sringMethods;

public class StringSearcheing {
    public static void main(String[] args) {
        String name = "Rajshree";

//        // index of specifiec cha(s)

        System.out.println(name.indexOf("sh"));   ////3
        System.out.println(name.indexOf('p'));   /// p is not in name, so -1 is returned

        System.out.println(name.lastIndexOf('e'));
        System.out.println(name.lastIndexOf('p'));


//// search for  specific char(s)
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(8));    //// StringIndexOutOfBound Exception


        System.out.println(name.contains("sh"));
//        System.out.println(name.contains('r'));   /////cannot appplied to char
        System.out.println(name.contains("r"));


        System.out.println(name.startsWith("R"));

        System.out.println(name.endsWith("ree"));


    }
}
