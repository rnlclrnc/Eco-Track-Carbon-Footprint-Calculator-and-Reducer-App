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
