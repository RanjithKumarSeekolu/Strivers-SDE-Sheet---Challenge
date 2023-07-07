import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/
public class Solution {

    public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
        if(head==null) return null;
        Node node=head;
        Node current = node;
        Node Cp=null;
        boolean flag=true;
        Node nfirst=node;
        for(int len:b){
            if(current==null)break;
            if(len<1)continue;
            Node prev = null;
            Node next = null;
            Node last=null;
            while (current != null&&len-->0) {
                next = current.next;
                current.next = prev;
                prev = current;
                last=current;
                current = next;
            }
            node=prev;
            while(Cp!=null&&Cp.next!=null)Cp=Cp.next;
            if(Cp!=null)Cp.next=prev;
            Cp=last;
            if(flag){nfirst=node;flag=false;}       
        }
        if(current!=null){
            while(Cp!=null&&Cp.next!=null)Cp=Cp.next;
            if(Cp!=null)Cp.next=current;
        }
        return nfirst;
    }
}
