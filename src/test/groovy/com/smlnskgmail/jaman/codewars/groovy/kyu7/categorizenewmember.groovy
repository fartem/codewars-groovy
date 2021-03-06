package com.smlnskgmail.jaman.codewars.groovy.kyu7

class CategorizeNewMemberTest extends GroovyTestCase {

	void testCategorized() {
		assertEquals(
				[
					'Open',
					'Senior',
					'Open',
					'Senior'
				],
				new CategorizeNewMember(
						[
								new Tuple(45, 12),
								new Tuple(55, 21),
								new Tuple(19, -2),
								new Tuple(104, 20)
						]
				).solution()
		)
		assertEquals(
				[
					'Open',
					'Open',
					'Senior',
					'Open'
				],
				new CategorizeNewMember(
						[
								new Tuple(16, 23),
								new Tuple(73, 1),
								new Tuple(56, 20),
								new Tuple(1, -1)
						]
				).solution()
		)
	}

}
