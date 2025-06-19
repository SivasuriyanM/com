package interview.application;

import java.util.Scanner;

public class TrafficSignalJourney {
	
    private static int[] getTravelTimeBetweenSignals(int numSignals, boolean sameTravelTime) {
       
    	Scanner sc = new Scanner(System.in);
    	int [] arr = new int[numSignals+1];
    	
        int totalTravelTime = 0;
        if (sameTravelTime) {
        	
            System.out.print("Enter the travel time between all signals (in minutes): ");
            int travelTime = sc.nextInt();
           for(int i =0; i<=arr.length; i++) {
        	   arr[i]=travelTime;         	   
           }
        } else {
            for (int i=0; i <= numSignals; i++) {
                System.out.print("Enter the travel time between Signal " + i + " and Signal " + (i + 1) + " (in minutes): ");
                int travelTime = sc.nextInt();
                arr[i] = travelTime;
            }
        }
        return arr;
    }
    
    private static int[] getSignalTypes(int numSignals, boolean sameSignalType) {
    	
        Scanner sc = new Scanner(System.in);
        int[] signalTypes = new int[numSignals];
        if (sameSignalType) {
            System.out.print("Enter the signal type for all intersections (2, 3, or 4): ");
            int signalType = sc.nextInt();
            for (int i = 0; i < numSignals; i++) {
                signalTypes[i] = signalType;
            }
        } else {
            for (int i = 0; i < numSignals; i++) {
                System.out.print("Enter the signal type for Signal " + (i + 1) + " (2, 3, or 4): ");
                signalTypes[i] = sc.nextInt();
            }
        }
        return signalTypes;
    }

    private static int calculateWaitingTime(int signalType, int arrivalTime,int signaltime) {
    	
        int cycleTime = signalType * signaltime; // 2-way: 10 sec, 3-way: 15 sec, 4-way: 20 sec
        
        int timeInCurrentCycle = arrivalTime % cycleTime;
        
        if (timeInCurrentCycle < signaltime ) {
            return 0; // Arrived during green signal
        } else {
            return cycleTime - timeInCurrentCycle; // Wait until next green
        }
    }

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of signals
        System.out.print("Enter the total number of signals: ");
        int numSignals = sc.nextInt();
        
        // Step 2: Input for travel time consistency
        System.out.print("Do all signals have the same travel time between them? (yes/no): ");
        String travelTimeInput = sc.next();
        boolean sameTravelTime = travelTimeInput.equalsIgnoreCase("yes");

        // Step 3: Input for signal type consistency
        System.out.print("Do all signals have the same signal type? (yes/no): ");
        String signalTypeInput = sc.next();
        boolean sameSignalType = signalTypeInput.equalsIgnoreCase("yes");

        // Step 4: Input for travel times between signals
        int totalTravelTime[] = getTravelTimeBetweenSignals(numSignals, sameTravelTime);

        // Step 5: Input for signal types
        int[] signalTypes = getSignalTypes(numSignals, sameSignalType);

        // Step 6: Input for signal cycle times
        System.out.print("Enter the time for each signal cycle to complete (in seconds): ");
        int signalTime = sc.
        		nextInt();

        // Step 7: Calculate total journey time including waiting time at signals
        int totalTime = 0; // Start with just the travel time
        int currentTime = 0; // Time since start of journey

        for (int i = 0; i < numSignals; i++) {
            currentTime = currentTime + totalTravelTime[i] ; // Assume fixed travel time of 5 seconds between signals (you can adjust this)
            int waitingTime = calculateWaitingTime(signalTypes[i], currentTime, signalTime);
            totalTime += waitingTime; // Add waiting time at each signal
            currentTime += waitingTime; // Update the current time
        }

        int tt = currentTime + totalTravelTime[totalTravelTime.length-1];
        
        // Step 8: Output total journey time
        System.out.println("The total journey time is: " + tt*60 + " seconds");
    }


}
