package projetoLivraria;
public class Livro {
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;


    void cadastrar(){
        System.out.println("Cadastrando o livro");
    }
    double calcFrete(String cep){
        double frete = 0;
        System.out.println("Calculando o frete para o CEP "+cep);
        return frete;
        }
    } 
