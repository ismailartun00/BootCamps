package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		// double[] myList = new double[4];
		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		
		for(double number : myList) {
			System.out.println(number);
			total += number;
			if(max < number) {
				max = number;
			}
		}
		System.out.println("En Buyuk sayi = " + max);
		System.out.println("Toplam = " + total);
		System.out.println();
	}

}
