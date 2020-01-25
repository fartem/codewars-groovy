package com.smlnskgmail.jaman.codewars.groovy.kyu4

class SortedTreeTest extends GroovyTestCase {

	void testToList() {
		assertEquals(
				[],
				new SortedTree(null).toList()
				)
		assertEquals(
				[1, 2, 3, 4, 5, 6],
				new SortedTree(
						new Node(
								new Node(
										null,
										new Node(
												null,
												null,
												4
										),
										2
								),
								new Node(
										new Node(
												null,
												null,
												5
										),
										new Node(
												null,
												null,
												6
										),
										3
								),
								1
						)
				).toList()
		)
	}

}