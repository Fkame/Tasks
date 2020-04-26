import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		SecondTask obj = new SecondTask();
		Scanner in = new Scanner(System.in);

		// test 1
		System.out.println("\n-------Exercise #1 -----------");
        System.out.println(obj.repeat("mice", 5));
        System.out.println(obj.repeat("hello", 3));
        System.out.println(obj.repeat("stop", 1));
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter string to repeat: ");
        String s1 = in.nextLine();
        System.out.print("Enter repeat amount: ");
        int n1 = in.nextInt();
        System.out.println(obj.repeat(s1, n1));
        */
        
        // test 2
        System.out.println("\n-------Exercise #2 -----------");
        int[] a1 = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] a2 = {44, 32, 86, 19};
        System.out.println(obj.differenceMaxMin(a1));
        System.out.println(obj.differenceMaxMin(a2));
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter line of numbers across space each one: ");
       	String[] lines1 = in.nextLine().split(" ");
		int[] mas1 = new int[lines1.length];
		
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = Integer.parseInt(lines1[i]);
		}
		
		System.out.println(obj.differenceMaxMin(mas1));
        */
        
        // test 3
        System.out.println("\n-------Exercise #3 -----------");
        int[] a3 = {1, 2, 3, 4};
        int[] a4 = {1, 5, 6};
        int[] a5 = {1, 3};
        System.out.println(obj.isAvgWhole(a3));
        System.out.println(obj.isAvgWhole(a4));
        System.out.println(obj.isAvgWhole(a5));
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter line of numbers across space each one: ");
       	String[] lines2 = in.nextLine().split(" ");
		int[] mas2 = new int[lines2.length];
		
		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = Integer.parseInt(lines2[i]);
		}
		
		System.out.println(obj.isAvgWhole(mas2));
        */
        
        // test 4
        System.out.println("\n-------Exercise #4 -----------");
        int[] a6 = {1, 2, 3};
        int[] a7 = {1, -2, 3};
        int[] a8 = {3, 3, -2, 408, 3, 3};
        
        int[] rez1 = obj.cumulativeSum(a6);
        for (int i : rez1) System.out.print(i + " ");
        System.out.println("");
        
        rez1 = obj.cumulativeSum(a7);
        for (int i : rez1) System.out.print(i + " ");
        System.out.println("");
        
        rez1 = obj.cumulativeSum(a8);
        for (int i : rez1) System.out.print(i + " ");
        System.out.println("");
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter line of numbers across space each one: ");
       	String[] lines3 = in.nextLine().split(" ");
		int[] mas3 = new int[lines3.length];
		
		for (int i = 0; i < mas3.length; i++) {
			mas3[i] = Integer.parseInt(lines3[i]);
		}
		
		int[] rez2 = obj.cumulativeSum(mas3);
        for (int i : rez2) System.out.print(i + " ");
        System.out.println("");
        */
        
        // test 5
        System.out.println("\n-------Exercise #5 -----------");
        System.out.println(obj.getDecimalPlaces("43.20"));
        System.out.println(obj.getDecimalPlaces("400"));
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter number with decimal part (or not): ");
        String s2 = in.nextLine();
        System.out.println(obj.getDecimalPlaces(s2));
       	*/
        
        // test 6
        System.out.println("\n-------Exercise #6 -----------");
        System.out.println(obj.fibonacci(3));
        System.out.println(obj.fibonacci(7));
        System.out.println(obj.fibonacci(12));
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter number for Fibonacci sequence: ");
        int n3 = in.nextInt();
        System.out.println(obj.fibonacci(n3));
       	*/
        
        // test 7
        System.out.println("\n-------Exercise #7 -----------");
        System.out.println(obj.isValid("853a7"));
        System.out.println(obj.isValid("732 32"));
        System.out.println(obj.isValid("393939"));
        System.out.println(obj.isValid("59001"));
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter post-mark number to validate it: ");
        String s3 = in.nextLine();
        System.out.println(obj.isValid(s3));
       	*/
        
        // test 8
        System.out.println("\n-------Exercise #8 -----------");
        System.out.println(obj.isStrangePair("ratio", "orator"));
        System.out.println(obj.isStrangePair("sparkling", "groups"));
        System.out.println(obj.isStrangePair("bush", "hubris"));
        System.out.println(obj.isStrangePair("", ""));
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter strange str 1: ");
        String s4 = in.nextLine();
        System.out.print("Enter strange str 2: ");
        String s5 = in.nextLine();
         System.out.println(obj.isStrangePair(s4, s5));
       	*/
 
        // test 9
        System.out.println("\n-------Exercise #9 -----------");
        System.out.println(obj.isPrefix("automation", "auto-"));
        System.out.println(obj.isSuffix("arachnophobia", "-phobia"));
        System.out.println(obj.isPrefix("retrospect", "sub-"));
        System.out.println(obj.isSuffix("vocation", "-logy"));
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter word: ");
        String s7 = in.nextLine();
        System.out.print("Enter prefix: ");
        String s8 = in.nextLine();
        System.out.println(obj.isPrefix(s7, s8));
        
        System.out.print("Enter word: ");
        String s9 = in.nextLine();
        System.out.print("Enter suffix: ");
        String s10 = in.nextLine();
        System.out.println(obj.isPrefix(s9, s10));
       	*/
     
        // test 10
        System.out.println("\n-------Exercise #10 -----------");
        System.out.println(obj.boxSeq(0));
        System.out.println(obj.boxSeq(1));
        System.out.println(obj.boxSeq(2));
        
        /* Для пользовательского ввода убрать комментарий
        System.out.print("Enter step: ");
        int step = in.nextInt();
        System.out.println(obj.boxSeq(step));
        */	
	}
	
	/*
	 * Задание #1
	 * Создайте функцию, которая повторяет каждый символ в строке n раз. 
	 */
	public String repeat(String str, int n) {
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < n; j++) {
				build.append(str.charAt(i));
			}
		}	
		return build.toString();
	}
	
	/*
	 * Задание #2
	 * Создайте функцию, которая принимает массив и возвращает 
	 * разницу между самыми большими и самыми маленькими числами.
	 */
	public int differenceMaxMin(int[] array) {
		if (array.length < 1) return 0;
		int max = array[0];
		int min = array[0];
		for (int idx = 0; idx < array.length; idx++) {
			if (array[idx] > max) max = array[idx];
			if (array[idx] < min) min = array[idx];
		}
		return max - min;
	}
	
	/*
	 * Задание #3
	 * Создайте функцию, которая принимает массив в качестве аргумента и возвращает true или false 
	 * в зависимости от того, является ли среднее значение всех элементов массива целым числом или нет. 
	 */
	public boolean isAvgWhole(int[] array) {
		if (array.length < 1) return false;
		int sum = 0;
		for (int idx = 0; idx < array.length; idx++) {
			sum += array[idx];
		}
		
		return (sum % array.length == 0);
	}
	
	/*
	 * Задание #4
	 * Создайте метод, который берет массив целых чисел и возвращает массив, 
	 * в котором каждое целое число является суммой самого себя + всех предыдущих чисел в массиве.  
	 */
	public int[] cumulativeSum(int[] array) {
		if (array.length < 1) return null;
		
		int[] rez = new int[array.length];
		for (int i = 0; i < rez.length; i++) {
			int sum = 0;
			for (int j = 0; j <= i; j++) {
				sum+= array[j];
			}
			rez[i] = sum;
		}
		
		return rez;	
	}
	
	/*
	 * Задание #5
	 * Создайте функцию, которая возвращает число десятичных знаков, которое имеет число (заданное в виде строки). 
	 * Любые нули после десятичной точки отсчитываются в сторону количества десятичных знаков.
	 */
	public int getDecimalPlaces(String s) {
		if (s.indexOf(".") == -1) return 0;
		
		// Выделяем подстроку от точки до конца строки, и получаем её длину
		int len = s.substring(s.indexOf("."), s.length() - 1).length();
		return len;
	}
	
	/*
	 * Задание #6
	 * Создайте функцию, которая при заданном числе возвращает соответствующее число Фибоначчи
	 */
	public int fibonacci(int n) {
		if (n == 1) return 1;
		if (n == 2) return 2;
		return fibonacci(n - 1) + fibonacci(n - 2); 
	}
	
	/*
	 * Задание #7
	 * Почтовые индексы состоят из 5 последовательных цифр. 
	 * Учитывая строку, напишите функцию, чтобы определить, является ли вход действительным почтовым индексом. 
	 * Действительный почтовый индекс выглядит следующим образом: 
	 * – Должно содержать только цифры (не допускается использование нецифровых цифр). 
	 * – Не должно содержать никаких пробелов. 
	 * – Длина не должна превышать 5 цифр.   
	  */
	public boolean isValid(String address) {
		if (address.length() > 5) return false;
		if (address.indexOf(" ") != -1) return false;
		try {
			int check = Integer.parseInt(address);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/*
	 * Задание #8
	 * Пара строк образует странную пару, если оба из следующих условий истинны:
	 * – Первая буква 1-й строки = последняя буква 2-й строки. 
	 * – Последняя буква 1-й строки = первая буква 2-й строки. 
	 */
	public boolean isStrangePair (String arr1, String arr2) {
		if (arr1.length() == 0 || arr2.length() == 0) return false;
		return ((arr1.charAt(0) == arr2.charAt(arr2.length() - 1)) && (arr1.charAt(arr1.length() - 1) == arr2.charAt(0)));
	}
	
	/*
	 * Задание #9
	 * Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix). 
	 * – isPrefix должен возвращать true, если он начинается с префиксного аргумента. 
	 * – isSuffix должен возвращать true, если он заканчивается аргументом суффикса. 
	 * – В противном случае верните false.  
	 */
	public boolean isPrefix(String word, String prefix) {
		return word.startsWith(prefix.substring(0, prefix.length() - 1));
	}
	
	public boolean isSuffix(String word, String suffix) {
		return word.endsWith(suffix.substring(1));
	}
	
	/*
	 * Задание #10
	 */
	public int boxSeq(int step) {
		if (step == 0) return 0;
		if (step % 2 == 0) return step;
		return step + 2;
	}

}
