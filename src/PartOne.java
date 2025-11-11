import java.util.Random;

public class PartOne {
    public static void main(String[] args) {
        int [] dataPoints = new int [100];
        Random random = new Random();

        //Assigning random num 1-10 to the array
        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = random.nextInt(100) + 1;
        }
    }

}
