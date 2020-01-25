package com.smlnskgmail.jaman.codewars.groovy.kyu4

import groovy.transform.TupleConstructor

/*
 * https://www.codewars.com/kata/52bef5e3588c56132c0003bc
 */
@TupleConstructor
class SortedTree {

	Node node

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

@TupleConstructor
class Node {

	Node left
	Node right
	Integer value

}
