package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in array one :: ");
        int x = sc.nextInt();
        int[] arr1 = new int[x];
        int l1=arr1.length;
        System.out.print("Enter elements of array 1 ::  ");
        for (int i=0;i<l1;i++)
            arr1[i]= sc.nextInt();

        System.out.print("Enter no of elements in array Two :: ");
        int y = sc.nextInt();
        int[] arr2 = new int[y];
        int l2= arr2.length;
        System.out.print("Enter elements of array 2 ::  ");
        for (int i=0;i<l2;i++)
            arr2[i]= sc.nextInt();


        int l =l1+l2;
        int[] arr3 = new int[l];


      //  for (int i=0;i<l1;i++)
        //    arr3[i]=arr1[i];
        for (int m:arr1) {
            arr3[index]=m;
            index++;
        }

        for (int m:arr2) {
            arr3[index]=m;
            index++;
        }

        System.out.println(Arrays.toString(arr3));


        System.out.println("There are "+arr3.length +"no of elements in array");
        double median;
        if(l % 2 == 0){
            median = arr3[((l / 2)- 1) + l/2];
        }else{
            median= arr3[l/2];
        }
        System.out.println("Median is " +median);
    }
}
