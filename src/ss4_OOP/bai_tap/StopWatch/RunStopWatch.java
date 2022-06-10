package ss4_OOP.bai_tap.StopWatch;

public class RunStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch1 = new StopWatch();
        stopWatch1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        stopWatch1.stop();

        System.out.println(stopWatch1.getElapsedTime());


    }
}
