import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Imagem {
    public static void main(String[] args) throws RuntimeException{

        File input = new File("C:\\Users\\anton\\Downloads\\download.jfif");
        BufferedImage image = null;

        try {
            image = ImageIO.read(input);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao tentar ler a imagem!");
        }

        System.out.println("A imagem tem " + image.getWidth() + " de largura!");
        System.out.println("A imagem tem " + image.getHeight() + " de altura!");
        System.out.println("A imagem tem " + (image.getHeight() * image.getWidth()) + " pixeis!");

        //Pintar os Pixels (Primeiro, Central e Ultimo)
        Util.salvarImagem(Filtro.pintarPixels(image), Output.getOutput("pintarPixels.png"));
        //Exibir Rgb
//        Util.exibirRGB(image);
        //Salvando a imagem default
        Util.salvarImagem(image, Output.getOutput("imagem.png"));
        //Banda red
        Util.salvarImagem(Filtro.filtrarVermelho(image), Output.getOutput("BandaRed.png"));
        //Banda green
        Util.salvarImagem(Filtro.filtrarVerde(image), Output.getOutput("BandaGreen.png"));
        //Banda blue
        Util.salvarImagem(Filtro.filtrarAzul(image), Output.getOutput("BandaBlue.png"));
        //Cinza média
        Util.salvarImagem(Filtro.cinzaMedia(image), Output.getOutput("cinzaMedia.png"));
        //Cinza red
        Util.salvarImagem(Filtro.cinzaRed(image), Output.getOutput("CinzaRed.png"));
        //Cinza green
        Util.salvarImagem(Filtro.cinzaGreen(image), Output.getOutput("CinzaGreen.png"));
        //Cinza blue
        Util.salvarImagem(Filtro.cinzaBlue(image), Output.getOutput("CinzaBlue.png"));
        //Aumento de tonalidade
        Util.salvarImagem(Filtro.aumTom(image, "red", 100), Output.getOutput("AumTomRed.png"));
        Util.salvarImagem(Filtro.aumTom(image, "Blue", 55), Output.getOutput("AumTomBlue.png"));
        Util.salvarImagem(Filtro.aumTom(image, "green", 142), Output.getOutput("AumTomGreen.png"));
        //Negativo
        Util.salvarImagem(Filtro.negativo(image), Output.getOutput("Negativo.png"));
        //Limiar
        Util.salvarImagem(Filtro.limiar(image, 128),Output.getOutput("Limiar.png"));
        //Brilho adicionar
        Util.salvarImagem(Filtro.brilhoAdd(image, 100), Output.getOutput("BrilhoAdd.png"));
        //Brilho multiplicar
        Util.salvarImagem(Filtro.brilhoMtt(image, 2), Output.getOutput("BrilhoMtt.png"));
    }
}

