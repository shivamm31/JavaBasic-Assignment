package Ques6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        String str = "Checking for duplicate sentence. Checking for duplicate sentence";
        String[] array = str.split("\\s");
        for(int i=0; i<array.length; i++){
            if(!map.containsKey(array[i]))
                map.put(array[i],1);
            else
                map.put(array[i],map.get(array[i])+1);
        }
        System.out.println(map);
    }


}