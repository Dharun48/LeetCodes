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
class MyStack
 {
    Node top;
    void push(char data) 
    {
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }

    String display()
     {
        String res="";
        while(top!=null)
         {
            res+=top.data;
            top=top.next;
        }
        return res;
    }
}
class Solution {
    public String reversePrefix(String word, char ch) {
        MyStack st = new MyStack();
        int i=0;
        for(;i<word.length();i++)
         {
            st.push(word.charAt(i));
            if(word.charAt(i) == ch)
            {
                break;
            }
        }
        if (i==word.length())
        {
            return word;
        }
        String reversed=st.display();
        return reversed+word.substring(i+1);
    }
}
