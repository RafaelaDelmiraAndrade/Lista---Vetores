import java.util.Scanner;
public class ParesImpares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=20;
		int i, a[], contpar=0, contimpar=0;
		a = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"° número: ");
			a[i] = in.nextInt();
			if(a[i] % 2 == 0) {
				contpar++;
			}else {
				contimpar++;
			}
		}
		System.out.println("\nQuantidade de Pares = "+contpar+"\nQuantidade de Ímpares = "+contimpar);
		int par[], impar[], ipar=0, iimpar=0;
		par = new int[contpar];
		impar = new int[contimpar];
		for(i=0; i<TAM; i++) {
			if(a[i] % 2 == 0) {
				par[ipar] = a[i];
				ipar++;
			}else {
				impar[iimpar] = a[i];
				iimpar++;
			}
		}
		System.out.print("\n[");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.print("\nPares = [");
		for(i=0; i<contpar; i++) {
			System.out.print(par[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.print("\nÍmpares = [");
		for(i=0; i<contimpar; i++) {
			System.out.print(impar[i]+" ");
		}
		System.out.print("]");
		in.close();
	}

}