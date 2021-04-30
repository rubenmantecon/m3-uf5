public class ColorRGBException extends Exception{
    ColorRGBException(){
        super("Error setting this colored object");
    }
   ColorRGBException(String s) {
        super(s);
   }

}
