import java.io.File;

public class Output {
    private final static String caminho = "C:\\Users\\anton\\IdeaProjects\\ProjetoPDI\\src\\assets\\";
    private Output(){

    }
    public static File getOutput(String nomeArquivo) {
        return new File(caminho + nomeArquivo);
    }
}
