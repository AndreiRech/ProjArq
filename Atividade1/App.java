public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificadorSimples();
        Codificador atbash = new CifraAtbash();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        System.out.println("\n------------------------------------\n");

        System.out.println("Codificador: "+atbash.getNome());
        System.out.println("Versao: "+atbash.getDataCriacao());
        System.out.println("Nivel de segurança: "+atbash.getNivelSeguranca());

        texto = "Este e o string a ser codificado";
        codificado = atbash.codifica(texto);
        decodificado = atbash.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        
    }
}
