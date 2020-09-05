package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Classroom;
import model.ClassroomLogic;

public class TestClassroomLogic {

	ClassroomLogic classLogic = new ClassroomLogic();
	Classroom ladybugs = new Classroom("Ladybugs", 2, 2, 11);
	Classroom dragonflies = new Classroom("Dragonflies", 4, 2, 14);
	
	@Before
	public void setUp() throws Exception {

	}
	
	// test for eligible capacity for the two year old room
	@Test
	public void testTwoEligibleCapacity() {
		int totAllowed = classLogic.eligibleCapacity(ladybugs);
		assertEquals(12, totAllowed);
	}
	
	// test for eligible capacity for the three year old room
	@Test
	public void testFourEligibleCapacity() {
		int totAllowed = classLogic.eligibleCapacity(dragonflies);
		assertEquals(20, totAllowed);
	}

	// test for true case to say room is eligible for an opening
	@Test 
	public void testTrueOpeningEligible() {
		int totalAllowed = 12;
		boolean opening = classLogic.openingEligible(ladybugs, totalAllowed);
		assertTrue(opening);
	}
	
	// test for false case to say room is not eligible for opening
	@Test 
	public void testFalseOpeningEligible() {
		int totalAllowed = 10;
		boolean opening = classLogic.openingEligible(ladybugs, totalAllowed);
		assertFalse(opening);
	}

}
