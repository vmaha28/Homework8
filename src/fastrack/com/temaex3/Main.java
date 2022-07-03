package fastrack.com.temaex3;

public class Main {
    public static void main(String[] args) {
        Company company=new Company();
        company.employ(new Person(25,"Ionel"),"welder");
        company.employ(new Person(25,"Vlad"),"plumber");
        company.employ(new Person(25,"Adrian"),"manager");
        System.out.println(company.getManager());
        company.fireByName("Adrian");
    }
}
