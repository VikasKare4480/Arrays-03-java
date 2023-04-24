import java.io.*;
import java.util.Arrays;

class secondminelement10 {


    public static void main(String[] args) throws IOException{


        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ente size of the array : ");
        int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size];

                for(int i =0; i < arr.length; i++){

                    System.out.print("Enter " + (i + 1) + " element  : ");
                    arr[i] = Integer.parseInt(br.readLine());

                }

                //  finding  the second max element fron array  by swapping the elements 

                
                int temp;

                // Arrays.sort(arr);  --->> direct sorting the elements of the array 
               

                for(int i = 0 ; i < arr.length -1 ; i++){


                        for(int j = 0; j < arr.length -1 ; j++){


                                if(arr[j] > arr[j + 1]){

                                    temp = arr[j];
                                    arr[j] = arr[j + 1];
                                    arr[j + 1] = temp;
                                    

                                }

                        }
                        // System.out.println();

                }

                // System.out.println(arr[i] + " ");
                
                // for(int i = 0; i < arr.length; i++){

                //         System.out.print(arr[i] +  " ");

                // }

                System.out.println("Second minimum element is : " + arr[1]);
                System.out.println();
        


    }
}
