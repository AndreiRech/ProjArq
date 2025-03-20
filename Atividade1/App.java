public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificadorSimples();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        // Codificador Cesar
        Codificador codCesar = new CodificadorCesar(3);

        System.out.println("Codificador: "+codCesar.getNome());
        System.out.println("Versao: "+codCesar.getDataCriacao());
        System.out.println("Nivel de segurança: "+codCesar.getNivelSeguranca());
        
        String codificadoCesar = codCesar.codifica(texto);
        String decodificadoCesar = codCesar.decodifica(codificadoCesar);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificadoCesar);
        System.out.println("Texto decodificado: "+decodificadoCesar);
    }
}
