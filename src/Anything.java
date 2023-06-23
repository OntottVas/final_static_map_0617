import java.util.HashSet;
import java.util.Set;

public class Anything {

    static Set<String> names = new HashSet<>();

    public static void main(String[] args) {
        Example example = new Example();
        example.printOut();

        Coffee cohee = new Coffee("Arabica", 10, "blonde");

        Coffee coheee = new Coffee("Robusta", 8, "dark");


        System.out.println(Coffee.getCounter());
    }
}