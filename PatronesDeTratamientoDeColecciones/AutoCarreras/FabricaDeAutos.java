////Adaptado del ejemplo en https://dzone.com/articles/the-flyweight-pattern. "The Flyweight Pattern by John Thompson. Apr. 13 / 2016

import java.util.HashMap;

import java.util.Map;

public class FabricaDeAutos {

    private static Map<String, AutoCarreras> flyweights = new HashMap<>();

    /*Si existe la clave, retorna el "flyweight" de la colección*/

    public static AutoCarreras getAuto(String key) {

        if(flyweights.containsKey(key)){

            return flyweights.get(key);

        }

        AutoCarreras auto;

        /*Si la clave no existe en la colección, crea el objeto "flyweight", lo coloca en la colección y lo retorna*/

        switch (key)

        {

            case "Ferrari":

                auto = new FlyweightFerrari();

                auto.setNombre("Auto Ferrari 488 Spider");
                
                auto.setMotor("V8");

                auto.setVelMax("> 325 km/h (203 mph)");

                auto.setPotencia("670 cv (492 kW) @ 8000 rev/min");

                break;

            case "Lamborgini":

                auto = new FlyweightLamborgini();

                auto.setNombre("Auto Lamborghini Urus");
                
                auto.setMotor("De 8 cilindros");

                auto.setVelMax("305 km/h");

                auto.setPotencia("650 CV (478 kW) @ 6.000 rpm");

                break;

            default:

                throw new IllegalArgumentException("Tipo de auto no especificado.");

        }

        flyweights.put(key,auto);

        return auto;

    }

}