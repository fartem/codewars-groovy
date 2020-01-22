package com.smlnskgmail.jaman.codewars.groovy.kyu4

/*
 * https://www.codewars.com/kata/52bef5e3588c56132c0003bc
 * */
class SortedTree {

	private node

	SortedTree(node) {
		this.node = node
	}

	List toList() {
		def result = []
		if (node != null) {
			def tree = [node] as Queue

			def tempNode
			while (tree) {
				tempNode = tree.poll()
				result << tempNode.value
				if (tempNode.left) {
					tree << tempNode.left
				}
				if (tempNode.right) {
					tree << tempNode.right
				}
			}
		}
		result
	}
}

class Node {

	Integer value
	Node left
	Node right

	Node(left, right, value) {
		this.value = value
		this.left = left
		this.right = right
	}
}