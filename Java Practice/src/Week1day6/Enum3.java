package Week1day6;

interface Level{
	void no();
}

 enum MyLevel implements Level{
	
	L1 {
		public void no() {
			System.out.println("level 1");
		}
	},
	
	L2 {
		public void no() {
			System.out.println("level 2");
		}
	},
	
	L3 {
		public void no() {
			System.out.println("level 3");
		}
	}
	
}

public class Enum3 {
	public static void main(String[] args) {
		Level ab1 = MyLevel.L1;
		Level ab2 = MyLevel.L2;
		Level ab3 = MyLevel.L3;
		
		ab1.no();
		ab2.no();
		ab3.no();
	
	}
}
