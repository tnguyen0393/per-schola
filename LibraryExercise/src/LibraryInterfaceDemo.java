
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		KidUsers tien = new KidUsers();
		KidUsers carlos = new KidUsers();
		
		tien.setAge(10);
		carlos.setAge(18);
		tien.registerAccount();
		carlos.registerAccount();
		
		tien.setBookType("Kids");
		carlos.setBookType("Fiction");
		tien.requestBook();
		carlos.requestBook();
		
		AdultUser steve = new AdultUser();
		AdultUser john = new AdultUser();
		
		steve.setAge(5);
		john.setAge(23);
		steve.registerAccount();
		john.registerAccount();
		
		steve.setBookType("Kids");
		john.setBookType("Fiction");
		steve.requestBook();
		john.requestBook();
	}

}
