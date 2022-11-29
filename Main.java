public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Creating flight objects and runway...");
        Flight plane = new Flight();
        Runway LGB = new Runway();

        plane.setRunway(LGB);

        LGB.setFlight(plane);
        LGB.clearRunway();

        System.out.println("Running Plane to land...");

        plane.canLand();

        System.out.println("Finish single plane.");






    }

}
