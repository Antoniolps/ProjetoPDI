import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Util {
    private final static String formato = "png";
    public static void salvarImagem(BufferedImage image, File output){
        try {
            if(ImageIO.write(image, formato, output))
                System.out.println("Imagem salva com sucesso!!");
            else
                System.out.println("Houve um problema ao tentar salvar a imagem!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exibirRGB(BufferedImage image){
        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++){
            for(int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++){
                int rgbPixel = image.getRGB(coluna, linha);
                Color corPixel = new Color(rgbPixel);
                int vermelho = corPixel.getRed();
                int verde = corPixel.getGreen();
                int azul = corPixel.getBlue();
                System.out.println("Pixel [" + coluna + "," + linha + "] = " + vermelho + "," + verde + "," + azul);
            }
        }
    }
}
