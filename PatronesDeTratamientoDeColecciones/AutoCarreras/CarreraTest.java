//Adaptado del ejemplo en https://dzone.com/articles/the-flyweight-pattern. "The Flyweight Pattern by John Thompson. Apr. 13 / 2016

public class CarreraTest {

      public static void main(String[] args) {

        CarreraCliente autos[] = {

                new CarreraCliente("Ferrari"),

                new CarreraCliente("Ferrari"),

                new CarreraCliente("Ferrari"),

                new CarreraCliente("Lamborgini"),

                new CarreraCliente("Lamborgini")

        };

        autos[0].moverAuto(29, 3112);

        autos[1].moverAuto(39, 2002);

        autos[2].moverAuto(49, 1985);

        autos[3].moverAuto(59, 2543);

        autos[4].moverAuto(69, 2322);

       /*Se imprime el número de ejemplares "flyweight" requeridos por el programa*/

       System.out.println("Ejemplares 'flyweight' Ferrari obtenidos: " + FlyweightFerrari.num);
       
       System.out.println("Ejemplares 'flyweight' Lamborgini obtenidos: " + FlyweightLamborgini.num);

    }

}