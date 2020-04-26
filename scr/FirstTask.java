import java.util.Scanner;

/*
* ���� ���������������� ���� ��������� �� ������������ ����������, ����� - ����� ������� ����� ���������� � ������� ���������.
*/
public class FirstTask {
	
	public static void main(String[] args) {
		FirstTask obj = new FirstTask();
		Scanner in = new Scanner(System.in);
		
		//test 1
		System.out.println("-------Exercise #1 -----------");
		System.out.println(obj.remainder(1, 3));
		System.out.println(obj.remainder(3, 4));
		System.out.println(obj.remainder(-9, 45));
		System.out.println(obj.remainder(5, 5));
		
		// test 2
		System.out.println("\n-------Exercise #2 -----------");
		System.out.println(obj.triArea(3, 2));
		System.out.println(obj.triArea(7, 4));
		System.out.println(obj.triArea(10, 10));
		
		/* ��� ����������������� ����� ������ �����������
		System.out.print("Enter height of triangle: ");
		double h = in.nextDouble();
		System.out.print("Enter width of triangle base: ");
		double a = in.nextDouble();
		System.out.println(obj.triArea(h, a));
		*/
		
		// test 3
		System.out.println("\n-------Exercise #3 -----------");
		System.out.println(obj.animals(2, 3, 5));
		System.out.println(obj.animals(1, 2, 3));
		System.out.println(obj.animals(5, 2, 8));
		
		/* ��� ����������������� ����� ������ �����������
		System.out.print("Enter amount of chickens on farm: ");
		int chickens = in.nextInt();
		System.out.print("Enter amount of cows on farm: ");
		int cows = in.nextInt();
		System.out.print("Enter amount of pigs on farm: ");
		int pigs = in.nextInt();
		System.out.println(obj.animals(chickens, cows, pigs));
		*/
		
		// test 4
		System.out.println("\n-------Exercise #4 -----------");
		System.out.println(obj.profitableGamble(0.2, 50, 9));
		System.out.println(obj.profitableGamble(0.9, 1, 2));
		System.out.println(obj.profitableGamble(0.9, 3, 2));
		
		/* ��� ����������������� ����� ������ �����������
		System.out.print("Enter prob: ");
		double prob = in.nextDouble();
		System.out.print("Enter price: ");
		double price = in.nextDouble();
		System.out.print("Enter pay: ");
		double pay = in.nextDouble();
		System.out.println(obj.profitableGamble(prob, price, pay));
		*/
		
		// test 5
		System.out.println("\n-------Exercise #5 -----------");
		System.out.println(obj.operation(24, 15, 9));
		System.out.println(obj.operation(24, 26, 2));
		System.out.println(obj.operation(15, 11, 11));
		
		/* ��� ����������������� ����� ������ �����������
		System.out.print("Enter number 1: ");
		double oper1 = in.nextDouble();
		System.out.print("Enter number 2: ");
		double oper2 = in.nextDouble();
		System.out.print("Enter fin number: ");
		double oper3 = in.nextDouble();
		System.out.println(obj.profitableGamble(oper3, oper1, oper2));
		*/
		
		// test 6
		System.out.println("\n-------Exercise #6 -----------");
		System.out.println(obj.ctoa('A'));
		System.out.println(obj.ctoa('m'));
		System.out.println(obj.ctoa('['));
		System.out.println(obj.ctoa('\\'));
		
		/* ��� ����������������� ����� ������ �����������
		System.out.print("Enter ASCII char to get it number code: ");
		String ch = in.next();
		System.out.println(obj.ctoa(ch.charAt(0)));
		*/
		
		// test 7
		System.out.println("\n-------Exercise #7 -----------");
		System.out.println(obj.addUpTo(3));
		System.out.println(obj.addUpTo(10));
		System.out.println(obj.addUpTo(7));
		
		/* ��� ����������������� ����� ������ �����������
		System.out.print("Enter number for sum sequence: ");
		int lineNumber = in.nextInt();
		System.out.println(obj.addUpTo(lineNumber));
		*/
		
		// test 8
		System.out.println("\n-------Exercise #8 -----------");
		System.out.println(obj.nextEdge(8, 10));
		System.out.println(obj.nextEdge(5, 7));
		System.out.println(obj.nextEdge(9, 2));
		
		/* ��� ����������������� ����� ������ �����������
		System.out.print("Enter first edge: ");
		int edge1 = in.nextInt();
		System.out.print("Enter second edge: ");
		int edge2 = in.nextInt();
		System.out.println(obj.nextEdge(edge1, edge2));
		*/
		
		// test 9
		System.out.println("\n-------Exercise #9 -----------");
		int[] mas1 = {1, 5, 9};
		int[] mas2 = {3, 4, 5};
		int[] mas3 = {2};
		int[] mas4 = {};
		System.out.println(obj.sumOfCubes(mas1));
		System.out.println(obj.sumOfCubes(mas2));
		System.out.println(obj.sumOfCubes(mas3));
		System.out.println(obj.sumOfCubes(mas4));
		
		/* ��� ����������������� ����� ������ �����������
		System.out.print("Enter number array (write numbers across the space):\n");
		String[] lines = in.nextLine().split(" ");
		int[] mas = new int[lines.length];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = Integer.parseInt(lines[i]);
		}
		
		System.out.println(obj.sumOfCubes(mas));
		*/
		
		// test 10
		System.out.println("\n-------Exercise #10 -----------");
		System.out.println(obj.abcMath(42, 5 ,10));
		System.out.println(obj.abcMath(5, 2 ,1));
		System.out.println(obj.abcMath(1, 2 ,3));
		
		/* ��� ����������������� ����� ������ �����������
		System.out.print("Enter number: ");
		int nb1 = in.nextInt();
		System.out.print("Enter amount for repeats: ");
		int nb2 = in.nextInt();
		System.out.print("Enter check-value: ");
		int nb3 = in.nextInt();
		System.out.println(obj.abcMath(nb1, nb2, nb3));
		*/
		
		System.out.println("\n-------End of First Task -----------");
	}
	
