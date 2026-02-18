package consola;

import java.util.Scanner;

public class Consola {

    Scanner entrada1 = new Scanner(System.in);
    int cola[];
    int tam;
    int frente = 0;
    int fin = -1;
    int eliminado = 0;
    boolean bandera = false;

    public void Tamanio() throws InterruptedException {
        do {
            System.out.print("Define el tamanio de la cola: ");
            tam = entrada1.nextInt();
        } while (tam <= 0);
        cola = new int[tam];
        bandera = true;
        System.out.println("Cola creada correctamente...");
        Thread.sleep(1000);
    }

    public void Insertar() throws InterruptedException {
        if (bandera) {
            if (fin == tam - 1) {
                System.out.println("Cola llena...");
                Thread.sleep(1000);
            } else {
                fin++;
                System.out.print("Inserta dato:");
                cola[fin] = entrada1.nextInt();
                Thread.sleep(1000);
            }
        } else {
            System.out.println("La cola no ha sido creada...");
            Thread.sleep(1000);
        }
    }

    public void Eliminar() throws InterruptedException {
        if (bandera) {
            if (frente <= fin) {
                eliminado = cola[frente];
                frente++;
                System.out.println("Dato eliminado: " + eliminado);
                Thread.sleep(1000);
            } else {
                System.out.println("Nada que eliminar...");
                Thread.sleep(1000);
            }

        } else {
            System.out.println("La cola no ha sido creada...");
            Thread.sleep(1000);
        }
    }

    public void Mostrar() throws InterruptedException {
        if (bandera) {
            for (int i = frente; i <= fin; i++) {
                System.out.println("[" + cola[i] + "]");
            }
        } else {
            System.out.println("Cola no creada aun...");
            Thread.sleep(1000);
        }
    }

    public void Salir() throws InterruptedException {
        for (int i = 3; i <= 0; i--) {
            System.out.println("Saliendo en " + i + "...");
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada2 = new Scanner(System.in);
        Consola consola = new Consola();
        boolean una_vez = false;
        int opcion = 0;

        do {

            System.out.println("***** M E N U *****");
            System.out.println("1. Elegir Tamanio.");
            System.out.println("2. Llenar cola.");
            System.out.println("3. Eliminar elemento.");
            System.out.println("4. Mostrar cola.");
            System.out.println("5. Salir.");
            System.out.print("Eleccion: ");
            opcion = entrada2.nextInt();

            switch (opcion) {
                case 1:
                    if(una_vez == false){
                        consola.Tamanio();
                        una_vez = true;
                    }
                    else{
                        System.out.println("La cola se creo anteriormente.");
                        Thread.sleep(1000);
                    }
                    break;
                    
                case 2:
                    consola.Insertar();
                    break;
                    
                case 3:
                    consola.Eliminar();
                    break;
                    
                case 4:
                    consola.Mostrar();
                    break;
                    
                case 5:
                    consola.Salir();
                    break;
                    
                default:
                    System.out.println("Opcion no valida...");
                    Thread.sleep(1000);
            }
            
        } while (opcion != 5);

    }
}
