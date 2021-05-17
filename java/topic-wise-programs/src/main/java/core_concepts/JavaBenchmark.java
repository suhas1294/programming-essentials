package core_concepts;

public class JavaBenchmark {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 20; i++) {
            System.out.println("h");
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        double elapsedTimeInSecond = (double) totalTime / 1_000_000;
        System.out.println(elapsedTimeInSecond);
    }
}
