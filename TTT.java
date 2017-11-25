
import java.util.*;
public class TTT {
    private static boolean Player_1 = false;
    private static char[][] board = new char[3][3];
    private static int totalwins = 0;
    private static int Finaltally = 0;

    public static void main(String[] args){
        intro();
    }
    public static void intro(){
        Scanner console = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("****************Welcome to play a good game*********************");
        System.out.println("");
        System.out.println("Broad Run High School recommend to play the Game Tic-Tac-Toe");
        System.out.println("The Player_1 need to play with PC/Laptop,");
        System.out.println("The Player_1 begin by choosing the co-ordinates(1-3)");
        System.out.println("");
        System.out.println("***********************************************************************");
        System.out.println("Do you want to begin first Player_1?");
        String startfirst = console.nextLine();
        if(startfirst.substring(0,1).equalsIgnoreCase("y")){
            //first = true;
        }
       openGrid();
        achieveGrid();
        playbegins(console);

    }

    public static void playbegins(Scanner console){

        if(Player_1 == true){
            Player_1Turn(console);
        }else{
            PCLaptopTurn(console);
        }
    }

    public static void Player_1Turn(Scanner console){
        System.out.println("Play your turn?");
        int r = console.nextInt() - 1;
        int c = console.nextInt() - 1;
        if(board[r][c] == ' '){
            board[r][c] = 'X';
            if(board[0][0] == 'X'){
                achieveGrid();
                Finaltally += 1;
                FinalwinsPlayer(console);
            } else if(board[0][2] == 'X'){
                achieveGrid();
                Finaltally += 3;
                FinalwinsPlayer(console);
            } else if(board[2][0] == 'X'){
                achieveGrid();
                Finaltally += 1000;
                FinalwinsPlayer(console);
            } else if(board[2][2] == 'X'){
                achieveGrid();
                Finaltally += 3000;
                FinalwinsPlayer(console);
            } else if(board[1][1] == 'X'){
                achieveGrid();
                Finaltally += 200;
                FinalwinsPlayer(console);
            } else if(board[0][1] == 'X'){
                achieveGrid();
                Finaltally += 2;
                FinalwinsPlayer(console);
            } else if(board[1][0] == 'X'){
                achieveGrid();
                Finaltally += 100;
                FinalwinsPlayer(console);
            } else if(board[1][2] == 'X'){
                achieveGrid();
                Finaltally += 300;
                FinalwinsPlayer(console);
            } else if(board[2][1] == 'X'){
                achieveGrid();
                Finaltally += 2000;
                FinalwinsPlayer(console);
            }
        } else if (board[r][c] == 'X' || board[r][c] == 'O'){
            Player_1 = true;
            System.out.println(" Your turn, choose an available spot ");
            playbegins(console);
        }
        System.out.println(" TTT Game");
    }

    
    public static void PCLaptopTurn(Scanner console){
        System.out.println("Now it's PC/Laptop turn");
        System.out.println("");
        if(board[0][0] == ' '){
            board[0][0] = 'O';
            achieveGrid();
            Player_1Turn(console);
            totalwins += 1;
        } else if(board[0][2] == ' '){
            board[0][2] = 'O';
            achieveGrid();
            Player_1Turn(console);
            totalwins += 3;
        } else if(board[2][0] == ' '){
            board[2][0] = 'O';
            achieveGrid();
            Player_1Turn(console);
            totalwins += 1000;
        } else if(board[2][2] == ' '){
            board[2][2] = 'O';
            achieveGrid();
            Player_1Turn(console);
            totalwins += 3000;
        } else if(board[1][1] == ' '){
            board[1][1] = 'O';
            achieveGrid();
            Player_1Turn(console);
            totalwins += 200;
        } else if(board[0][1] == ' '){
            board[0][1] = 'O';
            achieveGrid();
            Player_1Turn(console);
            totalwins += 2;
        } else if(board[1][0] == ' '){
            board[1][0] = 'O';
            achieveGrid();
            Player_1Turn(console);
            totalwins += 100;
        } else if(board[1][2] == ' '){
            board[1][2] = 'O';
            achieveGrid();
            Player_1Turn(console);
            totalwins += 300;
        } else if(board[2][1] == ' '){
            board[2][1] = 'O';
            achieveGrid();
            Player_1Turn(console);
            totalwins += 2000;
        }      

    }
    /*public static void checkUser(Scanner console){
        if(Finaltally == 3){
            board[0][2] = 'O';
        } else if (Finaltally ==)
    }*/
 
    public static void FinalwinsPlayer(Scanner console){
        if(totalwins == 3201 || totalwins == 1203 || totalwins == 6 ||
                totalwins == 600 || totalwins == 6000 || totalwins == 1101 || 
                        totalwins == 2202 || totalwins == 3303){
            System.out.println("I win!!! Hahahahahaha!!!!!!");
            intro();
        } else if (Finaltally == 3201 || Finaltally == 1203 || Finaltally == 6 ||
                Finaltally == 600 || Finaltally == 6000 || Finaltally == 1101 || 
                Finaltally == 2202 || Finaltally == 3303){
            System.out.println("You won!");
            intro();
        } else {
            PCLaptopTurn(console);
        }
    }
    public static void checkScoreComp(Scanner console){
        if(totalwins == 3201 || totalwins == 1203 || totalwins == 6 ||
                totalwins == 600 || totalwins == 6000 || totalwins == 1101 || 
                        totalwins == 2202 || totalwins == 3303){
            System.out.println("Player_1 is the winner");
            intro();
        } else if (Finaltally == 3201 || Finaltally == 1203 || Finaltally == 6 ||
                Finaltally == 600 || Finaltally == 6000 || Finaltally == 1101 || 
                Finaltally == 2202 || Finaltally == 3303){
            System.out.println("You won!");
            intro();
        } else {
            Player_1Turn(console);
        }
    }
 
    public static void openGrid(){
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                board[r][c] = ' ';
            }
        }
    }
    public static void achieveGrid(){
        String bar = "  =============";
        System.out.println("    1   2   3");
        System.out.println(bar);
        System.out.println("1   " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(bar);
        System.out.println("2   " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(bar);
        System.out.println("3   " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println(bar);
        System.out.println("");

    }
}
 