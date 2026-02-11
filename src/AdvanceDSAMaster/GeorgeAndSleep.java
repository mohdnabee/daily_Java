package AdvanceDSAMaster;

import java.util.Scanner;

public class GeorgeAndSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read current time
        String s = sc.nextLine();   // wake up time
        String t = sc.nextLine();   // sleep duration

        // Split hours and minutes
        String[] current = s.split(":");
        String[] sleep = t.split(":");

        int currentHour = Integer.parseInt(current[0]);
        int currentMin = Integer.parseInt(current[1]);

        int sleepHour = Integer.parseInt(sleep[0]);
        int sleepMin = Integer.parseInt(sleep[1]);

        // Convert everything to minutes
        int currentTotal = currentHour * 60 + currentMin;
        int sleepTotal = sleepHour * 60 + sleepMin;

        // Subtract sleep duration
        int bedTotal = currentTotal - sleepTotal;

        // If negative, add 24 hours (1440 minutes)
        if (bedTotal < 0) {
            bedTotal += 24 * 60;
        }

        // Convert back to hours and minutes
        int bedHour = bedTotal / 60;
        int bedMin = bedTotal % 60;

        // Print in hh:mm format
        System.out.printf("%02d:%02d\n", bedHour, bedMin);

        sc.close();
    }
}
