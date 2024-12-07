public abstract class Activity {
    protected String activityName;

    public Activity(String activityName) {
        this.activityName = activityName;
    }

    public abstract double calculateEmissions();
}

public class Transportation extends Activity {
    private String vehicleType;
    private double distance;

    public Transportation(String vehicleType, double distance) {
        super("Transportation");
        this.vehicleType = vehicleType;
        this.distance = distance;
    }

    @Override
    public double calculateEmissions() {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return distance * 0.21;
        } else if (vehicleType.equalsIgnoreCase("Bus")) {
            return distance * 0.10;
        } else {
            return 0;
        }
    }
}
