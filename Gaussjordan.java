import java.util.Scanner;

public class Gaussjordan{
    public static int n;
    public static Scanner sc = new Scanner(System.in);

    public static void convertToDiagonal(float[][] a,int n){
        float ratio;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j!=i){
                    ratio = a[j][i]/a[i][i];
                    for(int k=0;k<n+1;k++){
                        a[j][k]=a[j][k]-ratio * a[i][k];
                    }
                    printDiagonal(a,n);
                }
                
            }
        }

    }
    public static void printUnknows(float[][] a,int n){
        System.out.println("values of unknowns are:");
        for(int i=0;i<n;i++){
            System.out.println("Values of unknowns are :"+i+" = "+ a[i][n] /a[i][i]);
        }

    }
    public static void printDiagonal(float[][] a,int n){
        System.out.println("inter mediate forms");
        for(int x =0;x<n;x++){
            for(int y=0; y<n+1;y++){
                System.out.print(a[x][y]);
            }
            System.out.println();
        }
                


    }
    public static void main(String[] args){

        System.out.println("Enter no of Unknowns");

        n = sc.nextInt();
        float[][] a = new float[n][n+1];
        System.out.println("enter the augmented matrix");
        for(int i = 0;i<n;i++){
            for(int j=0; j<n+1;j++){
                a[i][j]=sc.nextFloat();
            }
        }
        convertToDiagonal(a,n);
        
        printUnknows(a,n);

    }




}