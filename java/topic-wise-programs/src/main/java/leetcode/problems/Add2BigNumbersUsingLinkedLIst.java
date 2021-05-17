package leetcode.problems;

public class Add2BigNumbersUsingLinkedLIst {

    public static void main(String[] args) {
        //example set 1
        ListNode listNode1 = new ListNode(1, new ListNode(8));
        ListNode listNode2 = new ListNode(0);

        //example set 2
        ListNode listNode3 = new ListNode(7, new ListNode(8, new ListNode(9)));
        ListNode listNode4 = new ListNode(6, new ListNode(2, new ListNode(5)));

        Add2BigNumbersUsingLinkedLIst listAddition = new Add2BigNumbersUsingLinkedLIst();

        ListNode answer1 = listAddition.addTwoNumbers(listNode1, listNode2);
        ListNode answer2 = listAddition.addTwoNumbers(listNode3, listNode4);

        while (answer1 != null){
            System.out.print(answer1.val);
            answer1 = answer1.next;
        }
        System.out.println("\n");
        while (answer2 != null){
            System.out.print(answer2.val);
            answer2 = answer2.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode answer = dummyNode;
        int carry = 0 ;
        while ((l1 != null) || (l2 != null)){
            int additionValue = (l1 == null ? 0 : l1.val) + ((l2 == null ? 0 : l2.val)) + carry;
            carry = additionValue / 10 ;
            answer.next = new ListNode(additionValue % 10);
            answer = answer.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry > 0){
            answer.next = new ListNode(carry);
        }
        return dummyNode.next;
    }
}

class ListNode {
    int val;
    String value;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(String value) { this.value = value; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    ListNode(String value, ListNode next) { this.value = value; this.next = next; }
}
