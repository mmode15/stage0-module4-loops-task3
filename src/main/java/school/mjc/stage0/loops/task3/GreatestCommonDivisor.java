package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = first > second ? second : first;
        if (first == 0 || second == 0 ){
            System.out.println(first == 0 ? second : first);
        }else {
            for (int i = min; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
