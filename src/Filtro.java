import java.awt.*;
import java.awt.image.BufferedImage;

public class Filtro {

    public static BufferedImage pintarPixels(BufferedImage image){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++){
            for(int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++){
                int rgbPixel = image.getRGB(coluna, linha);
                Color corPixel = new Color(rgbPixel);
                imagemSaida.setRGB(coluna, linha, new Color(corPixel.getRed(), corPixel.getGreen(), corPixel.getBlue()).getRGB());
            }
        }

        Color blue = new Color(0, 0 , 255);
        Color green = new Color(0, 255, 0);
        Color red = new Color(255, 0, 0);

        imagemSaida.setRGB(image.getMinX(),image.getMinY(), blue.getRGB());
        imagemSaida.setRGB(image.getWidth() / 2, image.getHeight() / 2, green.getRGB());
        imagemSaida.setRGB(image.getWidth() - 1, image.getHeight() - 1, red.getRGB());

        return imagemSaida;
    }

    public static BufferedImage filtrarVermelho(BufferedImage image){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++){
            for(int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++){
                int rgbPixel = image.getRGB(coluna, linha);
                Color corPixel = new Color(rgbPixel);
                imagemSaida.setRGB(coluna, linha, new Color(corPixel.getRed(), 0, 0).getRGB());
            }
        }

        return imagemSaida;
    }

    public static BufferedImage filtrarVerde(BufferedImage image){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++){
            for(int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++){
                int rgbPixel = image.getRGB(coluna, linha);
                Color corPixel = new Color(rgbPixel);
                imagemSaida.setRGB(coluna, linha, new Color(0, corPixel.getGreen(), 0).getRGB());
            }
        }

        return imagemSaida;
    }

    public static BufferedImage filtrarAzul(BufferedImage image){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++){
            for(int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++){
                int rgbPixel = image.getRGB(coluna, linha);
                Color corPixel = new Color(rgbPixel);
                imagemSaida.setRGB(coluna, linha, new Color(0, 0, corPixel.getBlue()).getRGB());
            }
        }

        return imagemSaida;
    }

    public static BufferedImage cinzaMedia(BufferedImage image){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++){
            for(int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++){

                int rgbPixel = image.getRGB(coluna, linha);
                Color corPixel = new Color(rgbPixel);

                int vermelho = corPixel.getRed();
                int verde = corPixel.getGreen();
                int azul = corPixel.getBlue();

                int mediaCor = (vermelho + verde + azul) / 3;
                Color corCinza = new Color(mediaCor, mediaCor, mediaCor);

                imagemSaida.setRGB(coluna, linha, corCinza.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage cinzaRed(BufferedImage image){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++){
            for(int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++) {
                int rgb = image.getRGB(coluna, linha);
                Color cor = new Color(rgb);
                Color novaCor = new Color(cor.getRed(), cor.getRed(), cor.getRed());
                imagemSaida.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage cinzaGreen(BufferedImage image){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++){
            for(int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++) {
                int rgb = image.getRGB(coluna, linha);
                Color cor = new Color(rgb);

                Color novaCor = new Color(cor.getGreen(), cor.getGreen(), cor.getGreen());
                imagemSaida.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage cinzaBlue(BufferedImage image){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++){
            for(int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++) {
                int rgb = image.getRGB(coluna, linha);
                Color cor = new Color(rgb);

                Color novaCor = new Color(cor.getBlue(), cor.getBlue(), cor.getBlue());
                imagemSaida.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }


    public static BufferedImage aumTom(BufferedImage image, String banda, int valor){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        banda = banda.toLowerCase();

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++) {
            for (int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++) {
                int rgb = image.getRGB(coluna, linha);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                switch (banda){
                    case "red":
                        int novoRed = red + valor;
                        novoRed = novoRed > 255? 255: Math.max(novoRed, 0);
                        Color tomRed = new Color(novoRed, green, blue);
                        imagemSaida.setRGB(coluna, linha, tomRed.getRGB());
                        break;
                    case "green":
                        int novoGreen = green + valor;
                        novoGreen = novoGreen > 255? 255: Math.max(novoGreen, 0);
                        Color tomGreen = new Color(red, novoGreen, blue);
                        imagemSaida.setRGB(coluna, linha, tomGreen.getRGB());
                        break;
                    case "blue":
                        int novoBlue = blue + valor;
                        novoBlue = novoBlue > 255? 255: Math.max(novoBlue, 0);
                        Color tomBlue = new Color(red, green, novoBlue);
                        imagemSaida.setRGB(coluna, linha, tomBlue.getRGB());
                        break;
                    default:
                        throw new IllegalArgumentException("O valor digitado para a banda não é aceito!");
                }
            }
        }

        return imagemSaida;
    }

    public static BufferedImage negativo(BufferedImage image){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++) {
            for (int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++) {
                int rgb = image.getRGB(coluna, linha);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                Color novaCor = new Color((255 - red), (255 - green), (255 - blue));
                imagemSaida.setRGB(coluna, linha, novaCor.getRGB());
            }
        }

        return imagemSaida;
    }

    public static BufferedImage limiar(BufferedImage image, int limiar){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        BufferedImage imagemCinza = cinzaMedia(image);

        for(int linha = imagemCinza.getMinY(); linha < (imagemCinza.getHeight() - 1); linha++) {
            for (int coluna = imagemCinza.getMinX(); coluna < (imagemCinza.getWidth() - 1); coluna++) {
                int rgb = imagemCinza.getRGB(coluna, linha);
                Color cor = new Color(rgb);

                Color branco = new Color(255, 255, 255);
                Color preto = new Color(0,0,0);

                if(cor.getRed() > limiar)
                    imagemSaida.setRGB(coluna, linha, branco.getRGB());
                else
                    imagemSaida.setRGB(coluna, linha, preto.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage brilhoAdd(BufferedImage image, int valor){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++) {
            for (int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++) {
                int rgb = image.getRGB(coluna, linha);
                Color cor = new Color(rgb);

                int red = cor.getRed() + valor;
                int green = cor.getGreen() + valor;
                int blue = cor.getBlue() + valor;

                red = red > 255 ? 255 : (Math.max(red, 0));

                green = green > 255 ? 255 : (Math.max(green, 0));

                blue = blue > 255 ? 255 : (Math.max(blue, 0));

                Color novaCor = new Color(red, green, blue);
                imagemSaida.setRGB(coluna, linha, novaCor.getRGB());
            }
        }

        return imagemSaida;
    }

    public static BufferedImage brilhoMtt(BufferedImage image, int valor){
        BufferedImage imagemSaida = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int linha = image.getMinY(); linha < (image.getHeight() - 1); linha++) {
            for (int coluna = image.getMinX(); coluna < (image.getWidth() - 1); coluna++) {
                int rgb = image.getRGB(coluna, linha);
                Color cor = new Color(rgb);

                int red = cor.getRed() * valor;
                int green = cor.getGreen() * valor;
                int blue = cor.getBlue() * valor;

                red = red > 255 ? 255 : (Math.max(red, 0));

                green = green > 255 ? 255 : (Math.max(green, 0));

                blue = blue > 255 ? 255 : (Math.max(blue, 0));

                Color novaCor = new Color(red, green, blue);
                imagemSaida.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }


}
