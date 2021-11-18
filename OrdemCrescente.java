import java.util.Scanner;
public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		int i=0, j=0, a[], guardar=0;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"° número do vetor A: ");
			a[i] = in.nextInt();
				}
		
	for(i=0; i<TAM; i++) {
		for(j=0; j<TAM; j++) {
			
			if(a[i] < a[j]) {
				guardar = a[i];
				a[i] = a[j];
				a[j] = guardar;
			   }
			}
		}
	    System.out.println();
		System.out.print("\nOrdem crescente = [");
		for( j=0; j < TAM; j++) {
			System.out.print(a[j]+ ", ");
		}
		System.out.print("]");
		in.close();
	}
}
