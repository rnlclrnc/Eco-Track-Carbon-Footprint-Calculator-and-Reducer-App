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
    private double electricityUsage;

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
}
