import java.util.ArrayList;

public class DemoLambda {
    public static void Run() {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(3);
        a.add(2);
        a.add(45);

        a.forEach( (n) -> {
            System.out.printf("N=%d...", n);
        });
    }
}
