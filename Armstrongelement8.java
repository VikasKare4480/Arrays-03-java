import java.io.*;

public class Armstrongelement8 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ente size of the array : ");
        int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size];

                for(int i =0; i < arr.length; i++){

                    System.out.print("Enter " + (i + 1) + " element  : ");
                    arr[i] = Integer.parseInt(br.readLine());

                }

            // armstrong no is no in which sum of power of digits is total no of digits in the no. 

                for(int i = 0; i < arr.length; i++){


                        // calculating totla digits in the no 

                        int num = arr[i];
                        int num1 = num;
                        int count = 0;
                        int sum = 0;
                        // int mult = 1;

                            while(num != 0){

                                    count++;
                                    num /= 10;
                            }
                            // System.out.println(count);
                            for(int j = 1; j <= count; j++){
                                int mult = 1;

                                int rem = num1 % 10;

                                for(int k = 1; k <= count; k++){

                                    mult = mult * rem;

                                }
                                sum = sum + mult;
                                num1 /= 10;

                                // System.out.println(sum);
                                if(sum == arr[i]){

                                    System.out.println("Armstrong no " + arr[i] + " found at Index : " + i );

                                }
                            }
                }
    }

    
}
