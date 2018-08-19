
package tarea3_201700628;

import java.util.*;

/**
 *
 * @author JAZMIN
 */
public class Tarea3_201700628 {

    
    public static void main(String[] args) {
        
        try{
            Scanner opcionMP = new Scanner(System.in);
            int menuP;
        
            do{
                System.out.println("----- TAREA 3 -----");
                System.out.println("1. Usuarios");
                System.out.println("2. Contador de digitos repetidos");
                System.out.println("3. Tres numeros de mayor a menor");
                System.out.println("4. Calcular promedio");
                System.out.println("5. SALIR");
                
                menuP=opcionMP.nextInt();
                
                
                switch(menuP){ 
                    case 1:{
                        System.out.println("-----USUARIOS-----");
                        System.out.println("1. Ingresar Usuarios");
                        System.out.println("2. Mostrar usuarios Ascendente");
                        System.out.println("3. Mostrar usuarios Descendente");
                        System.out.println("4. Menu Principal"); break;
                    }
                    
                    case 2:{
                        System.out.println("---CONTADOR DE DIGITOS REPETIDOS---");
                        ContadorDigitosRepetidos();
                        break;                           
                    }
                    
                    case 3:{
                         
                        NumerosdeMayoraMenor();
                        break;
                    }
                    
                    case 4:{
                        System.out.println("CALCULAR PROMEDIO (4 NOTAS DE 6 ESTUDIANTES)"); break;
                    }
                    
                }
            
            }while(menuP!=5);
        
        }
            catch(Exception e){
                System.out.println("ERROR, POR FAVOR INGRESE OPCION DE NUMERO DEL 1 AL 5");
            } 
    }
    
    
    public static void IngresarUsuarios() {
        //vector
        String usuarios[] = new String[5];
        String usuario;
        Scanner entradausuario = new Scanner(System.in);
        
    }
    
    public static void ContadorDigitosRepetidos() {
        
        try{
        
        int menuCDR, cantidad=0, numeroBuscado=0;
        Scanner opcionCDR = new Scanner(System.in);
        
        
        do{ 
            System.out.println("1. Ingresar Numero");
            System.out.println("2. Ingresar numero a buscar");
            System.out.println("3. Mostrar numero de digitos");
            System.out.println("4. Menu Principal \n");
            System.out.println("Selecciona una opcion del menu");
            
            menuCDR = opcionCDR.nextInt();
            
            switch(menuCDR){
            
                case 1:{
                    System.out.println("ingrese numero");
                    cantidad = opcionCDR.nextInt();
                    System.out.println("selecciona opcion 2"); break;
                    
                }
                case 2:{
                    System.out.println("ingrese el digito que quiere buscar");
                    numeroBuscado = opcionCDR.nextInt();
                    System.out.println("selecciona opcion 3");break;
                }
                case 3:{
                    System.out.println("mostrar:");
                    String cadenaNumero, buscado = "";
                    cadenaNumero = Integer.toString(cantidad);
                    buscado = Integer.toString(numeroBuscado);
                    int posicion, contador = 0;
                    
                    posicion = cadenaNumero.indexOf(buscado);
                    while(posicion != -1){
                    contador++;
                    posicion = cadenaNumero.indexOf(buscado, posicion +1);             
                    }
                    System.out.println("El numero "+ buscado + " aparece " + contador + " veces");
                    System.out.println("selecciona opcion 4 para volver al menu principal");break;
                    
                }
                case 4: {
                //menu principal
                }
                /*default:{
                    System.out.println("OPCION INCORRECTA");
                    break;}*/
            }
        }while(menuCDR !=4); 
        }catch(Exception e){
          System.out.println("Error de caracter, ejecute nuevamente");
                        }
        
        }
    
    
    
    public static void NumerosdeMayoraMenor() {
        
        try{
        
        Scanner opcionNMM=new Scanner(System.in);
        int menuNMM;
        int x = 0, y = 0, z = 0, mayor, medio, menor;
        
        do{
            
            System.out.println("---TRES NUMEROS DE MAYOR A MENOR---");
            System.out.println("1. Ingresar Numeros");
            System.out.println("2. Mostrar Ordenados");
            System.out.println("3. Menu Principal \n");
            System.out.println("Selecciona una opcion del menu");
        
        menuNMM=opcionNMM.nextInt();
        
        switch(menuNMM){
            case 1:{
                System.out.println("1. INGRESE 3 NUMEROS ENTEROS");
                Scanner Leer=new Scanner(System.in);
                System.out.println("Ingrese el primer numero");
                x=Leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                y=Leer.nextInt();
                System.out.println("Ingrese el tercer numero");
                z=Leer.nextInt(); 
                System.out.println("Seleccion opcion 2");break;
                
            }
            case 2:{ System.out.println("2. MOSTRAR ORDENADOS");
                
                if(x>y && x>z){
                    mayor = x;
                }
                else if(y>x && y>z){
                    mayor = y;
                }
                else{
                    mayor = z;
                }
                if(x<y && x<z){
                    menor = x;
                }
                else if(y<x && y<z){
                    menor = y;
                }
                else{
                    menor = z;
                }
                medio = (x+y+z)-(mayor + menor);
                System.out.println("El orden de mayor a menor de los numeros es: ");
                System.out.println("   "+mayor+"   "+medio+"   "+menor+"");
                if(x==y && y==z){
                    System.out.println("Numeros Iguales");
                }
                System.out.println("Selecciona opcion 3 para regresar al menu principal"); break;
                
            }
            case 3:{
            //REGRESAR AL MENU PRINCIPAL
            }
        }    
        }while(menuNMM!=3);
        }catch(Exception e){
          System.out.println("Error de caracter, ejecute nuevamente");
    }
    }
    public static void calcularPromedio() {
        
        
        
    }
    
 
    
}
