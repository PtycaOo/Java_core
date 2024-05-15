package Seminar_2;

public class Main {
    public static void main(String[] args) {
        /*Четные числа*/
        int[]arr = {2, 1, 2, 3, 4};
        System.out.println(Even.events(arr));

        /*Разница*/
        int[]arr2 = {2, 8, 2, 3, 4, 6};
        System.out.println(Difference.difference(arr2));

        /*Истина*/
        int[]arr3 = {2, 8, 0, 0, 4, 6};
        System.out.println(Neighbours.neighbours(arr3));
    }
}