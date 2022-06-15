package fastrack.com.Exercise1;

public class Email implements Interfaces {
    private final String NAME="Email";
    private String textul="Ati primit un mail cu cel mai bun sapun, sapunul Duru";
    @Override

    public String textulreclamei() {
        return textul;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
