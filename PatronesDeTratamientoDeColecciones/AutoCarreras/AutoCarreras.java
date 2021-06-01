////Adaptado del ejemplo en https://dzone.com/articles/the-flyweight-pattern. "The Flyweight Pattern by John Thompson. Apr. 13 / 2016

public abstract class AutoCarreras {

        /*Estado intrínseco(Invariante)*/

        private String nombre;
        
        private String motor;

        private String velMax;

        private String potencia;
        
        public String getNombre() {
        	return nombre;
        };
        public String getMotor() {
        	return motor;
        }
        public String getVelMax() {
        	return velMax;
        };
        public String getPotencia() {
        	return potencia;
        };
        public void setNombre(String n) {
        	nombre=n;
        }
        public void setMotor(String m) {
        	motor=m;
        }
        public void setVelMax(String v) {
        	velMax=v;
        }
        public void setPotencia(String p) {
        	potencia=p;
        }
   

       /*Estado extrínseco calculado por objetos cliente y pasado al Flyweight.*/

        abstract void moverAuto(int actualX, int actualY, int posX ,int posY);
    }