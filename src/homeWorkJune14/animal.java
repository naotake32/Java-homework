package homeWorkJune14;

public class animal {
    
    private double height;
    private double weight;
    private String animalType;
    private String bloodType;


    public animal() {
        this.height = 0.0d;
        this.weight = 0.0d;
        this.animalType = "Unknown";
        this.bloodType = "Unknown";
    }

    public animal(double height, double weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

}