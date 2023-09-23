import java.util.Arrays;

public class Utilidades {
	// 1) Somatório
	public static int somatorio(int[] vetor) {
		int sum = 0;
		for (int i = 2; i < vetor.length - 2; i++) {
			sum += vetor[i];
		}
		return sum;
	}

	// 2) Números pares
	public static void numerosPares(int inicio, int fim) {
		for (int i = inicio; i <= fim; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// 3) Média
	public static double media(int[] vetor1, int[] vetor2) {
		double sum = Arrays.stream(vetor1).sum() + Arrays.stream(vetor2).sum();
		int totalElements = vetor1.length + vetor2.length;
		return sum / totalElements;
	}

	// 4) Média ponderada
	public static double mediaPonderada(int[] notas, int[] pesos) {
		if (notas.length != pesos.length) {
			System.out.println("Os vetores de notas e pesos devem ter o mesmo tamanho.");
		}

		double somaProdutos = 0;
		double somaPesos = 0;

		for (int i = 0; i < notas.length; i++) {
			somaProdutos += notas[i] * pesos[i];
			somaPesos += pesos[i];
		}

		return somaProdutos / somaPesos;
	}

	// 5) Contagem de elementos
	public static int contarElemento(int[] vetor1, int[] vetor2, int elemento) {
		int count = 0;
		for (int num : vetor1) {
			if (num == elemento) {
				count++;
			}
		}
		for (int num : vetor2) {
			if (num == elemento) {
				count++;
			}
		}
		return count;
	}

	// 6) Cópia de vetor
	public static int[] copiaVetor(int[] vetor) {
		return Arrays.copyOf(vetor, vetor.length);
	}

	// 7) Ordenação crescente
	public static int[] ordenacaoCrescente(int[] vetor) {
		int[] copia = copiaVetor(vetor);
		Arrays.sort(copia);
		return copia;
	}

	// 8) Verificação de ordenação
	public static boolean estaOrdenado(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			if (vetor[i] > vetor[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// 9) K-ésimo maior valor
	public static int kEsimoMaior(int[] vetor, int k) {
		if (k <= 0 || k > vetor.length) {
			System.out.println("K está fora do intervalo válido.");
		}

		int[] copia = ordenacaoCrescente(vetor);
		return copia[vetor.length - k];
	}

	// 10) K-ésimo menor valor
	public static int kEsimoMenor(int[] vetor, int k) {
		if (k <= 0 || k > vetor.length) {
			System.out.println("K está fora do intervalo válido.");
		}

		int[] copia = ordenacaoCrescente(vetor);
		return copia[k - 1];
	}

	// 11) Verificação de igualdade
	public static boolean saoIguais(int[] vetor1, int[] vetor2) {
		return Arrays.equals(vetor1, vetor2);
	}

	// 12) Potenciação
	public static double potenciacao(double base, double expoente) {
		return Math.pow(base, expoente);
	}

	// 13) Primo
	public static boolean ehPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		if (numero <= 3) {
			return true;
		}
		if (numero % 2 == 0 || numero % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= numero; i += 6) {
			if (numero % i == 0 || numero % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	// 14) Busca por ocorrências
	public static int[] buscaOcorrencias(int[] vetor1, int[] vetor2) {
		return Arrays.stream(vetor1).distinct().filter(x -> Arrays.stream(vetor2).anyMatch(y -> y == x)).toArray();
	}

	// 15) Remoção de elemento do vetor
	public static int[] removerElemento(int[] vetor, int elemento) {
		return Arrays.stream(vetor).filter(x -> x != elemento).toArray();
	}

	// 16) Verificação de palíndromo
	public static boolean ehPalindromo(String texto) {
		String textoInvertido = new StringBuilder(texto).reverse().toString();
		return texto.equals(textoInvertido);
	}

	// 17) Verificação de número primo
	public static boolean ehNumeroPrimo(int numero) {
		return ehPrimo(numero);
	}

	// 18) Inversão de string
	public static String inverterString(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}

	// 19) Cálculo de juros compostos
	public static double calcularJurosCompostos(double valorInicial, double taxaDeJuros, int numPeriodos) {
		return valorInicial * Math.pow(1 + taxaDeJuros, numPeriodos);
	}

	// 20) Verificação de número perfeito
	public static boolean ehNumeroPerfeito(int numero) {
		int somaDivisores = 1;
		for (int i = 2; i * i <= numero; i++) {
			if (numero % i == 0) {
				somaDivisores += i;
				if (i != numero / i) {
					somaDivisores += numero / i;
				}
			}
		}
		return somaDivisores == numero;
	}

	// 21) Diminuição do vetor
	public static void diminuicaoDoVetor(int tamanho) {
		for (int i = tamanho; i >= 1; i--) {
			int[] vetor = new int[i];
			System.out.println("Tamanho do vetor: " + i);
		}
	}

	// 22) Imprimir elementos:
	// Item 22a - Imprimir padrão "a"
    public static void imprimirPadraoA(int linhas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Item 22b - Imprimir padrão "b"
    public static void imprimirPadraoB(int linhas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < linhas; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("@");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
