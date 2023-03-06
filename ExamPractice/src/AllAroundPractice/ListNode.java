package AllAroundPractice;

import java.util.ArrayList;
import java.util.Stack;

public class ListNode {

    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static boolean isPalindrome2(ListNode head) {
        int counter = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for ( ListNode index = head ; index != null ; index=index.next){
            arr.add(index.val);
        }
        int n = arr.size();
        if (  n == 2 && arr.get(0) != arr.get(1)) {
            return false;
        }
        for ( int i = 0 ; i < n ; i++){
            if ( arr.get(i) != arr.get(n-1-i)) return false;
        }
        return true;
    }


    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true; // an empty list is considered a palindrome
        }
        double len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        Stack<Integer> node_val = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        int oddPos = (int)Math.ceil(len/2);
        node_val.push(slow.val);
        count++;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if ( len % 2 == 0 && count < len/2) {
                node_val.push(slow.val);
            }

            if ( len % 2 != 0 &&  count < len/2){
                if (count == oddPos-1){
                    slow = slow.next;
                    break;
                }
                else {
                    node_val.push(slow.val);
                }
            }
            count++;
        }
        while (!node_val.isEmpty() && slow != null) {
            if (node_val.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
      // head.next.next = new AllAroundPractice.ListNode(3);
        head.next.next= new ListNode(2);
        head.next.next.next= new ListNode(1);


        System.out.println(isPalindrome2(head));
    }
}
