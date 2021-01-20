
/*Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo n�meros inteiros,
podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
esquerda, acima, � direita e abaixo de X, quando houver, conforme
exemplo.*/

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe 'M' para o n� de linhas e N para o n� de colunas, respectivamente: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int mat[][] = new int [m][n];
		
		System.out.println("Informe os numeros: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nInforme um numero para ser localizado na matriz: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + ", " + j + ": ");
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
}