
import java.util.*;



public class Sudoku{

    public static void main(String[] args) {
        System.out.println("enter the suduko to check");
        Scanner sc = new Scanner(System.in);
        boolean result = false;
        int[][] mat = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        result = checkRow(mat);
        if(!result){
            result =checkCol(mat);

        }

        if(result){
            System.out.println("wrong");
        }
        else {
            System.out.println("right");
        }

    }
    static boolean checkRow(int[][] matt){
        System.out.println("checking rows");
        for(int[] x: matt){
            int count = 0;
            for(int j : x){
                count = 0;
                for(int k : x){
                    //System.out.println(j+" "+k);
                    if(j == k){
                        count++;
                        //System.out.println("total count :"+count);
                    }
                    if(count>1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean checkCol(int[][] matt){
        System.out.println("checking the cols");
        for(int i=0; i< matt.length; i++){

            for(int j=0;j< matt.length;j++){
                int count=0;
                for(int k=0; k< matt.length;k++){
                    if(matt[j][i]== matt[k][i]){

                        count++;
                    }
                    //System.out.println(matt[j][i]+"  "+matt[k][i]);
                    if(count>1){
                        return true;
                    }


                }


            }

        }
        return false;
    }

}
