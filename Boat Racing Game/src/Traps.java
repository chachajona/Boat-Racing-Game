import java.util.ArrayList;
import java.util.Random;

public class Traps {
    private String type;
    private int strength;
    private ArrayList<String> listType = new ArrayList<String>();

    Traps(){
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void typeGen(){
        listType.add("Big");
        listType.add("Small");
        setType(listType.get(randomGenerate(0,1)));
    }
    public int randomGenerate(int startpos,int endpos){
        Random random = new Random();
        //1 - 6 random
        return (random.nextInt(endpos - startpos+1)+startpos);
    }
    // this generate a number

    public void powerLizard(){
        typeGen();
        if (getType().equals("Big")){
            setStrength(randomGenerate(6,10));
        }
        else if (getType().equals("Small")){
            setStrength(randomGenerate(1,5));
        }
        else{
            System.out.println("it is not a correct value!!");
        }

    }




}
