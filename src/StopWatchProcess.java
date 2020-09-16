import java.sql.Array;
import java.util.Random;

public class StopWatchProcess {
    public static void main(String[] args) {
        Random random = new Random();
        int[] inputArray = new int[100000];
        StopWatch stopWatch = new StopWatch();

        for (int i = 0; i < 100000; i++) {
            inputArray[i] = random.nextInt();
        }

        stopWatch.setStartTime();
        for (int i = 0; i < inputArray.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[indexMin]){
                    indexMin = j;
                }
            }
            if (indexMin != i){
                int temp = inputArray[indexMin];
                inputArray[indexMin] = inputArray[i];
                inputArray[i] = temp;
            }
        }
        stopWatch.setEndTime();
        System.out.print(stopWatch.getElapesdTime());
    }
}