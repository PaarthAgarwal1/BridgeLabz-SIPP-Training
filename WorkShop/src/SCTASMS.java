import java.util.*;
import java.util.stream.*;
interface FareCalculator{
    double calculateFare(double distance);
}
interface EmergencyService{}
interface TransportService{
    String getServiceName();
    double getFare();
    String getRoute();
    int getDepartureTime();

    default void printServiceDetails(){
        System.out.println("Service: " + getServiceName() +
                " | Route: " + getRoute() +
                " | Departure: " + getDepartureTime() +
                " | Fare: " + getFare()
        );
    }
    static double calculateDistance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
}
class BusService implements TransportService{
    private double fare;
    private  String route;
    private  int departureTime;

    BusService(double fare,String route,int departureTime){
        this.fare=fare;
        this.route=route;
        this.departureTime=departureTime;
    }

    @Override
    public String getServiceName() {
        return "City Bus";
    }

    @Override
    public double getFare() {
        return fare;
    }

    @Override
    public String getRoute() {
        return route;
    }

    @Override
    public int getDepartureTime() {
        return departureTime;
    }
}

class MetroService implements TransportService{
    private double fare;
    private  String route;
    private  int departureTime;

    MetroService(double fare,String route,int departureTime){
        this.fare=fare;
        this.route=route;
        this.departureTime=departureTime;
    }

    @Override
    public String getServiceName() {
        return "City Metro";
    }

    @Override
    public double getFare() {
        return fare;
    }

    @Override
    public String getRoute() {
        return route;
    }

    @Override
    public int getDepartureTime() {
        return departureTime;
    }
}

class TaxiService implements TransportService{
    private double fare;
    private  String route;
    private  int departureTime;

    TaxiService(double fare,String route,int departureTime){
        this.fare=fare;
        this.route=route;
        this.departureTime=departureTime;
    }

    @Override
    public String getServiceName() {
        return "City Taxi";
    }

    @Override
    public double getFare() {
        return fare;
    }

    @Override
    public String getRoute() {
        return route;
    }

    @Override
    public int getDepartureTime() {
        return departureTime;
    }
}

class Ambulance implements TransportService,EmergencyService{
    private  String route;
    private  int departureTime;

    Ambulance(String route,int departureTime){
        this.route=route;
        this.departureTime=departureTime;
    }

    @Override
    public String getServiceName() {
        return "City Ambulance";
    }

    @Override
    public double getFare() {
        return 0.0;
    }

    @Override
    public String getRoute() {
        return route;
    }

    @Override
    public int getDepartureTime() {
        return departureTime;
    }
}

class Trip {
    private String passenger;
    private String route;
    private double fare;

    Trip(String passenger, String route, double fare) {
        this.passenger = passenger;
        this.route = route;
        this.fare = fare;
    }

    public String getPassenger() { return passenger; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
}

public class SCTASMS {
    public static void main(String[]args){

        List<TransportService> services=Arrays.asList(
                new BusService(10.0, "Route A", 930),
                new MetroService(15.0, "Route B", 945),
                new TaxiService(50.0, "Route C", 1000),
                new Ambulance("Route D", 915)
        );
            System.out.println("=== Step 1: Filter services under fare 20, sorted by departure ===");
            services.stream()
                    .filter(s -> s.getFare() <= 20)
                    .sorted(Comparator.comparing(TransportService::getDepartureTime))
                    .forEach(TransportService::printServiceDetails);

            System.out.println("\n=== Step 2: Dashboard Live Update (forEach) ===");
            services.forEach(System.out::println);

            System.out.println("\n=== Step 3: Revenue Reports (Collectors) ===");
            List<Trip> trips = Arrays.asList(
                    new Trip("Alice", "Route A", 10.0),
                    new Trip("Bob", "Route B", 15.0),
                    new Trip("Charlie", "Route C", 50.0),
                    new Trip("David", "Route A", 10.0),
                    new Trip("Eve", "Route B", 15.0)
            );

            Map<String, DoubleSummaryStatistics> revenue = trips.stream()
                    .collect(Collectors.groupingBy(
                            Trip::getRoute,
                            Collectors.summarizingDouble(Trip::getFare)
                    ));

            revenue.forEach((route, stats) -> {
                System.out.println("Route: " + route + " | Total: " + stats.getSum() +
                        " | Avg: " + stats.getAverage() +
                        " | Trips: " + stats.getCount());
            });

            System.out.println("\n=== Step 4: Adding Ferry Service (Extensibility) ===");
            TransportService ferry = new TransportService() {
                public String getServiceName() { return "City Ferry"; }
                public double getFare() { return 20.0; }
                public String getRoute() { return "Route F"; }
                public int getDepartureTime() { return 1030; }
            };
            ferry.printServiceDetails();

            System.out.println("\n=== Step 5: Emergency Services ===");
            services.forEach(s -> {
                if (s instanceof EmergencyService) {
                    System.out.println("🚨 Priority given to: " + s.getServiceName());
                }
            });

            System.out.println("\n=== Bonus: Fare Calculation using Functional Interface ===");
            FareCalculator calculator = dist -> dist * 2.0; // Rs. 2 per km
            double distance = TransportService.calculateDistance(0, 0, 3, 4); // 5 km
            System.out.println("Fare for 5 km: " + calculator.calculateFare(distance));

    }
}
