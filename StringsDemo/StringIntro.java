package StringsDemo;

public class StringIntro {
    public static void main(String[] args) {
        String str = "Ravi";
        String str_2 = str;
        String str_3 = "Ravi";

        // System.out.println(str.equals(str_2));
        // System.out.println(str.equals(str_3));

        // System.out.println(str == str_2);
        // System.out.println(str == str_3);

        String str_4 = new String("Ravi");
        System.out.println(str == str_4);       // false - because here it is comparing reference
        System.out.println(str.equals(str_4));  // true - here it is comparing values

        // Strings are immutable
        String t = "hello";
        t = "hi";
        System.out.println("T is : " + t);

        // StringBuffer / StringBuilder
        // StringBuffer will create array of 16 size
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity() + " : " + sb.length());
        sb.append("Hello..");
        System.out.println(sb.capacity() + " : " + sb.length());
        sb.append("How are you ?");
        System.out.println(sb.capacity() + " : " + sb.length());
        // formula = old_capacity(16) * 2 + 2
        // +2 - null character
        sb.append("so this is the java string buffer demo...!!!!!!!!!!!!");
        System.out.println(sb.capacity() + " : " + sb.length());
    }
}
