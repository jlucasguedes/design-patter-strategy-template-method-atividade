import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LeituraRetornoBradesco implements LeituraRetorno{

    static DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


    @Override
    public Boleto processarLinhaArquivo(String[] vetor) {
        Boleto boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);
        boleto.setAgencia(vetor[2]);
        boleto.setContaBancaria(vetor[3]);
        boleto.setDataVencimento(LocalDate.parse(vetor[4], FORMATO_DATA));
        boleto.setDataPagamento(LocalDateTime.parse(vetor[5], FORMATO_DATA_HORA));
        boleto.setCpfCliente(vetor[6]);
        boleto.setValor(Double.parseDouble(vetor[7]));
        boleto.setMulta(Double.parseDouble(vetor[8]));
        boleto.setJuros(Double.parseDouble(vetor[9]));
        return boleto;
    }
}
