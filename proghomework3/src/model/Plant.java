package model;

public class Plant {
    private String name, description;
    private double waterNeedsPerOneDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWaterNeeds() {
        return waterNeedsPerOneDay;
    }

    public void setWaterNeeds(double waterNeeds) {
        this.waterNeedsPerOneDay = waterNeeds;
    }

    public Plant(String name, String description, double waterNeedsPerOneDay) {
        this.name = name;
        this.description = description;
        this.waterNeedsPerOneDay = waterNeedsPerOneDay;
    }
}
