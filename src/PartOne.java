import java.util.Random;

public class PartOne {
    public static void main(String[] args) {
        int [] dataPoints = new int [100];
        Random random = new Random();
        int total = 0;
        int average;

        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = random.nextInt(100) + 1;
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        System.out.print("These are the random numbers: \n");
        for (int k = 0; k < dataPoints.length; k++){
            System.out.print(dataPoints[k] +" | ");
        }

        //Sum of all the elements in dataPoints
        for (int j = 0; j < dataPoints.length; j++){
            total += dataPoints [j];
            //Max value
            if (dataPoints[j] > max) {
                max = dataPoints[j];
            }
            //Min value
            if (dataPoints[j] < min) {
                min = dataPoints[j];
            }
        }
        average = total / 100;

        System.out.println("\nTotal: " + total);
        System.out.println("\nAverage: " + average);
        System.out.print("\nMax value: " + max);
        System.out.print("\nMin value: " + min);

    }

}
