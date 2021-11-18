import java.util.Scanner;
public class Fatorial{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=15;
		int i, j, f=1, a[], b[];
		a = new int[TAM];
		b = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Insira um número inteiro: ");
			a[i] = in.nextInt();
		}
		for(i=0; i<TAM; i++) {
			f = 1;
			for(j=1; j<=a[i]; j++) {
				f = f*j;
			}
			b[i] = f;
		}
		System.out.print("\nA = [");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.print("\nB = [");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		in.close();
	}
	
}