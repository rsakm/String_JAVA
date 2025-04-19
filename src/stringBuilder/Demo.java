package stringBuilder;

public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

//        All tge methods and constructors are same as in StringBuffer class.
//        The only difference is that the methods in StringBuilder class are non-synchronized which increases the performance unlike in StringBuffer Class.
    }
}
