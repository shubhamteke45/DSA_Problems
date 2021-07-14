class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<k+1;i++){
            pq.add(arr[i]);
        }
        
        for(int i=k+1;i<num;i++){
            res.add(pq.remove());
            pq.add(arr[i]);
        }
        
        while(pq.size()>0){
            res.add(pq.remove());
        }
        
        return res;
    }
}
