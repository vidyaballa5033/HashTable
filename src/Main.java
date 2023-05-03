// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable <Integer,String> player = new Hashtable<Integer,String>();
        player.put(18,"Virat");
        player.put(45,"Rohit");
        player.put(7,"Dhoni");
        for(Map.Entry m : player.entrySet()){
            System.out.println(m.getKey() + " jersey number "+ m.getValue() + " Player name " );
        }
    }
    }
