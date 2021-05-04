package model;

public class Methods {
    public static void  AllWaterNeedsShow(Plant ...plants){
        double sum=0;
        for (int i = 0; i < plants.length; i++) {
            sum=sum+plants[i].getWaterNeeds();
        }
        System.out.println("asdf"+sum);
    }
    public static void WaterNeedsPerWeekShow(Plant plant){
        double sum;
        sum= plant.getWaterNeeds()*7;
        System.out.println("asdasd "+sum);
    }
    public static void WaterNeedsPerYearShow(Plant plant){
        double sum;
        sum= plant.getWaterNeeds()*365;
        System.out.println("cvbn "+sum);
    }
}
