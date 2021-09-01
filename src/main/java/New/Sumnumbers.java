package New;

public class Sumnumbers {
	public int sum(int a,int b) {
		if(a<=15)
			throw new IllegalArgumentException("Value should be less than 15");
		return a+b;
	}

}
