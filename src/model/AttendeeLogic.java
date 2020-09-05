package model;

public class AttendeeLogic {

	public boolean eligibleForClassPromotion(Attendee attendee) {
		// children less than 3 must be developmentally advanced to move up
		if (attendee.getAge() < 3) {
			if (attendee.getDevelopmentLevel() == "advanced") {
				return true;
			}
		}
		// children 3 and up must be potty trained to move up
		if (attendee.getPottyTrained() == "yes") {
			// and they must either be developmentally advanced or normal to move up
			if (attendee.getDevelopmentLevel() == "advanced") {
				return true;
			}
			else if (attendee.getDevelopmentLevel() == "normal") {
				return true;
			}
		}
		return false;
		
	}
	
	/* infant fee - $275, one - $250, two - $235, 
	 * three - $215, four - $200, five - $175, older - $125
	 */
	public double weeklyFee(Attendee attendee) {
		double fee = 0.00;
		int age = attendee.getAge();
		switch(age)
		{
			case 0: fee = 275.00; break;
			case 1: fee = 250.00; break;
			case 2: fee = 235.00; break;
			case 3: fee = 215.00; break;
			case 4: fee = 200.00; break;
			case 5: fee = 175.00; break;
			default: fee = 125.00;
		}
		return fee;
	}
	
	/* Only two reasons to waive fee is due to covid quarantine 
	 * or two week annual vacation allowance
	 */
	public boolean waiveFee(String reason) {
		if (reason == "Covid") {
			return true;
		}
		else if (reason == "Vacation") {
			return true;
		}
		else {
			return false;
		}
	}
}
