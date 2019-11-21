package com.company;
import java.util.Scanner;

public class SolutionA{

    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of specified array:);
        int len = s.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter the array elements:"); // array elements are being inserted
        for(int i = 1; i <= len; i++){
            arr[i] = s.nextInt();
        }
        for(int i = 1; i <= len; i++){ //searhing the required key element
            int temp = 0; // maintaining this count so that it can come out of the first loop if it is incremented by one in the second loop
            int key = arr[i];
            for(int j = 1; j <= len; j++){ //loop to check the index
                if(key == i){
                    temp = temp + 1;
                    System.out.println(key); // printing the output
                    break;
                }
            }
            if(temp == 1){
                break;
            }
        }
    }
}
:x



:x

