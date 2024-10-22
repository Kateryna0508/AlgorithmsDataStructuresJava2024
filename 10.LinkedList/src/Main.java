public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();

		// Пример 1
		ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(4)));
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode result = solution.mergeTwoLists(l1, l2);
		System.out.println("Пример 1:");
		printList(result);

		// Пример 2
		l1 = null;
		l2 = null;
		result = solution.mergeTwoLists(l1, l2);
		System.out.println("Пример 2:");
		printList(result);

		// Пример 3
		l1 = null;
		l2 = new ListNode(0);
		result = solution.mergeTwoLists(l1, l2);
		System.out.println("Пример 3:");
		printList(result);
	}

	// Метод для вывода связанного списка
	public static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}
}