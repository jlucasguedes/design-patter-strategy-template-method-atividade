import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        ProcessarBoletos processarBoletos = new ProcessarBoletos(new LeituraRetornoBancoBrasil());

        try {
            System.out.println("------------------ BANCO DO BRASIL --------------------------");
            List<Boleto> boletos = processarBoletos.processar(new URI("file:/C:/Users/lucas/IdeaProjects/design-patter-strategy-atividade/src/banco-brasil-1.csv"));
            for (Boleto boleto: boletos) {
                System.out.println(boleto.toString());
            }
            processarBoletos.setLeituraRetorno(new LeituraRetornoBradesco());
            System.out.println("------------------ BRADESCO --------------------------");
            boletos = processarBoletos.processar(new URI("file:/C:/Users/lucas/IdeaProjects/design-patter-strategy-atividade/src/bradesco-1.csv"));
            for (Boleto boleto: boletos) {
                System.out.println(boleto.toString());
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
