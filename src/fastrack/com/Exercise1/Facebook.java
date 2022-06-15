package fastrack.com.Exercise1;

public class Facebook implements Interfaces{
    private final String NAME="Facebook";
    private String textul="Sapunul duru cel mai bun..";
    @Override

    public String textulreclamei() {
        return textul;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
