package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.ArrayList;
import java.util.List;

public class ModifyList {
	public static void main(String[] args) {
		List<Integer> originalList = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			originalList.add(i);
		}
		
		System.out.println("Original list: " + originalList);
		
		ElementRemovalResult removalResult = removeElement(originalList, 3);
		System.out.println("After removing element : " + removalResult.getList());
		
		List<Integer> listAfterAdd = addElement(removalResult.getList(), removalResult.getIndex(), 3);
		System.out.println("After adding element : " + listAfterAdd);
	}
	
	static class ElementRemovalResult {
		private final List<Integer> list;
		private final int index;
		
		public ElementRemovalResult(List<Integer> list, int index) {
			this.list = list;
			this.index = index;
		}
		
		public List<Integer> getList() {
			return list;
		}
		
		public int getIndex() {
			return index;
		}
	}
	
	public static ElementRemovalResult removeElement(List<Integer> list, int element) {
		List<Integer> newList = new ArrayList<>(list);
		int index = newList.indexOf(element);
		if (index != -1) {
			newList.remove(index);
		}
		return new ElementRemovalResult(newList, index);
	}
	
	public static List<Integer> addElement(List<Integer> list, int index, int element) {
		List<Integer> newList = new ArrayList<>(list);
		if (index != -1 && index <= newList.size()) {
			newList.add(index, element);
		}
		return newList;
	}
}
