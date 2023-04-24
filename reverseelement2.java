import java.io.*;

public class reverseelement2 {
    
   public static void main(String[] args) throws IOException{

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ente size of the array : ");
        int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size];

                for(int i =0; i < arr.length; i++){

                    System.out.print("Enter " + (i + 1) + " element  : ");
                    arr[i] = Integer.parseInt(br.readLine());
                      
                }
                System.out.print("Reverse of each element are : ");

                for(int i = 0; i < arr.length; i++){

                        int num = arr[i];
                        int reverse = 0;

                        while(num != 0){

                            int rem = num % 10;
                            reverse = reverse * 10 + rem;
                            num /= 10;
                        }

                System.out.print(reverse + " ");

                }

                System.out.println();
                
   } 
}
