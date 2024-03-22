package org.example;

import java.util.ArrayList;
import java.util.List;

public class HelloThreads {
    private static void hello() {
        var t1 = new Thread(() -> System.out.println("Hello from thread 1"));
        var t2 = new Thread(() -> System.out.println("Hello from thread 2"));
        t1.start();
        t2.start();
    }

    //hacer ejecicio
    //tienen una matriz hacemos
    //un metodo suma donde la suma devuelva una matriz pero mande un thread par sumar cada linea
    public static double matrixSum(double[][] matrix1, double[][] matrix2){
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < matrix1.length; i++) {
            double[] a = matrix1[i];
            double[] b = matrix2[i];
            Thread thread = new Thread   (() -> test1(a,b));
            thread.start();
            threadList.add(thread);
        }
        return 2;
    }

    public static double[] lineSum(double[]line1, double[] line2) {
        double[] result = new double[line1.length];
        for (int i = 0; i < line1.length; i++) {
            result[i] = line1[i] + line2[i];

        }
        return result;
    }

    public static void test1( double[] a,double[] b){
        double[] array = lineSum(a,b);

        for (double value : array) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        double[][] matrix1 = { { 1, 2, 3 },
                { 4,5,6} };
        double[][] matrix2 = { { 1, 2, 3 },
                { 4,5,6} };
     matrixSum(matrix1,matrix2);

    }
    


}