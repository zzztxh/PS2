package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	
	public boolean isEven () {
		return (iValue % 2 == 0 ? true : false);
		}
	public boolean isOdd() {
		return (iValue % 2 == 1 ? true : false);
		}
	public boolean isPrime() {
		for (int i=2;2*i<iValue;i++) {
			if (iValue%i==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}

	public static boolean isOdd(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}

	public static boolean isPrime(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}

	public static boolean isEven(MyInteger iValue) {
		return iValue.isEven();
	}

	public static boolean isOdd(MyInteger iValue) {
		return iValue.isOdd();
	}

	public static boolean isPrime(MyInteger iValue) {
		return iValue.isPrime();
	}

	public boolean equals(int iValue){
		if (iValue == this.iValue)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger iValue){
		if (iValue.getiValue() == this.iValue)
			return true;
		else
			return false;
	}
	}
