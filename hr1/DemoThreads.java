import java.util.concurrent.TimeUnit;

public class DemoThreads extends Thread
{
    private final String _name;
    public DemoThreads(String name){
        _name = name;
    }
    public void run () {
        System.out.printf("Demo - ThreadTester: This code is running in thread %s...", _name);
    }

    public static void Run(String name, int time){
        DemoThreads _instance = new DemoThreads(name);
        try {
            _instance.start();
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.printf("ThreadTester: thread %s ends!", _instance._name);
            _instance.interrupt();
        }
    }
}
