import model.*;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person( 60.4);
        Person person2 = new Person(79.4);
        Person person3 = new Person( 50.4);
        Person person4 = new Person( 65.4);
        Person person5 = new Person( 68.4);
        Methods.AllWeighSum(person1,person2,person3,person4);
        Methods.AllWeighSum(person1,person2,person3,person4);
        if (Methods.AllWeighSum(person1,person2,person3,person4, person5)<=400 && Methods.NumbersOfPersons(person1,person2,person3,person4, person5)<4) {
            Methods.Lift();
        }else if (Methods.AllWeighSum(person1,person2,person3,person4)>400){
            Methods.StopWeigh();
        }else {
            Methods.StopPeople();
        }

        }
}

