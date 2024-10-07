package org.example;

import org.example.domain.Administrador;
import org.example.domain.Cliente;
import org.example.domain.GestorViajes;
import org.example.service.Proveedor;
import org.example.service.Viaje;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main( String[] args ) {

        //Creación de usuario administrador

        Administrador a1 = new Administrador("1039459977", "Manuel", "López", "01-11-1989", "Carrera 10", "Cellphone", "(57)3127630797", "mario@gmail.com", "10-06-2004", "Ventas", "Jefe de Ventas", 2000, "mlopez", "mlopez123");
        Administrador a2 = new Administrador("42974252", "María", "Mora", "12-10-1991", "Calle 8", "Cellphone", "(57)3107680797", "maria@gmail.com", "10-01-2014", "Contabilidad", "Jefe de Contabilidad", 1500, "mmora", "mmora123");
        Administrador a3 = new Administrador("AM245673", "Julio", "Luna", "01-11-2000", "Calle 11", "Cellphone", "(57)3117650777", "julio@gmail.com", "10-02-2024", "Sistemas", "Jefe de Sistemas", 2800, "jluna", "jluna123");

        //Crear lista e ingresar administrador a la lista

        List<Administrador> listaAdministrador = new ArrayList<>();

        listaAdministrador.add(a1);
        listaAdministrador.add(a2);
        listaAdministrador.add(a3);

        //Imprimir los elementos del ArrayList

        System.out.println("---------------------------------------------------------");
        System.out.println("Usuarios registrados con perfil de administrador");
        System.out.println();
        for (int i = 0; i < listaAdministrador.size(); i++) {

            System.out.println(listaAdministrador.get(i).toString());
        }

        //Agregar viajes

        Viaje v1 = new Viaje("v001","Londres","Inglaterra");
        Viaje v2 = new Viaje("v002","Machupichu","Peru");
        Viaje v3 = new Viaje("v003","La Habana","Cuba");

        //creación de clientes
        Cliente c1 = new Cliente("1123","Daniela","Castro","23-03-1993","Calle80","Cellphone","(57)3127630796","d.castrog@gmail.com","Colombia","Medellín");
        Cliente c2 = new Cliente("1124","Marlon","Gómez","21-06-1991","Carrera30","Cellphone","(57)3207640796","marlon@gmail.com","México","Ciudad de México");
        Cliente c3 = new Cliente("1125","Mirta","Angel","11-02-1990","Carrera50","Cellphone","(57)3117636796","mirtaa@gmail.com","Colombia","Bogotá");

        //Agregar viajes a los clientes

        c1.addDestination(v1.getCityName());
        c1.addDestination(v2.getCityName());
        c1.addDestination(v3.getCityName());

        c2.addDestination(v1.getCityName());
        c2.addDestination(v2.getCityName());

        c3.addDestination(v1.getCityName());

        //Crear lista e ingresar cliente a la lista

        List<Cliente> listaClientes = new ArrayList<>();

        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);

        //Crear usuario GestorViajes

        GestorViajes gv1 = new GestorViajes("12345", "Otto", "Mira", "23-08-1992",
                "Calle45", "Cellphone","(57)3127630794","otto.castrog@gmail.com",
                "Norte", "20-01-2013",2000, "omira", "omira123",4.0f);

        GestorViajes gv2 = new GestorViajes("12346", "Paula", "Ciro", "01-02-1992",
                "Carrera45", "Cellphone","(57)3127630792","ciro@gmail.com",
                "Sur", "20-04-2015",1500, "pciro", "pciro123",3.0f);

        //Crear lista e ingresar gestor de Viajes a la lista

        List<GestorViajes> listaGestorViaje = new ArrayList<>();

        listaGestorViaje.add(gv1);
        listaGestorViaje.add(gv2);

        //Crear proveedores
        Proveedor p1 = new Proveedor("pa001","trivago","Alojamiento");
        Proveedor p2 = new Proveedor("pa002","Hoteles.com","Alojamiento");
        Proveedor p3 = new Proveedor("pv001","Kayak","Vuelos");
        Proveedor p4 = new Proveedor("pv002","SkyScanner","Vuelos");

        //Crear lista e ingresar proveedores a la lista

        List<Proveedor> listaProveedor = new ArrayList<>();

        listaProveedor.add(p1);
        listaProveedor.add(p2);
        listaProveedor.add(p3);
        listaProveedor.add(p4);

        //Imprimir proveedores
        System.out.println("---------------------------------------------------------");
        System.out.println("Lista de proveedores");
        System.out.println();
        for (int i = 0; i < listaProveedor.size(); i++) {

            System.out.println(listaProveedor.get(i).toString());
        }

    }
}
