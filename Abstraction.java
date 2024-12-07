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
