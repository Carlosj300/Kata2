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
    private String[] data = new String[]{"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
    private Map<String ,Integer> map = new HashMap<String ,Integer>();
    
    
    public Histogram(){
        fill();
        
        if (!map.isEmpty()){
            for(String key : map.keySet()){
                Integer value = map.get(key);
                System.out.println("Key: " + key + " Value: " + value);
            }    
        }            
    }
    
    private void fill(){
        for (String key : data) {
            map.put(key,map.containsKey(key) ? map.get(key)+1:1);
        }
    }    
}