	/*
	* ������� #1
	* ������� ������� ������� �� ������� ������� ��������� �� ������
	*/
	public int remainder(int a, int b) {
		return a % b;
	}
	
	/*
	* ������� #2
	* ������� ����������� ������� ������������.
	* ��������� ������ � ������ ���������
	*/
	public double triArea(double h, double a) {
		return 0.5 * a * h;
	}
	
	/*
	* ������� #3
	* ������� ����������� ���������� ��� �������� �� �� ���������� �� �����.
	* ��������� ���������� �����, �����, � ������.
	*/
	public int animals(int ch, int co, int pi) {
		return ch * 2 + co * 4 + pi * 4;
	}
	
	/*
	* ������� #4
	* ������� ���������� true, ���� prob * prize > pay; � ��������� ������ ���������� false.
	* ��������� ��������� ��� ��������� (prob, prize, pay).
	*/
	public boolean profitableGamble(double prob, double prize, double pay) {
		return prob * prize > pay;
	}
	
	/*
	* ������� #5
	* ������� ����������, ��� ����� ������� � a � b: ��� ������ ���� �������, ��������, �������� ��� ���������, ����� �������� N
	* ��������� ��������� ��� ��������� (n, a, b).
	*/
	public String operation(double n, double a, double b) {
		// ���� � ���� double �������� ����
		if (Math.abs(a + b - n) < 0.000001) return "added";
		if (Math.abs(Math.abs(a - b) - n) < 0.000001) return "subtracted";
		
		// ����� 2 ��������, ��� ��� ��� ��������� ������� - �������� ���������
		if (Math.abs(a / b - n) < 0.000001) return "divided";
		if (Math.abs(b / a - n) < 0.000001) return "divided";
		if (Math.abs(a * b - n) < 0.000001) return "multiplied";
		return "none";
	}
	
	/*
	* ������� #6
	* ������� ���������� �������� ASCII ����������� ������
	* ASCII �������
	*/
	public int ctoa(char ch) {
		// ���������� �������������� ����
		return ch;
	}
	
	/*
	* ������� #7
	* ������� ���������� ����� ���� ����� �� ��������� ����� � ������� ���.
	* ���� ������������� �����
	*/
	public int addUpTo(int a) {
		if (a == 0) return 0; 
		return a + this.addUpTo(a - 1);
	}
	
	/*
	* ������� #8
	* ������� ������� ������������ �������� �������� ����� ������������.
	* ��������� ��� ����� ������������
	*/
	public int nextEdge(int a, int b) {
		double a1 = a;
		double b1 = b;
		double sum = Math.sqrt(a1 * a1 + b1 * b1 - 2 * a1 * b1 * Math.cos(0));
		int maxI = 0;
		
		for (int i = 0; i < 180; i++) {
			double rez = Math.sqrt(a1 * a1 + b1 * b1 - 2 * a1 * b1 * Math.cos(i));
			if (rez > sum ) {
				sum = rez;
				maxI = i;
			}
		}
		
		//System.out.println("a = " + a + ", i1 = " + i1);
		return (int)sum;
	}
	
	/*
	* ������� #9
	* ������� ��������� ������ ����� � ���������� ����� ��� �����.
	*/
	public int sumOfCubes(int[] a) {
		int rez = 0;
		for (int num : a) {
			rez += Math.pow(num, 3);
		}
		return rez;
	}
	
	/*
	* ������� #10
	* ������� ���������� ��������� ����������: ���������� ����� � � ���� � ���,
	* 	����� ���� ���������, ������� �� ���������� ����� �� �.
	* ������� ���������: �, �, � - ����� �����
	* �������� �������� - boolean.
	*/
	public boolean abcMath(int a, int b, int c) {
		int rez = a;
		for (int i = 0; i < b; i++) {
			rez += rez;
			//System.out.println("i = " + (i + 1) + ", rez = " + rez);
		} 
		return rez % c == 0;
	}
}