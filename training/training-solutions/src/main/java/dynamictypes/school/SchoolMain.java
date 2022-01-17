package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {
        School school = new School("iskola", 12);
        School primary = new PrimarySchool("Szabó Pál téri", 8);
        School secondary = new SecondarySchool("Belvárosi iskola", 4);

        System.out.println(school);
        System.out.println(primary);
        System.out.println(secondary);
    }
}
