import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ConsultaAPI {
    public Conversao buscaConversao(String moeda) {

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/"+ArquivoAPI.getConteudo()+"/latest/" + moeda);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversao.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel obter a conversão.");
        }

    }
}
