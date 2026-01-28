
class Node
{
    char data;
    Node next;
    Node(char data)
    {
        this.data=data;
        this.next=null;
    }
}
class Mystack
{
    Node top;
    void push(char data)
    {
       Node newnode=new Node(data);
       newnode.next=top;
       top=newnode;
    }
    boolean pop(char ch)
    {
        if(top==null)
        {
            return false;
        }
       if(ch==')'&&top.data=='('||ch==']'&&top.data=='['||ch=='}'&&top.data=='{')
       {
         top=top.next;
         return true;
       }
       return false;
    }
   boolean check()
    {
        return top==null;
    }
}
class Solution {
    public boolean isValid(String s)
    { 
    Mystack st=new Mystack();
    
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='('||a=='['||a=='{')
            {
                st.push(a);
            }
            else 
            {
               if(!st.pop(a))
               {
                return false;
               }
            }
        }
        boolean res=st.check();
        return res;
    }
}