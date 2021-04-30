public class Pixel {
    //Atributos
    int x;
    int y;
    RGB color = new RGB();

    //Métodos
    //Constructor
    public void Pixel(int x, int y, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.color.r = r;
        this.color.g = g;
        this.color.b = b;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setR(int r) {
        this.color.r = r;
    }

    public void setG(int g) {
        this.color.g = g;
    }

    public void setB(int b) {
        this.color.b = b;
    }

    public void setColor(RGB color) {
        this.color = color;
    }

    public void setPixel(int x, int y, int r, int g, int b) throws ColorRGBException {
        this.x = x;
        this.y = y;
        this.color.r = r;
        this.color.g = g;
        this.color.b = b;
        throw new ColorRGBException();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getPosition(){
        int[] arr = {this.x, this.y};
        return arr;
    }

    public int getR(){
        return color.r;
    }

    public int getG(){
        return color.g;
    }

    public int getB(){
        return color.b;
    }

    public RGB getColor() {
        return color;
    }
}
