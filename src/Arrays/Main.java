package Arrays;

public class Main {

    public static void main(String[] args) {

        //replacement for the integer, %s replacement for the string

        System.out.printf("There are %d bottles standing on the %s.", 20, "wall" );

        //2Darray

        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"Camaro", "Corvette", "Silverado"},
                {"Camaro", "Corvette", "Silverado"}
        };
//                new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Lada";
        cars[1][1] = "Mustang";
        cars[1][2] = "Ranger";
        cars[2][0] = "Tesla";
        cars[2][1] = "Chevrolet";
        cars[2][2] = "BMW";

        for (String[] car : cars) {
            System.out.println();
            for (String s : car) {
                System.out.println(s + " ");
            }
        }

//        for(int i = 0; i < cars.length; i++){
//            System.out.println();
//            for(int j=0; j<cars[i].length;j++){
//                System.out.println(cars[i][j] +" ");
//
//            }
//
//        }

//        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
//
//        cars[0] = "Mustang";
//
//    System.out.println(cars[3]);

//    String[] cars = new String[4];
//
//    cars[0] = "Camaro";
//    cars[1] = "Ferrari";
//    cars[2] = "Lada";
//    cars[3] = "Škoda";
//
//    System.out.println(cars[0]);
//
//        for (String car : cars) {
//            System.out.println(car);

//            for (int i = 0; i < cars.length; i++){
//                System.out.println(cars[i]);


    }
}
