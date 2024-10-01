package restaurante;

public class Mesero {
    private int idMesero;
    private String nombreMesero;
    
    public Mesero(int idMesero, String nombreMesero){
        this.idMesero=idMesero;
        this.nombreMesero=nombreMesero;
    }
    
    public int getIdMesero(){
        return idMesero;
    }
    
    public String getNombreMesero(){
        return nombreMesero;
    }
    
    //Simula la asignación de un cliente a una mesa disponible
    public void asignaMesa(ColaEnteros mesas,ColaEnteros entradaRestaurante){
        int numeroMesa=0;
        int idCliente=0;
        //Busca un cliente en la entrada solicitando mesa
        while(true){
            //Si hay un cliente solicitando mesa
            if(!entradaRestaurante.estaVacia()){
                //Obten el id del Cliente para posteriormente buscarle mesa
                idCliente=entradaRestaurante.desencola();
                System.out.println("El Mesero "+idMesero+" ha ido a atender al Cliente "
                        +idCliente+" en la entrada...");
                break;
            }
            //Está vacía la entrada al restaurante
            else{
                System.out.println("El Mesero "+idMesero+" no ve clientes en la entrada...");
            }
        }
        //Si el mesero está atendiendo a un client en la entrada
        if(idCliente!=0){
            //Busca una mesa vacía para el cliente
            while(true){
                //Si encuentra una mesa vacía
                if(mesas.noEstaLlena()){
                    //Guarda el número de mesa
                     numeroMesa=mesas.encola(idCliente);
                     //Convierte el valor del indice del arreglo al número de mesa
                     numeroMesa=numeroMesa+1;
                     System.out.println("El Mesero "+idMesero+" le ha asignado al Cliente "
                        +idCliente+" la mesa "+numeroMesa);
                     break;
                }
                else{
                    System.out.println("El Mesero "+idMesero+" no le ha encontrado "
                            + "al Cliente "+idCliente+ "una mesa...");
                }
            }
        }

    }    
}
