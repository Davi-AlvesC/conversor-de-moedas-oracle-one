import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ArquivoAPI {
    private static final String NOME_ARQUIVO = "chaveAPI.txt";


    public static String getConteudo() {
        Path caminho = Paths.get(NOME_ARQUIVO);
        try {
            return Files.readString(caminho);
        } catch (IOException e) {
            return "Erro ao ler o arquivo: " + e.getMessage();
        }
    }
}
