class Solution
{
    static boolean ispar(String s)
    {   
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='['|| s.charAt(i)=='{'){
                stack.push(s.charAt(i));
                continue;
            }
            
            if(stack.isEmpty()){
                return false;
            }
            char check = stack.pop();
            if((s.charAt(i)==')' && check=='(') ||
               (s.charAt(i)==']' && check=='[') ||
               (s.charAt(i)=='}' && check=='{'))
               {
                   continue;
               }
               else{
                   return false;
               }
        }
        
        return stack.isEmpty();
    }
}
