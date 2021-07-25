import java.util.ArrayList;
import java.util.Random;

public class Boat {
    private Dice dice = new Dice();
    //dice will produce random number

    private Traps traps = new Traps();
    //trap will produce strength

    private Current current = new Current();
    //current will produce strength.

    ///////////////////////
    private ArrayList<Integer> TT = new ArrayList<Integer>();

    public ArrayList<Integer> getTT() {
        return TT;
    }

    public void setTT(ArrayList<Integer> TT) {
        this.TT = TT;
    }

    private ArrayList<Integer> CC = new ArrayList<Integer>();

    public ArrayList<Integer> getCC() {
        return CC;
    }

    public void setCC(ArrayList<Integer> CC) {
        this.CC = CC;
    }

    private int CurrentBoatPosition;

    public int getCurrentBoatPosition() {
        return CurrentBoatPosition;
    }

    public void setCurrentBoatPosition(int currentBoatPosition) {
        CurrentBoatPosition = currentBoatPosition;
    }
    Boat(){

    }
    public int randomGenerate(int startpos,int endpos){
        Random random = new Random();
        //1 - 6 random
        return (random.nextInt(endpos - startpos+1)+startpos);
    }


    public void afterDice(){
        dice.randomGenerate();
        setCurrentBoatPosition(getCurrentBoatPosition() + dice.getDiceNumber());
    }

    public void afterTrap(){
        traps.powerLizard();
        setCurrentBoatPosition(getCurrentBoatPosition() - traps.getStrength());
    }

    public void afterCurrent(){
        current.powerLizard();
        setCurrentBoatPosition(getCurrentBoatPosition() + current.getStrength());
    }

    public void positioning(){
//        position
        for (int i= 0; i<5;i++){
            int nn = randomGenerate(10,40);
            if (nn%2==0){
                if (!TT.isEmpty()){
                    for (int t=0;t<TT.size();t++){
                        if (nn == TT.get(t)){
                            i--;
                        }
                        else{
                            TT.add(nn);
                            break;
                        }
                    }
                }
                else{
                    TT.add(nn);
                }
            }
            else{
                if (!CC.isEmpty()){
                    for (int k=0;k<CC.size();k++){
                        if (CC.get(k).equals(nn)){
                            i--;
                        }
                        else{
                            CC.add(nn);
                            break;
                        }
                    }
                }
                else{
                    CC.add(nn);
                }

            }
        }

    }
}

