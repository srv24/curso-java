import java.util.Date;

public class OrdenCompra  {
     
    private static int contador = 0;
    private int numproductos = 0;
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Producto[] productos = new Producto[4];    
    private Cliente cliente;

   
    //constructor
    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        contador++;
        this.identificador = contador;
    }

    //Getters
    public Integer getIdentificador() {
        return identificador;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public Date getFecha() {
        return fecha;
    }


    public Producto[] getProductos() {
        return productos;
    }


    public Cliente getCliente() {
        return cliente;
    }


    //Setters
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //add Products
    public void addProducto (Producto producto){
       this.productos[numproductos]=producto;
       numproductos++;  
    }

    public int getSuma(){
        int suma = 0; 
        for(int i = 0; i < this.productos.length; i++){
            suma += this.productos[i].getPrecio();
        }
        return suma;
    }
}