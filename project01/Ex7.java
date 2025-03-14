package ExercisesAula4PSC;

/* Escrever um algoritmo que leia um conjunto de 50000 informações contendo,
cada uma delas, a altura e o sexo de uma pessoa
(código=1, masculino e código=2, feminino), calcule e mostre o seguinte:
- A maior e a menor altura da turma
- A média da altura das mulheres
- A média da altura da turma
*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] info = new String[5];
        int homens = 0, mulheres = 0;
        double hminM = -1, hminF = -1, hmaxM = 0, hmaxF = 0, somaHF = 0, somaHM = 0, medM, medT;

        for (int i = 0; i < info.length; i++) {

            System.out.println("\nDigite abaixo as informações sobre o(a) Aluno(a) " + (i + 1));

            System.out.println("\nSeu sexo? [1-Masculino/2-Feminino]");
            System.out.print("R: ");
            int sex = sc.nextInt();

            if (sex == 1) {
                homens++;
                System.out.print("\nAltura (em metros): ");
                double heightM = sc.nextDouble();

                if (hminM == -1) {
                    hminM = heightM;
                }
                if (heightM < hminM) {
                    hminM = heightM;
                }
                if (heightM > hmaxM) {
                    hmaxM = heightM;
                }
                somaHM = somaHM + heightM;
            }
            if (sex == 2) {
                mulheres++;
                System.out.print("\nAltura (em metros): ");
                double heightF = sc.nextDouble();

                if (hminF == -1) {
                    hminF = heightF;
                }
                if (heightF < hminF) {
                    hminF = heightF;
                }
                if (heightF > hmaxF) {
                    hmaxF = heightF;
                }
                somaHF = somaHF + heightF;
            }

        }

        if (hminM < hminF) {
            System.out.println("\nA altura mínima foi: " + hminM + "m");
        } else {
            System.out.println("A altura mínima foi: " + hminF + "m");
        }

        if (hmaxM > hmaxF) {
            System.out.println("A altura máxima foi: " + hmaxM + "m");
        } else {
            System.out.println("A altura máxima foi: " + hmaxF + "m");
        }

        if (mulheres > 0) {
            medM = somaHF / mulheres;
            System.out.printf("A média das alturas das mulheres é: %,.2fm\n", medM);
        } else {
            System.out.println("Não há mulheres na turma.");
        }

        if (homens + mulheres > 0) {
            medT = (somaHF + somaHM) / (homens + mulheres);
            System.out.printf("A média das alturas da turma é: %,.2fm\n", medT);
        } else {
            System.out.println("Não há alunos na turma.");
        }
    }
}