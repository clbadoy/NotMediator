public class Runway {
    
    private boolean canLand;
    private Flight flight;

    public Runway()
    {
        flight = null;
    }
    
    public void setFlight(Flight air) {
        flight = air;
    }

    public Flight getFlight() {
        return flight;
    }

    public boolean getLandStatus() {
        return canLand;
    }

    public void reserveRunway() {
        canLand = false;
    }
    public void clearRunway() {
        canLand = true;
    }

    public void land() {
        System.out.println("Landing Granted.");
    }

}
