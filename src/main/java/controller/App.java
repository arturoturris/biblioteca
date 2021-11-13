package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Detalles;
import model.WSBiblioteca;
import model.WSResponse;
import view.Almacen;
import view.MainFrame;
import view.template.Nav;
import view.template.Producto;
import view.Ventas;
import view.template.Formulario;

public class App {
    private WSBiblioteca client;
    private final MainFrame mainFrame;
    private final Nav nav;
    
    public App(String endPoint){
        client = new WSBiblioteca(endPoint);
        mainFrame = new MainFrame();
        nav = new Nav();
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.addToScene(nav);
        setEventosNav(nav);
        displayVentas();
    }
    
    public void initView(){
        mainFrame.setVisible(true);
    }
    
    private void setEventosNav(Nav nav){
        nav.getVentasButton().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                displayVentas();
            }
        });
        nav.getAlmacenButton().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                displayAlmacen();
            }
        });
    }
    
    public void displayVentas(){
        Ventas ventasView = new Ventas();
        mainFrame.addToScene(ventasView);
        setEventosVentas(ventasView);
    }
    
    private void setEventosVentas(Ventas ventasView){
        //BUSCAR PRODUCTOS
        ventasView.getBtnBuscar().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String user = ventasView.getUsuario();
                String pass = ventasView.getContrasena();
                String categoria = ventasView.getCategoria();
                WSResponse response = client.getProd(user, pass, categoria);
                String status = response.getStatus().toLowerCase();
                
                if(status.equals("success")){
                    HashMap<String,Object> productos = WSBiblioteca.jsonToMap(response.getData());
                    ventasView.clearTable();
                    productos.forEach((isbn,nombre) -> {
                        Vector<Object> producto = new Vector<>();
                        producto.add(isbn);
                        producto.add(nombre);
                        ventasView.addProductoToTable(producto);
                    });
                } else {
                    JOptionPane.showMessageDialog(
                            mainFrame,
                            response.getMessage(),
                            response.getStatus().toUpperCase() + " " + response.getCode(),
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        });
        
        //CONSULTAR DETALLES
        ventasView.getBtnConsultar().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String user = ventasView.getUsuario();
                String pass = ventasView.getContrasena();
                String isbn = ventasView.getSelectedISBN();
                WSResponse response;
                String status;
                
                if(isbn == null){
                    JOptionPane.showMessageDialog(
                            mainFrame,
                            "No ha seleccionado un libro para consultar.",
                            "Error de selección.",
                            JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }
                
                response = client.getDetails(user, pass, isbn);
                status = response.getStatus().toLowerCase();
                
                if(status.equals("success")){
                    HashMap<String, Object> data = WSBiblioteca.jsonToMap(response.getData());
                    Detalles detalles = new Detalles();
                    Double precio;
                    
                    detalles.setAutor((String)data.get("Autor"));
                    detalles.setDescuento((boolean)data.get("Descuento"));
                    detalles.setEditorial((String)data.get("Editorial"));
                    detalles.setFecha((int)data.get("Fecha"));
                    detalles.setIsbn((String)data.get("ISBN"));
                    detalles.setNombre((String)data.get("Nombre"));
                    precio = (Double)data.get("Precio");
                    detalles.setPrecio(precio.floatValue());
                    displayProducto(detalles,"Ventas");
                } else {
                    JOptionPane.showMessageDialog(
                            mainFrame,
                            response.getMessage(),
                            response.getStatus().toUpperCase() + " " + response.getCode(),
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        });
    }
    
    public void displayProducto(Detalles detalles, String vistaPadre){
        Producto productoView = new Producto(detalles);
        mainFrame.addToScene(productoView);
        setEventosProducto(productoView,vistaPadre);
    }
    
    private void setEventosProducto(Producto productoView, String vistaPadre){
        productoView.getBtnAtras().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if(vistaPadre == "Ventas")
                    displayVentas();
                else if(vistaPadre == "Almacen")
                    displayAlmacen();
        }});
    }

    public void displayAlmacen(){
        Almacen almacenView = new Almacen();
        mainFrame.addToScene(almacenView);
        setEventosAlmacen(almacenView);
    }
    
    private void setEventosAlmacen(Almacen almacenView){
        //BUSCAR PRODUCTOS
        almacenView.getBtnBuscar().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String user = almacenView.getUsuario();
                String pass = almacenView.getContrasena();
                String categoria = almacenView.getCategoria();
                WSResponse response = client.getProd(user, pass, categoria);
                String status = response.getStatus().toLowerCase();
                
                if(status.equals("success")){
                    HashMap<String,Object> productos = WSBiblioteca.jsonToMap(response.getData());
                    almacenView.clearTable();
                    productos.forEach((isbn,nombre) -> {
                        Vector<Object> producto = new Vector<>();
                        producto.add(isbn);
                        producto.add(nombre);
                        almacenView.addProductoToTable(producto);
                    });
                } else {
                    JOptionPane.showMessageDialog(
                            mainFrame,
                            response.getMessage(),
                            response.getStatus().toUpperCase() + " " + response.getCode(),
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        });
        
        //CONSULTAR DETALLES
        almacenView.getBtnConsultar().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String user = almacenView.getUsuario();
                String pass = almacenView.getContrasena();
                String isbn = almacenView.getSelectedISBN();
                WSResponse response;
                String status;
                
                if(isbn == null){
                    JOptionPane.showMessageDialog(
                            mainFrame,
                            "No ha seleccionado un libro para consultar.",
                            "Error de selección.",
                            JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }
                
                response = client.getDetails(user, pass, isbn);
                status = response.getStatus().toLowerCase();
                
                if(status.equals("success")){
                    HashMap<String, Object> data = WSBiblioteca.jsonToMap(response.getData());
                    Detalles detalles = new Detalles();
                    Double precio;
                    
                    detalles.setAutor((String)data.get("Autor"));
                    detalles.setDescuento((boolean)data.get("Descuento"));
                    detalles.setEditorial((String)data.get("Editorial"));
                    detalles.setFecha((int)data.get("Fecha"));
                    detalles.setIsbn((String)data.get("ISBN"));
                    detalles.setNombre((String)data.get("Nombre"));
                    precio = (Double)data.get("Precio");
                    detalles.setPrecio(precio.floatValue());
                    displayProducto(detalles,"Almacen");
                } else {
                    JOptionPane.showMessageDialog(
                            mainFrame,
                            response.getMessage(),
                            response.getStatus().toUpperCase() + " " + response.getCode(),
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        });
        
        //NUEVO PRODUCTO
        almacenView.getBtnNuevo().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                displayFormularioNuevoProducto();
            }
        });
    
    }
    
    public void displayFormularioNuevoProducto(){
        Formulario formularioView = new Formulario();
        formularioView.setTitulo("Registrar Producto");
        mainFrame.addToScene(formularioView);
        setEventosFormularioNuevoProducto(formularioView);
    }
    
    public void setEventosFormularioNuevoProducto(Formulario formularioView){
        //CANCELAR
        formularioView.getBtnCancelar().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                displayAlmacen();
            }
        });
        //REGISTRAR PRODUCTO
        formularioView.getBtnAceptar().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String user = formularioView.getUsuario();
                String pass = formularioView.getContrasena();
                String categoria = formularioView.getCategoria();
                HashMap<String,Object> producto = new HashMap<>();
                WSResponse response;
                String status;
                
                producto.put("Autor", formularioView.getAutor());
                producto.put("Descuento", formularioView.getDescuento());
                producto.put("Editorial", formularioView.getEditorial());
                producto.put("Fecha", formularioView.getAno());
                producto.put("ISBN", formularioView.getISBN());
                producto.put("Nombre", formularioView.getNombre());
                producto.put("Precio", formularioView.getPrecio());
                response = client.setProd(user, pass, categoria, producto);
                status = response.getStatus().toLowerCase();
                
                if(status.equals("success")){
                    JOptionPane.showMessageDialog(
                            mainFrame,
                            response.getMessage() + "\nAlta realizada el: " + response.getData(),
                            response.getStatus().toUpperCase() + " " + response.getCode(),
                            JOptionPane.WARNING_MESSAGE
                    );
                    displayAlmacen();
                } else {
                    JOptionPane.showMessageDialog(
                            mainFrame,
                            response.getMessage(),
                            response.getStatus().toUpperCase() + " " + response.getCode(),
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        });;
    }
    
    public static void main(String[] args){
        App launcher = new App("https://wsbiblioteca.azurewebsites.net/");
        
        launcher.initView();
    }
}
