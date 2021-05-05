package model;

public class Methods {
    public static double AllWeighSum(Person ...people){
        double sum=0;
        for (int i = 0; i < people.length; i++) {
            sum=sum+people[i].getWeigh();
        }
       return sum;
    }
    public static int NumbersOfPersons(Person ... people){
        int j = 0;
        for (int i = 0; i < people.length; i++){
             j=i;
        }

        return j;
    }
    public static void Lift() {
        System.out.println("start");

    }
    public static void StopWeigh(){
        System.out.println("stop max weigh");
    }
    public static void StopPeople(){
        System.out.println("stop max people");
    }
}
