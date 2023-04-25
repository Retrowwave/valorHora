import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // Escreva um algoritmo que pergunte quanto o funcionário ganha por hora e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês.

    Scanner scanner = new Scanner(System.in);
    // Solicitamos ao usuário o valor em R$ que ele ganha por hora trabalhada.
    // Guardamos este valor na variável valorHora
    System.out.println("Quanto você recebe $ por hora?");
    double valorHora = scanner.nextDouble();
    
    // Solicitamos ao usuário as horas trabalhadas no mês e guardamos na variável horaMes
    System.out.println("Quantas horas você trabalha no mês?");
    double horaMes = scanner.nextDouble();
    
    // Multiplicamos o valor ganho por hora com a quantidade de horas trabalhadas no mês.
    double horaTrabalhada = horaMes * valorHora;


    // Printamos a variável horaTrabalhada
    System.out.println("Você recebe: " + horaTrabalhada + " por mês.");

    }
}
