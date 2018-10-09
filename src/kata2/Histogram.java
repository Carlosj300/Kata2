package kata2;

import static java.lang.Math.random;
import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;
import static java.lang.Math.random;
import java.util.Iterator;
import java.util.Random;

/**
 * @author carlos
 */
public class Histogram {
    private int[] data = new int[20]; 
    private Map<Integer ,Integer> map = new HashMap<Integer ,Integer>();
    
    
    public Histogram(){
        fill();
        
        if (!map.isEmpty()){
            Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Integer, Integer> entry = iterator.next();
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
        
        for (int key : data) {
            map.put(key,map.containsKey(key) ? map.get(key)+1:1);
        }
    }    
}
