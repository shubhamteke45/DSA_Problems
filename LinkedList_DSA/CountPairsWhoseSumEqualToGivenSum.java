class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        
        HashSet<Integer> set = new HashSet<>();
        int cn=0;
        int i=0;
        while(i<head1.size()){
            set.add(head1.get(i));
            i++;
        }
        int j=0;
        while(j<head2.size()){
            int elm = x - head2.get(j);
            if(set.contains(elm)){
                cn++;
            }
            j++;
        }
        
        return cn;
    }
}
