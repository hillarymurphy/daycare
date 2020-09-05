package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Attendee;
import model.AttendeeLogic;
import model.Classroom;

public class TestAttendeeLogic {

	AttendeeLogic attendLogic = new AttendeeLogic();
	Classroom ladybugs = new Classroom("Ladybugs", 2, 2, 11);
	Classroom butterflies = new Classroom("Ladybugs", 2, 2, 11);
	Classroom grasshoppers = new Classroom("Grasshoppers", 6, 2, 30);
	Attendee lizzy = new Attendee("Lizzy", 2, "female", "no", "advanced", ladybugs);
	Attendee betsy = new Attendee("Betsy", 2, "female", "no", "normal", ladybugs);
	Attendee beth = new Attendee("Beth", 3, "female", "no", "advanced", butterflies);
	Attendee betty = new Attendee("Betty", 3, "female", "yes", "normal", butterflies);
	Attendee liz = new Attendee("Liz", 6, "female", "yes", "normal", grasshoppers);
	
	@Before
	public void setUp() throws Exception {

	}

	// test to show kids under 3 are promoted to the next class only on development level
	@Test
	public void testTrueLizzyEligibleForClassPromotion() {
		boolean promote = attendLogic.eligibleForClassPromotion(lizzy);
		assertTrue(promote);
	}
	
	// test to show kids under 3 are promoted to the next class won't be advanced based on development level
	@Test
	public void testFalseBetsyEligibleForClassPromotion() {
		boolean promote = attendLogic.eligibleForClassPromotion(betsy);
		assertFalse(promote);
	}
	
	// kids 3 and up must be potty trained and normal to advanced to be bumped up
	@Test
	public void testFalseBethEligibleForClassPromotion() {
		boolean promote = attendLogic.eligibleForClassPromotion(beth);
		assertFalse(promote);
	}
	
	// kids 3 and up must be potty trained and normal to advanced to be bumped up
	@Test
	public void testTrueBettyEligibleForClassPromotion() {
		boolean promote = attendLogic.eligibleForClassPromotion(betty);
		assertTrue(promote);
	}
	
	// 2 year old fee is 235
	@Test
	public void testTwosWeeklyFee() {
		double fee = attendLogic.weeklyFee(lizzy);
		assertEquals(235, fee, 0.0);
	}

	// default fee is 125
	@Test
	public void testDefaultWeeklyFee() {
		double fee = attendLogic.weeklyFee(liz);
		assertEquals(125, fee, 0.0);
	}
	
	// test for waiving fee being allowed
	@Test
	public void testTrueWaiveFee() {
		String reason = "Covid";
		boolean fee = attendLogic.waiveFee(reason);
		assertTrue(fee);
	}

	// test for waiving fee not allowed
	@Test
	public void testFalseWaiveFee() {
		String reason = "Lice";
		boolean fee = attendLogic.waiveFee(reason);
		assertFalse(fee);
	}
}
