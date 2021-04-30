Los catch se tienen que poner de más específicos a menos en los bloques try/catch.
Todas las excepciones heredan de la _Throwable_, así que tienen los siguientes métodos siempre disponibles:
 - String getMessage(): devuelve un mensaje de texto asociado a la excepción.
 - Void printStackTrace([PrintStream stream]): Hace output de la pila de memoria asociada a la excepción.

Podemos crear excepciones personalizadas extendiendo la clase _Exception_:
```Java
public class SaldoInsuficientException extends Exception {
  public SaldoInsuficientException() {
    //text predeterminat associat a la excepció
    super("Saldo negativo!!!!");
}
public SaldoInsuficientException(String s)
{
  //permet personalitzar el text associat
  //a la excepció
  super(s);
 }
}
```
