import java.time.LocalDate;

public class CodificadorCesar implements Codificador {
    private int shift;

    public CodificadorCesar(int shift) {
        this.shift = shift;
    }

    public String getNome() {
        return "Codificador Cesar";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 3, 13);
    }

    public int getNivelSeguranca(){
        return 2;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + shift));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder decoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            decoded.append((char) (c - shift));
        }
        
        return decoded.toString();
    }
}