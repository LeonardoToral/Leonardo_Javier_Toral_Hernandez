package gato;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Funciones {
    ArrayList<Jugador> listaJugador = new ArrayList();
    
    public void agregar(String nombre, String contraseña, int edad, int puntaje) throws IOException{
        Jugador juego = new Jugador (nombre, contraseña, edad, puntaje);
        listaJugador.add(juego);
        guardar();
    }
    
    public int obtener_jugadores() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archi = new FileInputStream("archivo.txt");
        ObjectInputStream entra = new ObjectInputStream(archi);
        listaJugador = (ArrayList) entra.readObject();
        return listaJugador.size();
    }
    
    public ArrayList obtener_array() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archiv1 = new FileInputStream("archivo.txt");
        ObjectInputStream entrada1 = new ObjectInputStream(archiv1);
        listaJugador = (ArrayList) entrada1.readObject();
        return listaJugador;
    }
    
    public boolean nombre_registro (String name) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archiv2 = new FileInputStream("archivo.txt");
        ObjectInputStream entrada2 = new ObjectInputStream(archiv2);
        listaJugador = (ArrayList) entrada2.readObject();
        boolean bandera = false;
        for(int i=0;i<listaJugador.size();i++){
            Jugador buscar_jugador = (Jugador) listaJugador.get(i);
            if(name.equals(buscar_jugador.getNombre())){
                bandera=true;
            }
        }
        return bandera;
    }
    
    public boolean eliminar_registro(String name1, String password1) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archiv = new FileInputStream("archivo.txt");
        ObjectInputStream entrada = new ObjectInputStream(archiv);
        listaJugador = (ArrayList) entrada.readObject();
        boolean bandera = false;
        for(int i=0;i<listaJugador.size();i++){
            Jugador buscar_jugador1 = (Jugador) listaJugador.get(i);
            if(name1.equals(buscar_jugador1.getNombre())&&password1.equals(buscar_jugador1.getContraseña())){
                listaJugador.remove(i);
                guardar();
                bandera=true;
            }
        }
        return bandera;
    }
    
    public boolean buscarjugador (String name2, String password2) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream arch = new FileInputStream("archivo.txt");
        ObjectInputStream en = new ObjectInputStream(arch);
        listaJugador = (ArrayList) en.readObject();
        boolean bandera2 = false;
        for(int i=0;i<listaJugador.size();i++){
            Jugador buscar_jugador2 = (Jugador) listaJugador.get(i);
            if(name2.equals(buscar_jugador2.getNombre())&&password2.equals(buscar_jugador2.getContraseña())){
                bandera2 = true;             
            }
        }
        return bandera2;
    }
    
    public void añadirpuntos(String nom, int tirada) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream arc = new FileInputStream("archivo.txt");
        ObjectInputStream e = new ObjectInputStream(arc);
        listaJugador = (ArrayList) e.readObject();
        int puntos_agregar = tirada;
        for(int i=0;i<listaJugador.size();i++){
            Jugador buscar_jugador3 = (Jugador) listaJugador.get(i);
            if(nom.equals(buscar_jugador3.getNombre())){
                puntos_agregar += buscar_jugador3.getPuntaje();
                buscar_jugador3.setPuntaje(puntos_agregar);
            }
        }
        guardar();
    }
        
    public void guardar() throws FileNotFoundException, IOException{
        FileOutputStream archivo = new FileOutputStream("archivo.txt");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        salida.writeObject(listaJugador);
        salida.close();
    }
}
