import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountingDuplicateWords {

	public static void main(String[] args) {
		 String tonguetwister = "Six sick hicks nick six slick bricks with picks and sticks";
		 System.out.println(tonguetwister);  
	        
	        //to ignore punctuation
	        tonguetwister = tonguetwister.toLowerCase();
	        String wordsInTwister[] = tonguetwister.split(" ");
	        Map<String, Integer> twisterCount = new HashMap<String, Integer>();
	        
	        //find and count duplicates     
	        for(String word : wordsInTwister) {
	        	if(twisterCount.containsKey(word)) {
	        		twisterCount.put(word, twisterCount.get(word) + 1);
	        	}
	        	else {
	        		twisterCount.put(word, 1);
	        	}
	        }
	        
	        Set<String> wordsNumSet = twisterCount.keySet();
	                
	            //displays result
	            for (String word : wordsNumSet) {
	            	if(twisterCount.get(word) > 1) {
	            		System.out.println("Duplicates: " + twisterCount.get(word));
	            	}
	            }
	}
}