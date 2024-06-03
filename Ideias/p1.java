package Ideias;
import java.util.ArrayList;
import java.util.Scanner;
public class p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas a serem cadastradas: ");
        int quantidadePessoas = scanner.nextInt();

        ArrayList<Pessoa> pessoas = cadastrarPessoas(quantidadePessoas, scanner);

        double mediaAltura = calcularMediaAltura(pessoas);
        Pessoa pessoaMaisVelha = encontrarPessoaMaisVelha(pessoas);
        Pessoa pessoaMaisAlta = encontrarPessoaMaisAlta(pessoas);

        System.out.printf("A média de altura das pessoas é de %.2f metros.\n", mediaAltura);

        if (pessoaMaisVelha == pessoaMaisAlta) {
            System.out.printf("%s é a pessoa mais velha e mais alta, com %d anos e %.2f metros de altura.\n",
                    pessoaMaisVelha.getNome(), pessoaMaisVelha.getIdade(), pessoaMaisVelha.getAltura());
        } else {
            System.out.printf("%s é a pessoa mais velha, com %d anos.\n", pessoaMaisVelha.getNome(), pessoaMaisVelha.getIdade());
            System.out.printf("%s é a pessoa mais alta, com %.2f metros de altura.\n", pessoaMaisAlta.getNome(), pessoaMaisAlta.getAltura());
        }
    }

    private static ArrayList<Pessoa> cadastrarPessoas(int quantidadePessoas, Scanner scanner) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.next();
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            System.out.print("Digite a altura da pessoa: ");
            double altura = scanner.nextDouble();

            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoas.add(pessoa);
        }
        return pessoas;
    }

    private static double calcularMediaAltura(ArrayList<Pessoa> pessoas) {
        double totalAltura = 0;
        for (Pessoa pessoa : pessoas) {
            totalAltura += pessoa.getAltura();
        }
        return totalAltura / pessoas.size();
    }

    private static Pessoa encontrarPessoaMaisVelha(ArrayList<Pessoa> pessoas) {
        if (pessoas.isEmpty()) {
            return null;
        }

        Pessoa pessoaMaisVelha = pessoas.get(0);
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > pessoaMaisVelha.getIdade()) {
                pessoaMaisVelha = pessoa;
            }
        }
        return pessoaMaisVelha;
    }

    private static Pessoa encontrarPessoaMaisAlta(ArrayList<Pessoa> pessoas) {
        if (pessoas.isEmpty()) {
            return null;
        }

        Pessoa pessoaMaisAlta = pessoas.get(0);
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getAltura() > pessoaMaisAlta.getAltura()) {
                pessoaMaisAlta = pessoa;
            }
        }
        return pessoaMaisAlta;
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

  

