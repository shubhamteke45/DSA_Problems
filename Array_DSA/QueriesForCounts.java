package Array;

public class QueriesForCounts {

	public static void main(String[] args) {
		
		long[] A = { 2, 4, 9, 15, 21, 20};
		long[] Q = { 2, 0, 5};
		long N=A.length;
		long M=Q.length;
		
		long[] res = new long[(int)M];
        long i=0, j=N-1;
        long l=0, r=0;
        long q=0;
        long cn=0;
        while(q<M){
            long div = Q[(int)q];
            while(i<=j){
            	
            	if(div==0) {
            		break;
            	}
                l = A[(int)i];
                r = A[(int)j];
                if(l%div==0){
                    cn++;
                }
                
                if(r%div==0){
                    cn++;
                }
                
                i++;
                j--;
            }
            res[(int)q]=cn;
            cn=0;
            q++;
            i=0;
            j=N-1;
        }
       
        for(long z:res) {
        	System.out.println(z);
        }
	}

}
