package restaurante;

public class Restaurante {


    public static void main(String[] args) {
       ColaEnteros entradaRestaurante=new ColaEnteros(10);
       ColaEnteros mesas=new ColaEnteros(8);
            
       Cliente cliente1=new Cliente(1,"Pedro");
       Mesero mesero1=new Mesero(1,"Luis");
       Cliente cliente2=new Cliente(2,"Miguel");
       Mesero mesero2=new Mesero(2,"Alberto");
       cliente1.solicitaMesa(entradaRestaurante);
       cliente2.solicitaMesa(entradaRestaurante);
       mesero1.asignaMesa(mesas, entradaRestaurante);
       mesero2.asignaMesa(mesas, entradaRestaurante);
    }
    
}
