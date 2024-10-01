package restaurante;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    
    public Cliente(int idCliente, String nombreCliente){
        this.idCliente=idCliente;
        this.nombreCliente=nombreCliente;
    }
    
    //Simula al cliente pidiendo una mesa
    public void solicitaMesa(ColaEnteros entradaRestaurante){
        while(true){
            //Checa si hay espacio en la entrada para que el cliente entre
            if(entradaRestaurante.noEstaLlena()){
                //El cliente se coloca en la entrada
                entradaRestaurante.encola(idCliente);
 
                System.out.println("El Cliente "+idCliente+" ha llegado al "
                        + "restaurante a solicitar mesa...");
                break;
            }
            //No hay espacio en ka entrada del restaurante para que entre el cliente
            else{
                System.out.println("No hay espacio en la entrada del restaurante...");
            }
        }
    }
    
    public void ordenaAlimentos(){
        
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    public String getNombreCliente(){
        return nombreCliente;
    }
    
}
