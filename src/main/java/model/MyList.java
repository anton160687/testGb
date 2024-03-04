package model;

import java.util.Arrays;
import java.util.Random;

public class MyList implements IList {

    @Override
    public void compareArray(double resultAverage1, double resultAverage2) {
        if(resultAverage1 == resultAverage2) System.out.println("\nСредние значения равны");
        if(resultAverage1 > resultAverage2) System.out.println("\nПервый список имеет большее среднее значение");
        if(resultAverage1<resultAverage2) System.out.println("\nВторой список имеет большее среднее значение");
    }

    @Override
    public double averageArray(int[] array) {
        double sum = 0;
        for (int i: array) {
            sum += i;
        }
        double resultAverageArray = Math.round(sum / array.length);
        System.out.printf("\nСреднее значение списка = %s\n", resultAverageArray);
        return resultAverageArray;
    }

    public int[] createArray(){
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,50);
        }
        System.out.print("\n"+Arrays.toString(array));
        return array;
    }
}
