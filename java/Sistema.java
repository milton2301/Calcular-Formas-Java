import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Sistema {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int operacao;
        
        List Resultado; //Difinição do nome da lista.
        Resultado = new ArrayList(); //Crição da lista.

        while (true) { //Loop que faz o menu ficar pedindo opção.
            if(Resultado.size() == 5){ //Condição de parada se a lista chegar a 5 elementos o programa encerra e da os resultados
                System.out.println("São apenas 5 figura que você pode calcular!");
                    for(int i = 0 ; i < Resultado.size(); i++){ //For que printa toda a lista.
                        System.out.println(Resultado.get(i));
                    }
                System.out.println("Saindo.. Até logo!");
                ler.close(); //Encerra o Scanner.
                System.exit(0); //Sai do programa.
            }
            System.out.println("Digite qual sua opção:"); //Menu de opções.
            System.out.println("1-Retangulo!");
            System.out.println("2-Circulo!");
            System.out.println("3-Quadrado!");
            System.out.println("0-Sair");

            operacao = ler.nextInt(); //Leitura da opção do usuário.

            switch (operacao) { //Leitura da opção do usuário.
                case 0:
                    for(int i = 0 ; i < Resultado.size(); i++){ //For que printa toda a lista.
                        System.out.println(Resultado.get(i));
                    }
                    System.out.println("Saindo.. Até logo!");
                    ler.close();
                    System.exit(0);
                     break;
                case 1:
                    float base; //Atributos do retangulo.
                    float altura;
                    System.out.println("Digite o tamanho da base:");
                    base = ler.nextFloat(); //Coleta dos atributos digitados pelo usuário.
                    System.out.println("Agora digite a altura por favor:");
                    altura = ler.nextFloat();
                    Resultado.add(new Retangulo(base,altura)); //Adição da instancia da classe Retangulo em uma lista.
                    break;
                case 2:
                    double raio; //Atributo do raio.
                    System.out.println("Digite o raio do circulo que deseja calcular:");
                    raio = ler.nextDouble(); //Coleta do atributo digitado pelo usuário.
                    Resultado.add(new Circulo(raio)); //Adição da instancia da classe Circulo em uma lista.
                    break;
                case 3:
                    float lado; //Atributo do quadrado.
                    System.out.println("Digite o tamanho do lado do quadrado:");
                    lado = ler.nextFloat(); //Coleta do atributo digitado pelo usuário.
                    Resultado.add(new Quadrado(lado)); //Adição da instancia da classe Quadrado em uma lista.
                    break;
                default:
                    System.out.println("Opção invalida tente novamente!");
                    break;
            }
        }
    }
}