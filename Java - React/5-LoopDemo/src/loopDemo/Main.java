package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nFor D�ng�s� Bitti.\n");
		
		// While
		int i = 1;
		while(i<10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\nWhile D�ng�s� Bitti.\n");
		
		//Do-While
		int j = 1;
		do {
			System.out.print(j + " ");
			j++;
		}while(j<10);
		System.out.println("\nDo-While D�ng�s� Bitti.\n");
	}

}
