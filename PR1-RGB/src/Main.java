
public class Main {
    public static void main(String[] args) throws ColorRGBException{
        int r, g, b;
        r = -13;
        g = 0;
        b = 50;
        RGB color = new RGB();
        Pixel pixel = new Pixel();
        pixel.setPixel(1, 2, 3, 4, 5); //Eliminar throw en su constructor para seguir con el flujo
        try {
            color.setRGB(r, g, b);
        } catch (ColorRGBException e) {
            System.out.println("Excepció capturada. Elimina el block try/catch per a que es propagui l'error i vegis més informació.");
        }
    }
}
