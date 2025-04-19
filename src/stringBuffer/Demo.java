package stringBuffer;

public class Demo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("rajshree");
        System.out.println(sb1.capacity());   //// 16 + length of string

        StringBuffer sb2 = new StringBuffer(100);
        System.out.println(sb2.capacity());


        sb.append(" maurya");
        System.out.println(sb.capacity());
        System.out.println(sb);

        sb.append(" Rajshree Maurya ");
        System.out.println(sb);
        System.out.println(sb.capacity());

        System.out.println(sb1.length());


//        // methods of StringBuffer

        System.out.println(sb1.append(" maurya"));
        System.out.println(sb1.charAt(4));
        System.out.println(sb.delete(0,8));

        StringBuffer s = new StringBuffer("rajshree");
        StringBuffer sb3 = new StringBuffer("rajshree");
        System.out.println(s.equals(sb3));

        StringBuffer sb4 = s.append(" maruya");
        System.out.println(s.equals(sb4));

        System.out.println(sb1.insert(2,"aaaaa"));
        System.out.println(sb1);

        System.out.println(sb3.replace(2,6,"Taj"));

//        subSequence()
//        substring()
//        ensureCapacity()
//        trimToSize()

    }
}
