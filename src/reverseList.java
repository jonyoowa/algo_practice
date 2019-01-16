import java.util.*;

public class reverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		
		ListNode head = one;

		reverseList(head);
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = null;
		
		while (head != null) {
			curr = head.next;
			head.next = prev;
			prev = head;
			head = curr;
		}
		
		return prev;
	}
}
