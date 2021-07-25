import java.util.Scanner;

public class GameDriver {


    private Boat player1 = new Boat();
    private Boat player2 = new Boat();
    private Scanner scanner = new Scanner(System.in);
    private String rollthem;


    ///////////////
    private int score1;
    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }
    ////////////////////

    ///////////////
    private int score2;
    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    ////////////
    // lane is 50

    GameDriver(){
        running(player1,player2);

    }

    public void running(Boat boat1, Boat boat2){
        boat1.positioning();
        boat2.positioning();
        int turns=0;
        while (boat1.getCurrentBoatPosition() <= 70
                &&
                boat2.getCurrentBoatPosition() <= 70){

            if (turns%2 == 0){
                //player1 turn
                System.out.println("type roll to roll");
                rollthem = scanner.nextLine().toLowerCase();

                if (rollthem.equals("roll")){
                    boat1.afterDice();
                    setScore1(getScore1()+Main.BaseScore);
                    if (!boat1.getTT().isEmpty()){
                        for (int i=0;i< boat1.getTT().size();i++){
                            if (boat1.getTT().get(i).equals(boat1.getCurrentBoatPosition())){
                                boat1.afterTrap();
                                boat1.getTT().remove(i);
                                System.out.println("player1 stepped on trap");
                                setScore1(getScore1()+Main.TrapValue);
                            }
                        }
                    }

                    if (!boat1.getCC().isEmpty()){
                        for (int i=0;i< boat1.getCC().size();i++){
                            if (boat1.getCC().get(i).equals(boat1.getCurrentBoatPosition())){
                                boat1.afterCurrent();
                                boat1.getCC().remove(i);
                                System.out.println("player1 stepped on current");
                                setScore1(getScore1()+Main.CurrentValue);
                            }
                        }
                    }

                }
                else{
                    System.out.println("wrong input");
                    rollthem = scanner.nextLine().toLowerCase();
                    System.out.println("type roll to roll");
                }

                System.out.println("player 1 position: " + boat1.getCurrentBoatPosition()+"\n");
                turns++;
            }
            else{
                System.out.println("type roll to roll");
                rollthem = scanner.nextLine().toLowerCase();

                if (rollthem.equals("roll")){
                    boat2.afterDice();
                    setScore2(getScore2()+Main.BaseScore);
                    if (!boat2.getTT().isEmpty()){
                        for (int i=0;i< boat2.getTT().size();i++){
                            if (boat2.getTT().get(i).equals(boat2.getCurrentBoatPosition())){
                                boat2.afterTrap();
                                boat2.getTT().remove(i);
                                System.out.println("player2 stepped on trap");
                                setScore2(getScore2()+Main.TrapValue);
                            }
                        }
                    }

                    if (!boat2.getCC().isEmpty()){
                        for (int i=0;i< boat2.getCC().size();i++){
                            if (boat2.getCC().get(i).equals(boat2.getCurrentBoatPosition())){
                                boat2.afterCurrent();
                                boat2.getCC().remove(i);
                                System.out.println("player2 stepped on current");
                                setScore2(getScore2()+Main.CurrentValue);
                            }
                        }
                    }
                }
                else{
                    System.out.println("wrong input");
                    rollthem = scanner.nextLine().toLowerCase();
                    System.out.println("type roll to roll");
                }
                System.out.println("player 2 position: "+ boat2.getCurrentBoatPosition()+"\n");
                turns++;
            }
        }
        if (score1 > score2){
            System.out.println("player1 won");
            System.out.println("player 1 score: " + score1);
            System.out.println("player 2 score: " + score2);
        }
        else if (score2 > score1){
            System.out.println("player 2 won");
            System.out.println("player 1 score: " + score1);
            System.out.println("player 2 score: " + score2);
        }
        else{
            System.out.println("it is a draw");
            System.out.println("player 1 score: " + score1);
            System.out.println("player 2 score: " + score2);
        }
    }
}

