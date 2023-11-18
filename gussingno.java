import java.util.Scanner;
public class gussingno 
{
    public static void playgame()
    {
        int number_use_by_computer;
        int number_gused_by_the_user;
        int number=0;
        number_use_by_computer=(int)(100*Math.random())+1;
        System.out.println("enter the number u gussed");
        Scanner in=new Scanner(System.in);
        boolean play=true;
        while (play) {
            number_gused_by_the_user=in.nextInt();
            number++;
            if (number_gused_by_the_user==number_use_by_computer) {
                System.out.println("***** you won the game *****");
                System.out.println("the number gussed by you and the computer are the same ");
                score(number);
                break;
            }
            else if (number_gused_by_the_user<number_use_by_computer) {
                System.out.println("the number gussed by you ar wrong");
                System.out.println(number_gused_by_the_user +" is smaller than that number");
                System.out.println("try again with greater number than "+number_gused_by_the_user);
                System.out.println("Enter the number again");
            }
            else if(number_gused_by_the_user>number_use_by_computer){
                System.out.println();
                 System.out.println("wrong choice!");
                System.out.println(number_gused_by_the_user  +" is greater than that number");
                System.out.println("try again with smaller number than "+number_gused_by_the_user);
                System.out.println("Enter the number again");
            }
            if(number==5){
                System.out.println();
                System.out.println("GAME OVER!");
                System.out.println("Better Luck next time");
                break;
            }
        }
    }
    static void score(int number)
    {
        System.out.println();
        System.out.println();
        if (number==1) {  
            System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+100);
        }else if (number==2){
          System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+75);
        }else if(number==3){
          System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+50);
        }else if(number==4){
          System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+30);
        }else{
          System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+10);
        }
        System.out.println();
    }
  public static void main(String[] args) {
    System.out.println(" WELCOME TO THE NUMBER GAME!");
    System.out.println();
    System.out.println("Let's play the game...");
    System.out.println("I will pick a number between 1 and 100, and you will try to pick that number");
    System.out.println();
    Scanner scc=new Scanner(System.in);
    boolean playAgain;
    do{
        playgame();
        System.out.println("Would you like to play the game again!");
        System.out.println("If you want to play the game again then press 'y' to continue, otherwise press 'n' to cancel");
        String play_again=scc.nextLine();
        if(play_again.equals("y")){
              playAgain=true;
        }else{
            playAgain=false;
        }
        
    }while (playAgain);
    System.out.println("Thanks! for playing this awesome game!");    
  }
}




