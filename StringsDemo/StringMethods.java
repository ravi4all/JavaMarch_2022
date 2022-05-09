package StringsDemo;

public class StringMethods {
    public static void main(String[] args) {
        String str = "hello how are you ?";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.indexOf('a'));   // by default start searching from zero
        System.out.println(str.indexOf('a',12));
        // will return -1 if character not found

        System.out.println(str.length());
        System.out.println(str.replace("h", "b"));
        // System.out.println(str.replaceAll("[a-f]", "o"));
        System.out.println(str.replaceAll("^h\\w+", " "));
        System.out.println(str.substring(4,8));
        System.out.println(str.contains("?"));

        String res[] = str.split(" ");
        for(String s : res) {
            System.out.print(s + ", ");
        }
        System.out.println();

        String str_1 = "    hello how are you ?   ";
        System.out.println(str_1.trim());   // remove leading and trailing spaces

        System.out.println(str.startsWith("h"));
        System.out.println(str.endsWith("."));
    }
}
