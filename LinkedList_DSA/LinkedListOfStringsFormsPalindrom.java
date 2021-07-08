/*node class of the linked list
class Node
{
    String data;
    Node next;
    Node(String key)
    {
        data = key;
        next = null;
    }
}*/
class GfG
{
    public static boolean compute(Node node)
    {
        String s="";
        while(node!=null){
            s = s.concat(node.data);
            node = node.next;
        }
        StringBuffer res = new StringBuffer(s);
        res.reverse();
        String result = new String(res);
        if(s.equals(result)){
            return true;
        }
        else{
            return false;
        }
    }
}
