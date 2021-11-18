public class Potencia {
	public static void main(String[] args) {
		final int TAM=11;
		int i, a[], p=1;
		a = new int[TAM];
		for(i=0; i<TAM; i++) {
			a[i] = p;
			System.out.println("2^"+i+" = "+a[i]+"\n");
			p = p*2;
		}
	}

}