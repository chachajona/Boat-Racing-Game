import java.util.Random;

public class Dice {

    private int DiceNumber;

    public int getDiceNumber() {
        return DiceNumber;
    }

    public void setDiceNumber(int diceNumber) {
        DiceNumber = diceNumber;
    }

    public Dice(){

    }

    public void randomGenerate(){
        Random random = new Random();
        int endpos = 6;
        int startpos = 1;
        //1 - 6 random
        setDiceNumber(random.nextInt(endpos - startpos+1)+startpos);
    }


}
