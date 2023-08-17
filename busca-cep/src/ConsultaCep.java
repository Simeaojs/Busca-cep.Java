import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConsultaCep {

    public Endereco buscaEnderecoCep(String cep) {
        if (!validaCep(cep)) {
            throw new IllegalArgumentException("CEP invalido");
        }

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new RuntimeException("Erro ao buscar endereço Codigo " + response.statusCode());
            }
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar endereço", e);

        }
    }

    private boolean validaCep(String cep) {
        return cep.matches("\\d{8}");
    }

}