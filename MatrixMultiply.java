import java.util.*;



public class MatrixMultiply{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matrix multiple of same order");
        System.out.println("Enter the order");
        int order = sc.nextInt();
        Matrix a = new Matrix(order);
        Matrix b = new Matrix(order);
        System.out.println("enter the first matrix");
        a.readMat(sc);
        System.out.println("enter the second matrix ");
        b.readMat(sc);
        a.printMat();
        b.printMat();
        Matrix c = a.MatrixMultiply(b);
        c.printMat();




    }


}

class Matrix{
    int mat[][];
    int row,col;
    Matrix(int order){
        mat = new int[order][order];
        row = col = order;

    }

    void readMat(Scanner sc){
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                mat[r][c] = sc.nextInt();
            }
        }
    }

    void printMat(){
        for(int[] ro: mat){
            for(int col: ro){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    Matrix MatrixMultiply(Matrix m){
        Matrix prod = new Matrix(this.row);
        for(int i=0; i<this.row; i++){
            for(int j=0;j<this.col; j++){
                prod.mat[i][j]=0;
                for(int k=0; k<this.row; k++){
                    prod.mat[i][j] = prod.mat[i][j]+this.mat[i][k]*m.mat[k][j];
                }
            }
        }
        return prod;

    }



}