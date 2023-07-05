/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        Node ptr1=firstHead;
        Node ptr2=secondHead;
        if(ptr1==null || ptr2==null){
            return -1;
        }
        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
            if (ptr1==ptr2) {
                return ptr1.data;
            }
            if(ptr1==null){
                ptr1=firstHead;
            }
            if(ptr2==null){
                ptr2=secondHead;
            }
        }
        return ptr2.data;
    }
}