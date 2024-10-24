public class ListNode {
	final int val;
	ListNode next;

	public ListNode() {
		this.val = 0;
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}