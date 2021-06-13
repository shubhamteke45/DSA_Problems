package Array;

import java.util.HashSet;

public class Array_Subset_Of_Another_Array {

	public static void main(String[] args) {


		int[] a1 = {11, 1, 13, 21, 3, 7};
		int[] a2 = {11, 3, 7, 1, 13, 56};
		String s=null;
		
		HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<a1.length; i++){
            set.add(a1[i]);
        }
        
        for(int i=0; i<a2.length ;i++){
            if(set.contains(a2[i])){
                s="Yes";
            }
            else{
                s="No";
            }
        }
        
        System.out.println(s);

	}

}
