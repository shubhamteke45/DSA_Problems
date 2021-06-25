package String;

import java.util.HashMap;
import java.util.Map;

public class WinnerOfAnElection {

	public static void main(String[] args) {
		
		String[] votes = {"john","johnny","jackie","johnny","john", "jackie","jamie",
						  "jamie","john","johnny","jamie","johnny","john"};
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(int i=0;i<votes.length;i++) {
			String key=votes[i];
			
			if(hm.containsKey(key)) {
				int freq=hm.get(key);
				freq++;
				hm.put(key, freq);
			}
			else {
				hm.put(key, 1);
			}
		}
		
		int max=0;
		String answer="";
		
		for(Map.Entry<String, Integer> entry:hm.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			
			if(val>max) {
				max=val;
				answer=key;
			}
			else if(val==max && answer.compareTo(key)>0) {
				answer=key;
			}
		}
		
		
		System.out.println(answer+" "+max);
	}

}
