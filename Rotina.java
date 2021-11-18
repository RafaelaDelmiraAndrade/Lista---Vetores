import java.util.Scanner;
public class Rotina {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		int i, a[], x;
		boolean encont;
		a = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"° número do vetor A: ");
			a[i] = in.nextInt();
		}
		System.out.println("Insira um número: ");
		x = in.nextInt();
		for(i=0; i<TAM; i++) {
			encont = false;
			for(i=0; i<TAM; i++) {
				if(x == a[i]) {
					encont = true;
				}
			}
			if(encont == true) {
				System.out.println("O elemento está armazenado no vetor A");
			}else {
				System.out.println("O elemento não está armazenado no vetor A");
			}
		}
	}

}
