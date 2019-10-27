package nl.bas.archaeo.carcase;

import nl.bas.archaeo.carcase.domain.Car2;
import nl.bas.archaeo.carcase.domain.Racecar;
import nl.bas.archaeo.carcase.domain.Truck;
import nl.bas.archaeo.carcase.domain.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CarApp2 {

    public static void main(String[] args) {

        //Car2 volvo = new Car2();
        Car2 opel = new Car2(2300, "KK-LL-MM", 65, 23, 2014, 11,9);
        Car2 mercedes = new Car2(2399, "KK-PP-OO", 75,23,2013,6,9);
        Car2 bmw = new Car2(4500,"HH_UU_OO", 80,12,2012,7,4);
        Car2 citroen = new Car2(1200, "JJ_LL_YY", 60,2, 1999,8,5);

        Car2[] tmp = {
                new Car2(2300, "KK-LL-MM", 65, 23, 2014, 11, 9),
                new Car2(2399, "KK-PP-OO", 75, 23, 2013, 6, 9),
                new Car2(4500, "HH_UU_OO", 80, 12, 2012, 7, 4),
                new Car2(1200, "JJ_LL_YY", 60, 2, 1999, 8, 5)
        };

        //volvo.setMileAge(150001);
        opel.setMileAge(45008);
        mercedes.setMileAge(67567);
        bmw.setMileAge(45045);
        citroen.setMileAge(120000);


  //???      trucky.setWeight(2400);

        List<Car2> vehicles = new ArrayList<>(Arrays.asList(tmp));

        vehicles.get(0).setMileAge(45008);
        vehicles.get(1).setMileAge(67567);
        vehicles.get(2).setMileAge(45045);
        vehicles.get(3).setMileAge(120000);


        //System.out.println(vehicles.getMileAge());
        List<Car2> even = vehicles.stream().filter( e -> e.getMileAge() % 2 ==0).collect(Collectors.toList());
        even.forEach(e -> System.out.println(e + " : " + e.getMileAge()));
 //       vehicles = vehicles.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

  //      carInspector(vehicles);
    }



 /*   public static void carInspector(List<Vehicle> vehicles){

        for(Vehicle v : vehicles) {
            if(v instanceof Truck){
            Truck truck = (Truck) v;
                System.out.println(truck.getWeight());
            }
        }
    }
*/





}
