package DogExercise;

public class Main {

	public static void main(String[] args) {
		MyDog lio = new MyDog("Dachshund", "Lio", "Brown", 2018);
		MyDog mochi = new MyDog("Husky", "Mochi", "White", 2017);
		
		lio.walk();
		lio.sleep();
		mochi.eat("hotdog");
		mochi.isAsleep();
		
		lio.wakeUp();
		lio.eat("eggs");
		mochi.info();
		lio.info();
		
		System.out.println(lio.getHomeAddress());
		
		lio.move("California");
		
		System.out.println(mochi.getHomeAddress());
		System.out.println(lio.checkupNeeded(lio));
		System.out.println(mochi.checkupNeeded(mochi));
		
	}

}
