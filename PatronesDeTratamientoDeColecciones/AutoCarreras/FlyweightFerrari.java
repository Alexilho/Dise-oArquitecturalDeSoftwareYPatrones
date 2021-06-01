////Adaptado del ejemplo en https://dzone.com/articles/the-flyweight-pattern. "The Flyweight Pattern by John Thompson. Apr. 13 / 2016

public class FlyweightFerrari extends AutoCarreras {

    /*Hace el conteo del número de objetos "Flyweight" obtenidos*/

        public static int num;

        public FlyweightFerrari()

        {

            num++;

        }

/*Este método recibe la información extrínseca. No se mantiene alguna referencia a la posición actual o nueva posición*/

        @Override

        public void moverAuto(int actualX, int actualY, int newX ,int newY)

        {
            System.out.println("La información invariante (intrínseca) para este auto es: Nombre: " + this.getNombre() + "; " + "Velocidad máxima: " + this.getVelMax() + "; "+ "Potencia:  " + this.getPotencia());
            System.out.println("La nueva posición de "+this.getNombre() +" es X: "+newX + " - Y: "+newY);

        }

    }