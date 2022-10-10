import java.util.Scanner;

public class minimal{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        MinMax x = new MinMax(size);
        System.out.println("enter the elements of an array");
        for(int i = 0; i<size; i++){
            x.array[i] = sc.nextInt();
        }
        x.findMax();
        System.out.println(x.max);
        System.out.println(x.min);

    }


}
class MinMax{


    public int[] array;
    int max,min;


    MinMax(int size){
        array = new int[size];
    }
    void findMax(){
        max = array[0];
        min = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
    }


}