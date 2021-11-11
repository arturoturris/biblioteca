package com.mycompany.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WSBiblioteca {
    private HttpClient client;
    private String wsEndpoint;
    
    public WSBiblioteca(String wsEndpoint){
        this.wsEndpoint = wsEndpoint;
        this.client = HttpClient.newHttpClient();
    }
    
    public static String mapToJson(HashMap<String,Object> body){
        try {
            return new ObjectMapper()
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(body);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(WSBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
            return "{}";
        }
    }
    
    public static HashMap<String,Object> jsonToMap(String json){
        try {
            return new ObjectMapper().readValue(json, new TypeReference<HashMap<String,Object>>() {});
        } catch (JsonProcessingException ex) {
            Logger.getLogger(WSBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
            return new HashMap<String,Object>();
        }
    }
    
    private HttpRequest buildRequest(String method, String path, String body){
        return HttpRequest.newBuilder()
                .uri(URI.create(this.wsEndpoint+"/"+path))
                .header("Content-Type", "application/json")
                .method(method.toUpperCase(), BodyPublishers.ofString(body))
                .build();
    }
    
    private WSResponse sendRequest(String method, String path, String body){
        try {
            HttpRequest request = this.buildRequest(method, path,body);
            HttpResponse<String> response = this.client.send(request, BodyHandlers.ofString());
            switch(response.statusCode()){
                case 200:
                    return new ObjectMapper().readValue(response.body(), WSResponse.class);
                case 404:
                    return new WSResponse(Integer.toString(404), "La url especificada no existe.", response.toString(), "Error");
                default:
                    return new WSResponse(Integer.toString(response.statusCode()), "Hubo un error con el servidor. Revisar data para más detalles.", response.toString(), "Error");
            }   
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(WSBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
            return new WSResponse(Integer.toString(500), "Hubo un error con el servidor. Revisar data para más detalles.", ex.getMessage(), "Error");
        }
    }
    
    public WSResponse getProd(String user, String pass, String categoria){
        String path = "/getProd/" + categoria;
        HashMap<String,Object> body = new HashMap<String,Object>();
        
        body.put("user", user);
        body.put("pass", pass);
        return this.sendRequest("GET", path, WSBiblioteca.mapToJson(body));
    }
    
    public WSResponse getDetails(String user, String pass, String isbn){
        String path = "/getDetails/" + isbn;
        HashMap<String,Object> body = new HashMap<String,Object>();
        
        body.put("user", user);
        body.put("pass", pass);
        return this.sendRequest("GET", path, WSBiblioteca.mapToJson(body));
    }
    
    public WSResponse setProd(String user, String pass, String categoria, HashMap<String,Object> producto){
        String path = "/setProd/" + categoria;
        HashMap<String,Object> body = new HashMap<String,Object>();
        
        body.put("user", user);
        body.put("pass", pass);
        body.put("producto", WSBiblioteca.mapToJson(producto));
        return this.sendRequest("POST", path, WSBiblioteca.mapToJson(body));
    }
    
    public static void main(String[] args) {
        WSBiblioteca client = new WSBiblioteca("https://wsbiblioteca.azurewebsites.net/");
        WSResponse response;
        
        //PRUEBA PARA getProd
        response = client.getProd("pruebas1", "12345678a", "libros");
        
        //PRUEBA PARA updateProd
//        HashMap<String,Object> body = new HashMap<String,Object>();
//        body.put("Autor", "Autor X");
//        body.put("Descuento", true);
//        body.put("Editorial", "Editorial X");
//        body.put("Fecha", 2005);
//        body.put("ISBN", "LIB004");
//        body.put("Nombre", "Libro 4");
//        body.put("Precio", (float)45.50);
//        response = client.setProd("pruebas1", "12345678a", "libros", body);
        
        //RESPUESTA DE LA SOLICITUD
        System.out.println(response.getCode());
        System.out.println(response.getData());
        System.out.println(response.getMessage());
        System.out.println(response.getStatus());
    }
}
