import java.util.Scanner;

public class SievePrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] prime = new int[size];
        for(int i=1; i<size; i++){
            prime[i]=i+1;
        }
      for(int i=0;i<size; i++){

          if(prime[i]!=0){
              for(int j=i+prime[i];j<size; j+=prime[i]){
                  prime[j]=0;
              }
          }
      }
        for (int j : prime) {

            if (j != 0) {
                System.out.println(j);
            }
        }
    }


}