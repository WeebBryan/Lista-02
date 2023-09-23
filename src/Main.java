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

		System.out.println("1) Somatório: " + Utilidades.somatorio(vetor1));
		System.out.print("2) Números pares: ");
		Utilidades.numerosPares(inicio, fim);
		System.out.println("3) Média: " + Utilidades.media(vetor1, vetor2));
		System.out.println("4) Média ponderada: " + Utilidades.mediaPonderada(vetor1, vetor2));
		System.out.println("5) Contagem de elementos: " + Utilidades.contarElemento(vetor1, vetor2, elemento));
		System.out.println("6) Cópia de vetor: " + Arrays.toString(Utilidades.copiaVetor(vetor1)));
		System.out.println("7) Ordenação crescente: " + Arrays.toString(Utilidades.ordenacaoCrescente(vetor1)));
		System.out.println("8) Verificação de ordenação: " + Utilidades.estaOrdenado(vetor1));
		System.out.println("9) K-ésimo maior valor: " + Utilidades.kEsimoMaior(vetor1, 2));
		System.out.println("10) K-ésimo menor valor: " + Utilidades.kEsimoMenor(vetor1, 2));
		System.out.println("11) Verificação de igualdade: " + Utilidades.saoIguais(vetor1, vetor2));
		System.out.println("12) Potenciação: " + Utilidades.potenciacao(base, expoente));
		System.out.println("13) Primo: " + Utilidades.ehPrimo(7));
		System.out
				.println("14) Busca por ocorrências: " + Arrays.toString(Utilidades.buscaOcorrencias(vetor1, vetor2)));
		System.out.println(
				"15) Remoção de elemento do vetor: " + Arrays.toString(Utilidades.removerElemento(vetor1, elemento)));
		System.out.println("16) Verificação de palíndromo: " + Utilidades.ehPalindromo("ana"));
		System.out.println("17) Verificação de número primo: " + Utilidades.ehNumeroPrimo(7));
		System.out.println("18) Inversão de string: " + Utilidades.inverterString("hello"));
		System.out.println("19) Cálculo de juros compostos: " + Utilidades.calcularJurosCompostos(1000, 0.05, 3));
		System.out.println("20) Verificação de número perfeito: " + Utilidades.ehNumeroPerfeito(6));
		System.out.println("21) Diminuição do vetor:");
		Utilidades.diminuicaoDoVetor(5);
		System.out.println("22) Imprimir elementos:");
        System.out.println("Padrão a:");
        Utilidades.imprimirPadraoA(5);
        System.out.println("Padrão b:");
        Utilidades.imprimirPadraoB(5);
    }
}
