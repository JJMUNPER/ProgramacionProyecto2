public class Project2 {

        /**
         * @autor: Jota
         * @param args
         *
         * Vamos a declarar una constante que sera la que genere
         * un numero aleatorio con el metodo Math
         */

        final static int NUM_ALEATORIO = ((int)(Math.random()*101));

        public static void main(String[] args) {
            /**Declaro las variables*/

            int randomNumber;

            System.out.println("El numero aleatorio generado es: " + NUM_ALEATORIO);

            //Vamos a trabajar con la variable, asi que igualamos la constante y la variable

            randomNumber = NUM_ALEATORIO; /**Inicializamos la variable*/

            /**Creamos el bucle que filtrará los numeros aleatorios que nos genere la clase Math
             * y le podnremos un filtro para que nos diga si es primo o no
             */

            if (randomNumber==1||randomNumber==4||randomNumber==0||randomNumber%2==0){
                System.out.println("No es primo: " + randomNumber);


            }else{
                System.out.println("Es primo: " + randomNumber);
            }

        }


}
