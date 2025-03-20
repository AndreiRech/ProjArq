import java.time.LocalDate;

public class CifraAtbash implements Codificador{
    public String getNome(){
        return "Cifra Atbash";
    }

    // Retorna a data de imlementação do codificador (pode ser usado como versao)
    public LocalDate getDataCriacao(){
        return LocalDate.of(2025, 03, 19);
    }

    // Retorna o nivel de segurança do codificador (1 = muito baixo, 100 = muito alto)
    public int getNivelSeguranca(){
        return 2;
    }

    // Recebe um string e retorna o correspondente codificado
    public String codifica(String str){
        str = str.toUpperCase();

        StringBuilder result = new StringBuilder();

        for (char c: str.toCharArray()){
            if (c >= 'A' && c <= 'Z'){
                char transformed = (char) ('Z' - (c - 'A'));
                result.append(transformed);
            } else{
                result.append(c);
            }
        }
        return result.toString();
    }

    // Recebe um string codificado e retorna o correspondente decodificado
    public String decodifica(String str){
        return codifica(str);
    }
}