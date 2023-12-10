package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int bigger = first > second ? first : second;
        System.out.println(bigger > third ? bigger : third);
    }
}
