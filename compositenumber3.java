import java.io.*;

public class compositenumber3 {
    
        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ente size of the array : ");
        int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size];

                for(int i =0; i < arr.length; i++){

                    System.out.print("Enter " + (i + 1) + " element  : ");
                    arr[i] = Integer.parseInt(br.readLine());

                }

                // System.out.print("Composite Numbers are : ");
                //  nos having factors more than 2 


                for(int  i = 0; i < arr.length; i++){

                    int count  = 0;

                    for(int j = 1; j <=  arr[i]; j++){

                        if(arr[i] % j == 0){

                            count++;
                        }
                    }
                    if(count > 2){

                        System.out.println("Composite  No " + arr[i] + " found at index " + i);

                    }else{

                    }
                }
                System.out.println();
        }
    
}