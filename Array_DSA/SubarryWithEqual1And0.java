class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        int sum=0;
		int ans=0;
		HashMap<Integer, Integer> mp = new HashMap<>();
		
		mp.put(0, 1);
		
		for(int val:arr) {
			if(val==0) {
				sum += -1;
			}
			else {
				sum += 1;
			}
			
			if(mp.containsKey(sum)) {
				ans+=mp.get(sum);
				mp.put(sum, mp.get(sum)+1);
			}
			else {
				mp.put(sum, 1);
			}
		}
		return ans;
    }
}


