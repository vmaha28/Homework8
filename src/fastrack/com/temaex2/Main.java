package fastrack.com.temaex2;

public class Main {
    public static void main(String[] args) {
        Buquet buquet1 = new Buquet();
        buquet1.add("Gardenia");
        buquet1.add("Rose");
        buquet1.add("Iris");
        buquet1.add("Lavender");
        buquet1.add("Forget-me-not");
        buquet1.add("Lilly");

        buquet1.remove("Rose");
        System.out.println(buquet1.getAll());
    }
}
