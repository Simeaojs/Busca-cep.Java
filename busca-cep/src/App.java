import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitura = new Scanner(System.in)) {
            ConsultaCep consultaCep = new ConsultaCep();
            
            System.out.println("Digite Sem Espaços o CEP Para Consultar: ");
            var cep = leitura.nextLine();

            try {
                Endereco novoEndereco = consultaCep.buscaEnderecoCep(cep);
                System.out.println(novoEndereco);

                GeradorDeArquivo gerador = new GeradorDeArquivo();
                gerador.geraJson(novoEndereco);
                System.out.println("Arquivo JSON gerado com sucesso.");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (RuntimeException | IOException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Finalizando a Busca...");
            }
        }
    }
}