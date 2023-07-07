import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
		LinkedListNode<Integer> mid=getMid(head);
		LinkedListNode<Integer> head2=reverse(mid);
		while(head!=null && head2!=null){
            if(!head.data.equals(head2.data)){
                return false;
            }
            head=head.next;
            head2=head2.next;
        }
        return true;
	}
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		LinkedListNode dummy=null;
		while(head!=null){
			LinkedListNode<Integer> next=head.next;
			head.next=dummy;
			dummy=head;
			head=next;
		}
		return dummy;
	}
	public static LinkedListNode<Integer> getMid(LinkedListNode<Integer> head){
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}