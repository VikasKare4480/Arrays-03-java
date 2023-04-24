import java.io.IOException;

import java.io.*;

public class perfectno5 {

    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ente size of the array : ");
        int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size];

                for(int i =0; i < arr.length; i++){

                    System.out.print("Enter " + (i + 1) + " element  : ");
                    arr[i] = Integer.parseInt(br.readLine());

                }

                // System.out.println("Perfect No : -->> sum of all it's factors excluding that no is perfect no : ");


                

                for(int i = 0; i < arr.length; i++){

                    int sum = 0;

                    for(int j = 1; j <= arr[i] / 2; j++){ // excluding that no 

                            if(arr[i] % j == 0){

                                sum = sum + j;
                                   
                            }

                    }
                  

                    if(sum == arr[i]){

                        System.out.print( " Perfect no  " + arr[i] + " found at Index " + i);

                    }
                    System.out.println();
                }

    }
    
}
