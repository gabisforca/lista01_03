import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double numero1;
    double numero2;
    double soma;
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("escreva dois numeros:");
    numero1 = teclado.nextDouble();
    numero2 = teclado.nextDouble();

    // passo 3: fazer calculo
    soma = numero1 + numero2;
  // passo 3: exibir resposta
    System.out.println(" a soma é:" + soma );
  }
}
