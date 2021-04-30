public class RGB {
    //Atributos
    int r;
    int g;
    int b;
    final int MIN = 0;
    final int MAX = 255;


    //Métodos
    //Constructores
    public void RGB(){}

    //Setters i getters
    public void setRGB(int r, int g, int b) throws ColorRGBException {
        String message = null;
        if (r >= MIN && r < MAX) {
            this.r = r;
        } else {
            message = "Valor R = " + String.valueOf(r) + " fora de rang. ";
        }
        if (g >= MIN && g < MAX) {
            this.g = g;
        } else {
            message += "Valor G = " + String.valueOf(g) + " fora de rang. ";
        }
        if (b >= MIN && b < MAX) {
            this.b = b;
        } else {
            message += "Valor B = " + String.valueOf(b) + " fora de rang.";
        }
        if (message != null) {
            throw new ColorRGBException(message);
        }
    }
    public void setR(int r) {
        this.r = r;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int[] getRGB(){
        int[] rgb = {this.r, this.g, this.b};
        return rgb;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}
