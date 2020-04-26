import java.util.Scanner;

/*
* Весь пользовательский ввод рассчитан на безошибочное заполнение, иначе - очень быстрое очень исключение в неочень программу.
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
		
		/* Для пользовательского ввода убрать комментарий
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
		
		/* Для пользовательского ввода убрать комментарий
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
		
		/* Для пользовательского ввода убрать комментарий
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
		
		/* Для пользовательского ввода убрать комментарий
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
		
		/* Для пользовательского ввода убрать комментарий
		System.out.print("Enter ASCII char to get it number code: ");
		String ch = in.next();
		System.out.println(obj.ctoa(ch.charAt(0)));
		*/
		
		// test 7
		System.out.println("\n-------Exercise #7 -----------");
		System.out.println(obj.addUpTo(3));
		System.out.println(obj.addUpTo(10));
		System.out.println(obj.addUpTo(7));
		
		/* Для пользовательского ввода убрать комментарий
		System.out.print("Enter number for sum sequence: ");
		int lineNumber = in.nextInt();
		System.out.println(obj.addUpTo(lineNumber));
		*/
		
		// test 8
		System.out.println("\n-------Exercise #8 -----------");
		System.out.println(obj.nextEdge(8, 10));
		System.out.println(obj.nextEdge(5, 7));
		System.out.println(obj.nextEdge(9, 2));
		
		/* Для пользовательского ввода убрать комментарий
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
		
		/* Для пользовательского ввода убрать комментарий
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
		
		/* Для пользовательского ввода убрать комментарий
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
	* Задание #1
	* Функция выводит остаток от деления первого аргумента на второй
	*/
	public int remainder(int a, int b) {
		return a % b;
	}
	
	/*
	* Задание #2
	* Функция расчитывает площадь треугольника.
	* Принимает высоту и ширину основания
	*/
	public double triArea(double h, double a) {
		return 0.5 * a * h;
	}
	
	/*
	* Задание #3
	* Функция расчитывает количество ног животных по их количеству на ферме.
	* Принимает количество курей, коров, и свиней.
	*/
	public int animals(int ch, int co, int pi) {
		return ch * 2 + co * 4 + pi * 4;
	}
	
	/*
	* Задание #4
	* Функция возвращает true, если prob * prize > pay; в противном случае возвращает false.
	* Принимает принимает три аргумента (prob, prize, pay).
	*/
	public boolean profitableGamble(double prob, double prize, double pay) {
		return prob * prize > pay;
	}
	
	/*
	* Задание #5
	* Функция возвращает, что нужно сделать с a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы получить N
	* Принимает принимает три аргумента (n, a, b).
	*/
	public String operation(double n, double a, double b) {
		// Типа у типа double возможны мирк
		if (Math.abs(a + b - n) < 0.000001) return "added";
		if (Math.abs(Math.abs(a - b) - n) < 0.000001) return "subtracted";
		
		// Здесь 2 варианта, так как при изменении порядка - меняется результат
		if (Math.abs(a / b - n) < 0.000001) return "divided";
		if (Math.abs(b / a - n) < 0.000001) return "divided";
		if (Math.abs(a * b - n) < 0.000001) return "multiplied";
		return "none";
	}
	
	/*
	* Задание #6
	* Функция возвращает значение ASCII переданного символ
	* ASCII символа
	*/
	public int ctoa(char ch) {
		// Происходит авторасширение типа
		return ch;
	}
	
	/*
	* Задание #7
	* Функция возвращает сумму всех чисел до введённого числа и включая его.
	* Одно целочисленное число
	*/
	public int addUpTo(int a) {
		if (a == 0) return 0; 
		return a + this.addUpTo(a - 1);
	}
	
	/*
	* Задание #8
	* Функция находит максимальное значение третьего ребра треугольника.
	* Принимает два ребра треугольника
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
	* Задание #9
	* Функция принимает массив чисел и возвращает сумму его кубов.
	*/
	public int sumOfCubes(int[] a) {
		int rez = 0;
		for (int num : a) {
			rez += Math.pow(num, 3);
		}
		return rez;
	}
	
	/*
	* Задание #10
	* Функция производит следующее вычисление: прибавляет число А к себе В раз,
	* 	после чего проверяет, делится ли полученное число на С.
	* Входные параметры: А, В, С - целые числа
	* Выходной параметр - boolean.
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