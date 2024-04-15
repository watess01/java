package prep.modules.threads;

public class Test implements Runnable{
    private final String _title;
    private final int _delay;
    private final int _count;
    public static void main(String[] args){

        System.out.print("\033[H\033[2J");
        System.out.flush();
        Test test1 = new Test("My Lovely Horse", 1000, 3);
        Test test2 = new Test("Cup of Tea", 100, 30);
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);

        thread1.start();
        thread2.start();

        System.out.println("Main thread...");

    }

    public Test(String title, int delay, int count) {
        _title = title;
        _delay = delay;
        _count = count;
        System.out.printf("Create thread '%s'...\n", title);
    }

    @Override
    public void run() {
        for(int i=0;i<_count;i++) {
            System.out.printf("[%s] iteration %d, wait %d second\n", _title, i, _delay);
            try {
                Thread.sleep(_delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.printf("[%s] Done!\n", _title);
    }
}
