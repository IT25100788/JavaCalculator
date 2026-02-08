public class Calculator {
	
	//Addition
	int add(int a, int b) {
	return a + b;
	}
	
	//Multiply
	int multiply(int a, int b){
	return a*b;
	}

	//square
	int square(int a){
	return a*a;
	}

	public static void main(String[] args){
			Calculator calc = new Calculator();
			
			//Expression 1
			int part1 = calc.multiply(3,4);
			int part2 = calc.multiply(5,7);
			int sum = calc.add(part1, part2);
			int result1 = calc.square(sum);
			
			//Epression 2
			int sum1 = calc.add(4,7);
			int sum2 = calc.add(8,3);
			int sum3 = calc.square(sum1);
			int sum4 = calc.square(sum2);
			int result2 = calc.add(sum3, sum4);
			
			//output
			System.out.println("Result of (3 * 4 + 5 * 7) ^ 2 = "+ result1);
			System.out.println("Result of (4 + 7) ^ 2 + (8 + 3) ^ 2= "+ result2);
	}




} 