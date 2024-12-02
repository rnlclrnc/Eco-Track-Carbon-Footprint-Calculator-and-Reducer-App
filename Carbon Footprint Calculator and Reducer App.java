public class User {
    private String name;
    private int age;
    private double totalEmissions;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.totalEmissions = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalEmissions() {
        return totalEmissions;
    }

    public void addEmissions(double emissions) {
        this.totalEmissions += emissions;
    }
}


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



public class Diet extends Activity {
    private String dietType;

    public Diet(String dietType) {
        super("Diet");
        this.dietType = dietType;
    }

    @Override
    public double calculateEmissions() {
        switch (dietType.toLowerCase()) {
            case "vegan":
                return 1.5;
            case "vegetarian":
                return 2.5;
            case "omnivore":
                return 5.0;
            default:
                return 0;
        }
    }
}


public class EnergyUsage extends Activity {
    private double electricityUsage; // kWh

    public EnergyUsage(double electricityUsage) {
        super("Energy Usage");
        this.electricityUsage = electricityUsage;
    }

    public double calculateEmissions(double emissionFactor) {
        return electricityUsage * emissionFactor;
    }

    @Override
    public double calculateEmissions() {
        return calculateEmissions(0.5);
}



public abstract class Activity {
    protected String activityName;

    public Activity(String activityName) {
        this.activityName = activityName;
    }

    public abstract double calculateEmissions();
}


public interface Recommendation {
    void suggest();
}


public class Diet extends Activity implements Recommendation {
    private String dietType;

    public Diet(String dietType) {
        super("Diet");
        this.dietType = dietType;
    }

    @Override
    public double calculateEmissions() {
    }

    @Override
    public void suggest() {
        System.out.println("Switching to a plant-based diet can significantly reduce your carbon footprint!");
    }
}
