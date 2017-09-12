
public class FractionTester {
	
	public static void testAll(){
		testAdd();
		testEquals();
		testMultiply();
		testIsPositive();
		testIsWholeNumber();
	}
	
	public static void testAdd(){
		System.out.println("Testing Add...");
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,4);
		System.out.println("1/2+3/4 is... Expected Answer: 10/8, Your Solution: " +f1.add(f2));
		f1 = new Fraction(3,5);
		f2 = new Fraction(7,5);
		System.out.println("3/5+7/5 is... Expected Answer: 10/5, Your Solution: " +f1.add(f2));
		f1 = new Fraction(1,2);
		System.out.println("1/2+3 is... Expected Answer: 7/2 Your Solution: " +f1.add(3));
		System.out.println("Complete\n\n");
	}
	
	public static void testEquals(){
		System.out.println("Testing Equals...");
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,4);
		System.out.println("1/2 equals 3/4 Expected Answer: False, Your Solution: " +f1.equals(f2));
		f1 = new Fraction(3,5);
		f2 = new Fraction(3,5);
		System.out.println("3/5 equals 6/10 Expected Answer: True, Your Solution: " +f1.equals(f2));
		f1 = new Fraction(4,2);
		System.out.println("4/2 equals 2 Expected Answer: True, Your Solution: " +f1.equals(3));
		System.out.println("Complete\n\n");
	}
	
	public static void testMultiply(){
		System.out.println("Testing Multiply...");
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,4);
		System.out.println("1/2*3/4 is... Expected Answer: 3/8, Your Solution: " +f1.multiply(f2));
		f1 = new Fraction(3,5);
		f2 = new Fraction(6,10);
		System.out.println("3/5*6/10 is... Expected Answer: 18/50, Your Solution: " +f1.multiply(f2));
		f1 = new Fraction(4,2);
		System.out.println("4/2*2 is... Expected Answer: 8/2, Your Solution: " +f1.multiply(3));
		System.out.println("Complete\n\n");
	}
	
	public static void testIsPositive(){
		System.out.println("Testing isPositive...");
		Fraction f1 = new Fraction(1,2);
		System.out.println("Is 1/2 positive... Expected Answer: True, Your Solution: " +f1.isPositive());
		f1 = new Fraction(-3,5);
		System.out.println("Is -3/5 positive... Expected Answer: False, Your Solution: " +f1.isPositive());
		f1 = new Fraction(4,2);
		System.out.println("Is 4/2 positive... Expected Answer: True, Your Solution: " +f1.isPositive());
		System.out.println("Complete\n\n");
	}
	public static void testIsWholeNumber(){
		System.out.println("Testing isWholeNumber");
		Fraction f1 = new Fraction(1,2);
		System.out.println("Is 1/2 a whole number... Expected Answer: False, Your Solution: " +f1.isWholeNumber());
		f1 = new Fraction(-10,5);
		System.out.println("Is -10/5 a whole number... Expected Answer: False, Your Solution: " +f1.isWholeNumber());
		f1 = new Fraction(4,2);
		System.out.println("Is 4/2 a whoe number... Expected Answer: True, Your Solution: " +f1.isWholeNumber());
		System.out.println("Complete\n\n");
	}

	public static void main(String[] args) {
		testAll();
	}

}
