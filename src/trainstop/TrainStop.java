
package trainstop;

public class TrainStop {

   
    public static void main(String[] args) {
       
        int totalDistance = 10000; // in km
        int passengerStopDistance = 150; // in km
        int refuelStopDistance = 200; // in km

        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;

        int totalStops = passengerStops + refuelStops;

        System.out.println("The train should stop " + totalStops + " times from Kampala to Jinja.");
    }
}

    
        
    

