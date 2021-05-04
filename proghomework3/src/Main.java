import model.*;
public class Main {
    public static void main(String[] args) {
        Plant plantb= new Plant("Wazon","żyje", 0.2);
        Plant planta= new Plant("Kaktus","ostry", 0.5);
        Plant plantc= new Plant("Lilia","piękna", 1.2);

        Methods.AllWaterNeedsShow(planta, plantb, plantc);
        Methods.WaterNeedsPerWeekShow(planta);
        Methods.WaterNeedsPerYearShow(plantb);
    }
}
