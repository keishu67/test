import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String data[] = line.split(" ", 0);
        
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        
        for(int i = 0; i < data.length; i++){
            if(map.containsKey(data[i])){
                int x = map.get(data[i]);
                x++;
                map.put(data[i],x);
            } else{
                map.put(data[i], 1);
            }
        }
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
    }
}