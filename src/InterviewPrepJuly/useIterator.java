package InterviewPrepJuly;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class useIterator {

    public static void printLastCharacter(String[] arr) {
        Iterator<String> iterator = Arrays.asList(arr).iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
           System.out.println(str.charAt(str.length()-1));
        }
    }

    public static void main(String[] args) {
        String[] strings = { "hello", "world", "Java"};
        printLastCharacter(strings);
        
        String[] arr = { "apple", "banana", "orange" };
         
        
        
        List<String> list = Arrays.asList(arr);
        ArrayList<String>fruits=new ArrayList<>();
        
        System.out.println(list);
       
       Iterator<String>it=list.iterator();
       
       while(it.hasNext()) {
    	   System.out.println(it.next()); 
       }
       
      
       
       

    }
}

