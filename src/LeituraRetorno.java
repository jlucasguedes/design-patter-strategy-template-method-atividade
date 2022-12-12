import java.net.URI;
import java.time.format.DateTimeFormatter;
import java.util.List;

public interface LeituraRetorno {
    Boleto processarLinhaArquivo(String[] vetor);
}
