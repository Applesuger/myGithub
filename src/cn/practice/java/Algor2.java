package cn.practice.java;

public class Algor2 {
	public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode l3 = new ListNode(0);
		ListNode temp = l3;
		while (true) {
			if (l1 != null) {
				temp.val = l1.val + temp.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				temp.val = l2.val + temp.val;
				l2 = l2.next;
			}
			temp.next = new ListNode(temp.val / 10);
			temp.val = temp.val % 10;
			if (l1 == null && l2 == null) {
				temp.next = (temp.next.val == 0 ? null : temp.next);
				break;
			}
			temp = temp.next;
		}
		return l3;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode p = l1;
		p.next = new ListNode(4);
		p = p.next;
		p.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		ListNode q = l2;
		q.next = new ListNode(6);
		q = q.next;
		q.next = new ListNode(4);
		ListNode re = addTwoNumber(l1, l2);
		while (re != null) {
			System.out.print(re.val+" ");
			re = re.next;
		}
	}
}

class ListNode {
	int val; // 当前节点的数值
	ListNode next; // 下一个节点
	ListNode(int x) { // 给当前节点的数值赋值
		val = x;
	}
}
