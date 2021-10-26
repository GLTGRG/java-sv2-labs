package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String s = "" + "";
        System.out.println(s);
        System.out.println(s.length());

        String abcde = "Abcde";
        System.out.println(abcde.length());
        System.out.println(abcde.charAt(0) + " " + abcde.charAt(2));
        System.out.println(abcde.substring(0, 2));
    }
}
