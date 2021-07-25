import java.util.ArrayList;
import java.util.Random;

public class Current {
    private String type;
    private int strength;
    private ArrayList<String> listType = new ArrayList<String>();

    Current(){


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
        listType.add("Heavy");
        listType.add("Light");
        setType(listType.get(randomGenerate(0,1)));

    }
    public void powerLizard(){
        typeGen();
        if (getType().equals("Heavy")){
            setStrength(randomGenerate(6,10));
        }
        else if (getType().equals("Light")){
            setStrength(randomGenerate(1,5));
        }
        else{
            System.out.println("it is not a correct value!!");
        }

    }

    public int randomGenerate(int startpos,int endpos){
        Random random = new Random();
        //1 - 6 random
        return (random.nextInt(endpos - startpos+1)+startpos);
    }
}
