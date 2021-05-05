
public class UyeSinifi implements Uye{
	Validate _validate;
	public UyeSinifi(Validate validate) {
		_validate=validate;
	}
	@Override
	public void add(Gamer gamer) {
		if (_validate.validate(gamer)==true) {
			System.out.println("New Gamer added!" + gamer.firstName);
		} else {
			System.out.println("Validated failed!");
		}
				
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted!" + gamer.firstName);
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated!" + gamer.firstName);
	}

}
