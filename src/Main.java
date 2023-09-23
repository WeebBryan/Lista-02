import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] vetor1 = { 1, 2, 3, 4, 5 };
		int[] vetor2 = { 4, 5, 6, 7, 8 };
		int elemento = 4;
		int inicio = 1;
		int fim = 10;
		int base = 2;
		int expoente = 3;

		System.out.println("1) Somat�rio: " + Utilidades.somatorio(vetor1));
		System.out.print("2) N�meros pares: ");
		Utilidades.numerosPares(inicio, fim);
		System.out.println("3) M�dia: " + Utilidades.media(vetor1, vetor2));
		System.out.println("4) M�dia ponderada: " + Utilidades.mediaPonderada(vetor1, vetor2));
		System.out.println("5) Contagem de elementos: " + Utilidades.contarElemento(vetor1, vetor2, elemento));
		System.out.println("6) C�pia de vetor: " + Arrays.toString(Utilidades.copiaVetor(vetor1)));
		System.out.println("7) Ordena��o crescente: " + Arrays.toString(Utilidades.ordenacaoCrescente(vetor1)));
		System.out.println("8) Verifica��o de ordena��o: " + Utilidades.estaOrdenado(vetor1));
		System.out.println("9) K-�simo maior valor: " + Utilidades.kEsimoMaior(vetor1, 2));
		System.out.println("10) K-�simo menor valor: " + Utilidades.kEsimoMenor(vetor1, 2));
		System.out.println("11) Verifica��o de igualdade: " + Utilidades.saoIguais(vetor1, vetor2));
		System.out.println("12) Potencia��o: " + Utilidades.potenciacao(base, expoente));
		System.out.println("13) Primo: " + Utilidades.ehPrimo(7));
		System.out
				.println("14) Busca por ocorr�ncias: " + Arrays.toString(Utilidades.buscaOcorrencias(vetor1, vetor2)));
		System.out.println(
				"15) Remo��o de elemento do vetor: " + Arrays.toString(Utilidades.removerElemento(vetor1, elemento)));
		System.out.println("16) Verifica��o de pal�ndromo: " + Utilidades.ehPalindromo("ana"));
		System.out.println("17) Verifica��o de n�mero primo: " + Utilidades.ehNumeroPrimo(7));
		System.out.println("18) Invers�o de string: " + Utilidades.inverterString("hello"));
		System.out.println("19) C�lculo de juros compostos: " + Utilidades.calcularJurosCompostos(1000, 0.05, 3));
		System.out.println("20) Verifica��o de n�mero perfeito: " + Utilidades.ehNumeroPerfeito(6));
		System.out.println("21) Diminui��o do vetor:");
		Utilidades.diminuicaoDoVetor(5);
		System.out.println("22) Imprimir elementos:");
        System.out.println("Padr�o a:");
        Utilidades.imprimirPadraoA(5);
        System.out.println("Padr�o b:");
        Utilidades.imprimirPadraoB(5);
    }
}
