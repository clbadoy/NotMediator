public class Flight{

    private Runway runway;

    public Flight() {
        runway = null;
    }

    public void setRunway(Runway road) {
        runway = road;
    }

    public void canLand() {
        if(runway.getLandStatus() == true) {
            runway.land();
            successLand();
        }
        else {
            System.out.println("Cannot Land. Runway Occupied.");
        }
    }

    public void successLand()
    {
        System.out.println("Successful Landing.");
        runway.reserveRunway();
    }

}