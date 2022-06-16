package fastrack.com.Exercise3;

public class Animals implements Interface{
    String walk;
    String talk;
    String eat;
    public Animals(String walk, String eat, String talk){
        this.walk=walk;
        this.eat=eat;
        this.talk=talk;
    }

    @Override
    public String walk() {
        return walk;
    }

    @Override
    public String eat() {
        return eat;
    }

    @Override
    public String talk() {
        return eat;
    }
}
