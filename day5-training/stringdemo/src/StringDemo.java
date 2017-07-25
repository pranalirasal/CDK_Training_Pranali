/**
 * Created by rasalp on 7/22/2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        String name = new String("Hello");
//        String str2 = new String("Hello");

        String name1 = name.intern();
        String name2 = "Hello";

        System.out.println(name == name1);
        System.out.println(name1 == name2);
        System.out.println(name == name2);
        /*
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(str.hashCode() == str2.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str == str2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());*/
    }
}
