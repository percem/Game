
public class Main {

	public static void main(String[] args) {
		UyeSinifi uyeSinifi=new UyeSinifi(new ValidateSinifi());
		Gamer oyuncu=new Gamer();
		oyuncu.gamerId=1;
		oyuncu.firstName="Ümmühan";
		oyuncu.lastName="Perçem";
		oyuncu.birthYear="1997";
		oyuncu.TCNo=1234567890;
		uyeSinifi.add(oyuncu);
}
}
