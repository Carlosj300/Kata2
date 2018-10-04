package kata2;

import static java.lang.Math.random;
import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;
import static java.lang.Math.random;
import java.util.Random;

/**
 * @author carlos
 */
public class Histogram {
    private int[] data = new int[20]; 
    private Map<Integer ,Integer> map = new HashMap<Integer ,Integer>();
    
    
    public Histogram(){
        fill();
        
        for(int i = 0; i < data.length; i++){
            if(map.containsKey(data[i])){
                map.put(data[i], map.get(data[i]) +1);
            } else{
                map.put(data[i], 1);
            }
        }
        
        if (!map.isEmpty()){
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            }
        }
    }
    
    private void fill(){
        for(int i = 0; i < data.length; i++){
            data[i] =  new Random().nextInt(20);
            System.out.print(data[i]+"    ");
        }
        System.out.println("");
    }    
}
