
public class ValidateSinifi implements Validate{

	@Override
	public Boolean validate(Gamer gamer) {
		if (gamer.firstName=="�mm�han"&&gamer.lastName=="Per�em"&&
			gamer.gamerId==1&&gamer.birthYear=="1997" &&gamer.TCNo==1234567890) {
			return true;
			
		} else {
			return false;
		}
	}

}
