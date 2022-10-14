import java.util.Scanner;

public class Main{

    static Scanner sc;
    static String[][] board;
    static String turn;
    static void populateEmptyBoard(){
        int count=0;
        for(int i = 0; i<3; i++){
            for(int j= 0; j<3;j++){

                board[i][j]=String.valueOf(++count);
            }
        }
    }
    static void printboard(){
        System.out.println("+-----------+");
        System.out.println("| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |");
        System.out.println("+-----------+");
        System.out.println("| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" |");
        System.out.println("+-----------+");
        System.out.println("| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" |");
        System.out.println("+-----------+");

    }


    static String checkWinner(){      // to check winner the probability of winning the game is 8 Vertically(3),Horizontally(3) and diagonal(2)
        String line = null;
        for(int i=0; i<8;i++){
            switch (i) {
                case 0 : line = board[0][0] + board[0][1] + board[0][2];
                    if (line.equals("xxx"))
                        return "x";
                    else if (line.equals("ooo"))
                        return "o";
                case 1 : line = board[1][0] + board[1][1] + board[1][2];
                    if (line.equals("xxx"))
                        return "x";
                    else if (line.equals("ooo"))
                        return "o";
                case 2 : line = board[2][0] + board[2][1] + board[2][2];
                    if (line.equals("xxx"))
                        return "x";
                    else if (line.equals("ooo"))
                        return "o";
                case 3 : line = board[0][0] + board[1][0] + board[2][0];
                    if (line.equals("xxx"))
                        return "x";
                    else if (line.equals("ooo"))
                        return "o";
                case 4 : line = board[0][1] + board[1][1] + board[2][1];
                    if (line.equals("xxx"))
                        return "x";
                    else if (line.equals("ooo"))
                        return "o";
                case 5 : line = board[0][2] + board[1][1] + board[2][2];
                    if (line.equals("xxx"))
                        return "x";
                    else if (line.equals("ooo"))
                        return "o";
                case 6 : line = board[0][0] + board[1][1] + board[2][2];
                    if (line.equals("xxx"))
                        return "x";
                    else if (line.equals("ooo"))
                        return "o";
                case 7 : line = board[0][2] + board[1][1] + board[2][0];
                    if (line.equals("xxx"))
                        return "x";
                    else if (line.equals("ooo"))
                        return "o";
            }
        }




        boolean flag = false;
        for(int a=0; a<9; a++){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(board[i][j].equals(String.valueOf(a+1))){
                        flag = true;
                    }
                    else if(flag == false && a==8){
                        return "draw";
                    }
                    else
                        System.out.println(turn+"'s turn to the start the game");
                        return null;


                }
            }

        }
        return null;






    }

    public static void main(String[] args){
        sc = new Scanner(System.in);
        board = new String[3][3];
        turn = "x";
        String winner = null;
        System.out.println("Welcome to the 2 player TicTacToe game");
        populateEmptyBoard();
        printboard();
        System.out.println(turn+"'s turn to the start the game");
        while(winner == null) {
            int numInput = sc.nextInt();
            int val1 = 0;
            int val2 = 0;
            boolean flag = false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (board[i][j].equals(String.valueOf(numInput))) {
                        val1 = i;
                        val2 = j;
                        flag = true;

                    }

                }
            }
            if(flag){
                board[val1][val2] = turn;
                if(turn.equals("x"))
                    turn = "o";
                else
                    turn = "x";
                printboard();
                winner = checkWinner();
            }





        }
        if(winner.equals("draw")){
            System.out.println("ohh! it is draw");
        }
        else
            System.out.println("Congratulation '"+ winner+"'has won the match" );





    }

}