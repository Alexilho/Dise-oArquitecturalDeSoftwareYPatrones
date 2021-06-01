////Adaptado del ejemplo en https://dzone.com/articles/the-flyweight-pattern. "The Flyweight Pattern by John Thompson. Apr. 13 / 2016package guru.springframework.gof.flyweight;

public class CarreraCliente {

    private AutoCarreras auto;

    public CarreraCliente(String n) {

        /*Solicita la creación de un objeto tipo Autocarreras a la factoría*/

        auto = FabricaDeAutos.getAuto(n);
    }

     /*La información extrínseca del "flyweight" es suministrada por la clase cliente*/

    private int actualX = 0;

    private int actualY=0;

    public void moverAuto(int newX, int newY){

    /*Mover un auto a otra posición es manejado por el objeto "flyweight"*/

        auto.moverAuto(actualX, actualY, newX, newY);

        actualX = newX;

        actualY = newY;

    }

}