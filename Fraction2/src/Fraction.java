
public class Fraction {
	//Fields Go Here
	//Hint: What things do all fractions have
	private int numerator;
	private int denominator;
	
	//Constructors go here
	public Fraction(){  // no args constructor, 
		//Hint: What is the most basic fraction you can think of?
		numerator = 1;
		denominator = 1;
	}

	public Fraction(int num, int denom){  //second constructor
		 numerator = num;
		 denominator = denom;
	}
	
	
	//Methods go here
	public boolean equals(Fraction f){ 
		//How can you tell that one fraction is equal to another
		//Right now you only need to make sure the numerators and denominators are equal
		//example: 3/5 does not equal 6/10 right now
		if(this.numerator == f.numerator && this.denominator == f.denominator){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean equals(int i){ 
		//How can you that tell that one fraction is equal to an integer
		if(i*this.denominator == this.numerator){
			return true;
		}else{
			return false;
		}
	}
	
	public Fraction add(Fraction f){
		//how do you add two fractions together? You do not need to reduce at this point
		int lcm = this.denominator * f.denominator;
		int num = this.numerator * f.denominator + this.denominator * f.numerator;
		return new Fraction(num,lcm);
	}
	
	public Fraction add(int i){
		//how do you add a fraction with an integer
		int num = this.numerator+i*this.denominator;
		return new Fraction(num,this.denominator);
	}
	
	public Fraction multiply(Fraction f){
		//how do you multiply two fractions
		return new Fraction(this.numerator*f.numerator,this.denominator*f.denominator);
	}
	
	public Fraction multiply(int i){
		//how do you multiply a fraction with an integer
		return new Fraction(this.numerator*i,this.denominator);
	}
	
	public boolean isPositive(){
		//Returns true if the fraction is positive, false otherwise
		//pretend 0 is positive
		if(this.numerator>=0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isWholeNumber(){
		//Returns true if the fraction is reducible to a whole number 
		if(this.numerator % this.denominator==0 && this.numerator >=0){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return numerator+"/"+denominator;
	}
	
	/**
	 * TO BE IMPLEMENTED IN THE FUTURE
	 */
	public void reduce(){
		//how do you reduce a fraction so it is in the simplest form
		int min = Math.min(numerator, denominator);
		for(int i = min;i>=2;i--){
			if(numerator % i == 0 && denominator % i == 0){
				numerator/=i;
				denominator/=i;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
