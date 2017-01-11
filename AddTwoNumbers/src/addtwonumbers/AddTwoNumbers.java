/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addtwonumbers;

/**
 *
 * @author almuallimj
 */
public class AddTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode outputList = new ListNode(0);
        ListNode curr;
        curr = outputList;
        int carry = 0;
        int currVal = 0;
        while(l1 != null || l2 != null || carry != 0){
            if (l1 != null){
                currVal += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                currVal += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(currVal % 10);
            curr = curr.next;
            carry = currVal / 10;
            currVal = carry;
        }
                
        return outputList.next;
    }
    
}
