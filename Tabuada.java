import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		int i, j, a[], r;
		a = new int[TAM];
		for(j=0; j<TAM; j++) {
			System.out.println("Insira um número:");
			a[j] = in.nextInt();
			System.out.println();
			System.out.println("Tabuada do "+a[j]+"\n");
			for(i=1; i<=10; i++) {
				r = a[j]*i;
				System.out.println(a[j]+" x "+i+" = "+r);
			}
			System.out.println();
		}
		in.close();
	}

}