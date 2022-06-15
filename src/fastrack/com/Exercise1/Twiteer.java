package fastrack.com.Exercise1;

public class Twiteer implements Interfaces{
    private final String NAME="Facebook";
    private String textul="Sapunul duru cel mai bun..bla bla bla";
    @Override

    public String textulreclamei() {
        return textul;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
