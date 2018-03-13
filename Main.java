package com.company;
import java.util.Arrays;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                int[] array= new int[20];
                for(int i=0;i< array.length; i++){
                array[i]=i;}
                System.out.print("Массив: "+ array);
                   System.out.println(Arrays.toString(array));


                int low = array[0];
                int high = array.length;
                int num=5;
                int mid=(high-low)/2;
                System.out.print(mid);

                    if (num < mid){
                      high=mid;
                      System.out.print(high);
                   }
                   else{low= mid+1;

                    }System.out.print(low);
                }
        }




