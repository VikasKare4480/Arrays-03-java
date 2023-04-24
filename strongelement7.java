import java.io.*;

public class strongelement7 {

   public static void main(String[] args)throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ente size of the array : ");
        int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size];

                for(int i =0; i < arr.length; i++){

                    System.out.print("Enter " + (i + 1) + " element  : ");
                    arr[i] = Integer.parseInt(br.readLine());

                }

                // strong no is no havaing sum of factorials of the digit is same of that no
                
                // System.out.print("Strong no's  are : ");

                for(int i = 0; i < arr.length; i++){

                    int num = arr[i];

                    int sum = 0;

                    while(num != 0){

                        int fact = 1;

                        int rem = num % 10;

                        for(int j = 1; j <= rem; j++){

                            fact = fact * j;

                        }

                        sum += fact;
                        num /= 10;
                    }
                    if(sum == arr[i]){

                        System.out.println("Strong No. " + arr[i] + " found at Index : " + i);

                    }

                }
   } 
    
}
