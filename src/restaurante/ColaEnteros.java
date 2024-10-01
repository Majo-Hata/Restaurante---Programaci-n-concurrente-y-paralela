package restaurante;

public class ColaEnteros {
    private int colaCircularEnteros[];
    private int entrada;
    private int salida;
    private int numeroDeElementos;
    public ColaEnteros(int tam){
        colaCircularEnteros= new int[tam];
        entrada=0;
        salida=0;
        numeroDeElementos=0;
    }
    //Método para encolar elementos
    public int encola(int valor){
        int numEntrada=-1;
        //Si hay espacio para encolar más elementos
        if(numeroDeElementos<colaCircularEnteros.length){
            //Encola un valor
            colaCircularEnteros[entrada]=valor;
            //Almacena la posición en la cola del elemento encolado
            numEntrada=entrada;
            //Actualiza la entrada a la siguiente posición
            entrada=(entrada+1)%colaCircularEnteros.length;
            //Incrementa el contador de elementos en la cola
            numeroDeElementos++;
        } 
        else{
            System.out.println("Cola llena: No se pueden encolar más elementos");
        }
        return numEntrada;
    }
    
     public int desencola(){
        int elementoDesencolado=-1;
        //Si hay elementos que puedan ser desencolados
        if(numeroDeElementos>0){
            //Desencola un valor
            elementoDesencolado=colaCircularEnteros[salida];
            //Actualiza la salida a la siguiente posición
            salida=(salida+1)%colaCircularEnteros.length;
            //Decrementa el contador de elementos en la cola
            numeroDeElementos--;
        } 
        else{
            System.out.println("Cola vacía: No se pueden dsencolar elementos");
        }
        return elementoDesencolado;
    }
     
     public Boolean estaVacia(){
         if(numeroDeElementos==0){
             return true;
         }
         else{
             return false;
         }
     }
     
    public Boolean noEstaLlena(){
        if(numeroDeElementos<colaCircularEnteros.length){
            return true;
        }
        else{
            return false;
        }
    } 
    
    
}
