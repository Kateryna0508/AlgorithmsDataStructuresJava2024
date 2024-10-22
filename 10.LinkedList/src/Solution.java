public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode list = new ListNode(0); // Вспомогательный узел
		ListNode current = list;

		while (l1 != null && l2 != null) { // Обьеденение списковц
			if (l1.val <= l2.val) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}

		// Если один из списков закончился, прикрепляем оставшийся список
		if (l1 != null) {
			current.next = l1;
		} else if (l2 != null) {
			current.next = l2;
		}

		return list.next;
	}
}