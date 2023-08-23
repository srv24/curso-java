public class Main {
    public static void main(String[] args) {
        //Se crean los clientes
        Cliente clienteUno = new Cliente("Mathias", "Garcia");
        Cliente clienteDos = new Cliente("Santiago", "Acosta");
        Cliente clienteTres = new Cliente("Nancy", "Albano");

        //Se crean las ordenes de compra
         OrdenCompra ordenUno = new OrdenCompra("compra de productos informaticos");   
         OrdenCompra ordenDos = new OrdenCompra("compra de alcohol");
         OrdenCompra ordenTres = new OrdenCompra("Compra de productos de limpieza");   

        //Se agregan los clientes a dichas ordenes 
        ordenUno.setCliente(clienteUno);
        ordenDos.setCliente(clienteDos);
        ordenTres.setCliente(clienteTres);
    
        //Se crean 12 productos 4 por orden
        //Productos de orden 1
        Producto producto1 = new Producto("HP", "Monitor 23", 150);
        Producto producto2 = new Producto("Intel", "Procesador Inter I7", 500);
        Producto producto3 = new Producto("Nvidia", "GTX 1650", 700);
        Producto producto4 = new Producto("Samsung", "Auriculares Buds Pro ", 175);
        
        //Productos de orden 2
        Producto producto5 = new Producto("JackDaniels", "Whiskey", 50);
        Producto producto6 = new Producto("Jhonnie Walker", "Blue Label", 450);
        Producto producto7 = new Producto("Branca", "Fernet 750ml", 10);
        Producto producto8 = new Producto("Ballantine", "12 años 750ml", 200);

        //Productos de orden 3
        Producto producto9 = new Producto("Glade", "Repuesto aromatizador", 15);
        Producto producto10 = new Producto("Cif", "Detergente Limon 450ml", 50);
        Producto producto11 = new Producto("Somat", "Sal par aLavavajillas 1.2kg", 90);
        Producto producto12 = new Producto("Skip", "Jabon para ropa 500ml", 175);

        //Se agregan los producto a la primera orden
        ordenUno.addProducto(producto1);
        ordenUno.addProducto(producto2);
        ordenUno.addProducto(producto3);
        ordenUno.addProducto(producto4);

        //Se agregan los producto a la sedunda orden
        ordenDos.addProducto(producto5);
        ordenDos.addProducto(producto6);
        ordenDos.addProducto(producto7);
        ordenDos.addProducto(producto8);

        //Se agregan los producto a la tercera orden
        ordenTres.addProducto(producto9);
        ordenTres.addProducto(producto10);
        ordenTres.addProducto(producto11);
        ordenTres.addProducto(producto12);
        
        //Se imprimer los resultados de la suma de los productos, por orden
        System.out.println("El total de la orden es: "+ordenUno.getSuma()+ ", para el cliente "+ordenUno.getCliente().getNombre());
        System.out.println("El total de la orden es: "+ordenDos.getSuma()+ ", para el cliente "+ordenDos.getCliente().getNombre());
        System.out.println("El total de la orden es: "+ordenTres.getSuma()+ ", para el cliente "+ordenTres.getCliente().getNombre());
  
    }
}
