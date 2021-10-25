import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args){


        int maxHeartRate = 220;

        Scanner age = new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge = age.nextInt();

        int heartRate = maxHeartRate - userAge;
        int hrTargetZone1 = heartRate / 2;
        int hrTargetZone2 = (int)(Math.round(heartRate * 0.85));

        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + hrTargetZone1 + " - " + hrTargetZone2 + " beats per minute");
    }
}
