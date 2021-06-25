class Solution
{    
    
    public static boolean isAnagram(String a,String b)
    {
        
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        boolean res=true;
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(c1.length!=c2.length) {
        	return false;
        }
        
        for(int i=0;i<c1.length;i++) {
        	if(c1[i]!=c2[i]) {
        		res=false;
        		break;
        	}
        }
        
        return res;
        
    }
}
