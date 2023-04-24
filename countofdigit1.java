import java.io.*;


public class countofdigit1 {

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ente size of the array : ");
        int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size];

                for(int i =0; i < arr.length; i++){

                    System.out.print("Enter " + (i + 1) + " element ");
                    arr[i] = Integer.parseInt(br.readLine());

                    
                }

                for(int i = 0; i < arr.length; i++){

                        int num = arr[i];
                        int count = 0;

                        while(num != 0){
                        
                            num /= 10;
                            count++;

                        }
                        System.out.print(" Count of the digits is : " + count);
                } 
                
                System.out.println();
    }
   
}
