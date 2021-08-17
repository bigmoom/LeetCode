/**
 *
 * 给你两个非空 的链表，表示两个非负的整数。
 * 它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * @author cwh
 * @date 2021/8/13 17:39
 *
 */
public class LeetCode2 {


      /*Definition for singly-linked list.*/
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean addOne = false;
        if(getLen(l1)>getLen(l2)){
            ListNode temp = l2;
            l2 = l1;
            l1 = temp;
        }
        ListNode result = l2;
        //l1为位数小的数
        while (l1 != null) {
            int sum = l1.val + l2.val;
            if (sum >= 10) {
                if(addOne){
                    l2.val = sum - 10 + 1;
                }else {
                    l2.val = sum - 10;
                }
                addOne = true;
            } else if (sum == 9) {
                if(addOne){
                    l2.val = 0;
                }else {
                    l2.val = 9;
                }
            } else {
                if(addOne){
                    l2.val = sum + 1;
                }else {
                    l2.val = sum;
                }
                addOne = false;
            }
            if(l2.next ==null &&addOne){
                l2.next = new ListNode(1);
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l2 != null ) {
            if (l2.val == 9 && addOne) {
                l2.val = 0;
                if(l2.next==null){
                    l2.next = new ListNode(1);
                }
                l2 = l2.next;
            }else {
                if(addOne){
                    l2.val ++;
                }
                addOne = false;
                l2 = l2.next;
            }
        }
        return result;
    }

    int getLen(ListNode listNode){
          int count =1;
          while(listNode.next!=null){
              count++;
              listNode = listNode.next;
          }
          return count;

    }

    public static void main(String[] args) {
    }

}
