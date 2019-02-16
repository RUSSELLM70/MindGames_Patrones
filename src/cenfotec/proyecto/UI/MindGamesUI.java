package cenfotec.proyecto.UI;

import java.io.*;
import java.util.ArrayList;

import cenfotec.proyecto.clases.Jugador;
import cenfotec.proyecto.clases.Ajedrez.*;
import cenfotec.proyecto.gestores.*;

public class MindGamesUI {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static GestorJugador GestorJ = new GestorJugador();
	
	private String strStatusMsg = "";
	private TableroAjedrez tableroAjedrez = new TableroAjedrez();
    private int JugadorActual = 1, startRow = 0, startColumn = 0, PiezaArrastrada = 0;
    private boolean PartidaInicial = true, Gano = false, Arrastrado = false;
    private Caballo miCaballo = new Caballo();
    private Alfil miAlfil = new Alfil();
    private Peon miPeon = new Peon();
    private Reina miReina = new Reina();
    private Rey miRey = new Rey();
    private Torre miTorre = new Torre();

	
	public static void main(String[] args) throws IOException {

	       int opc;
	        boolean noSalir = true;

	        do {
	            mostrarMenu();
	            opc = leerOpcion();
	            noSalir = ejecutarAccion(opc);
	        } while (noSalir);

	}

	static void mostrarMenu() throws java.io.IOException {
	
		out.println();
	    System.out.println("|------------------------|\n"
	                + "|  Bienvedido a MindGames|\n"
	                + "|   al juego de mesa     |\n"
	                + "|                        |\n"
	                + "|------------------------|");
	     
	    System.out.println("");
		System.out.println("1.Escoger tipo de juego ");
		System.out.println("2.Bajar partida ");
		System.out.println("3.Subir partida");
		System.out.println("4. Salir ");
		out.println();
	}
	static int leerOpcion() throws java.io.IOException {

	        int opcion;
	        out.print("Seleccione su opcion: ");
	        opcion = Integer.parseInt(in.readLine());
	        out.println();

	        return opcion;
	    }
	  
	static boolean ejecutarAccion(int popcion) throws java.io.IOException {

        boolean noSalir = true;

        switch (popcion) {

            case 1: 
            	TipoJuego();
                break;

            case 2:
            	BajarPartida();
            	
                break;

            case 3: 
            	SubirPartida();
            
                break;
        
            case 4: 
                System.out.println("---Gracias por usar nuestro sistema.---");
                noSalir = false;
                break;

            default: //Cualquier otro valor dado por el usuario se considera invᬩdo

                out.println("Opcion inv\u00a0lida");
                out.println();
                break;
        }
        return noSalir;
	}

	
	 public static void TipoJuego() throws NumberFormatException, IOException {

	        out.println();
	        out.println("1.- Ajedrez");
	        out.println("2.- Damas");
	        out.println("3.- GO");

	        int opc = Integer.parseInt(in.readLine());

	        switch (opc) {

	            case 1:
	            	out.println("Bienvenido al juego de ajedrez");
	                out.println("");

	            	CargarTableroAjedrez();
	            	break;

	            case 2:
	            	out.println("Bienvenido al juego de damas");
	                out.println("");
	                CargarTableroDamas();
	                break;

	            case 3:
	            	out.println("Bienvenido al juego de GO");
	                out.println("");
	                CargarTableroGo();
	                break;

	            default: //Cualquier otro valor dado por el usuario se considera invᬩdo

	                out.println("Opcion inv\u00a0lida");
	                out.println();
	                break;
	        }
	    }
	 
	 public static void BajarPartida() throws IOException{
		 
	        out.println("Seleccione cual partida desea bajar");
	        out.println();
	        out.println("1.- Ajedrez");
	        out.println("2.- Damas");
	        out.println("3.- GO");

	        int opc = Integer.parseInt(in.readLine());

	        switch (opc) {

	            case 1:
	            
	            	break;

	            case 2:
	            	
	                break;

	            case 3:
	            
	                break;

	            default: //Cualquier otro valor dado por el usuario se considera invᬩdo

	                out.println("Opcion inv\u00a0lida");
	                out.println();
	                break;
	        }
	 }
		
	 public static void SubirPartida() throws IOException{
		 
	 }

	 	/*
		 * Se inicializa la partida creando lo siguiente: 
		 * 1- Se debe de crear los jugadores de dicha partida (Pidiendo los nombres de jugador 1 y 2 para indentificarlos)
		 * 2- Crear la matriz(Tablero con sus dimensiones) 
		 * Imprimir el tablero en consola una vez que indistintamente del jugador realice su turno
		 *  para que pueda analizar el movimiento.
		 */
		
		//1- Ingresar jugadores
		//2- Crear dimensiones del tablero de juego
		//3- Imprimir tablero
	
	 public static void CargarTableroAjedrez() throws IOException{
		 CrearJugadoresPartida();
		 
		
	 }
      public static void CargarTableroDamas() throws IOException{
 		 CrearJugadoresPartida();

	 } 
     
      public static void CargarTableroGo() throws IOException{
 		 CrearJugadoresPartida();
 
	 }
	
	static void CrearJugadoresPartida() throws IOException {
		
		String  nombreJugador1 = "";
		String  nombreJugador2 = "";
		
		out.println("Ingrese el nombre de jugador 1");
		nombreJugador1 = in.readLine();
		out.println("Ingrese el nombre de jugador 2");
		nombreJugador2 = in.readLine();
		out.println("****************");
		GestorJ.CrearJugador(nombreJugador1);
		GestorJ.CrearJugador(nombreJugador2);
	    System.out.println("---Jugador 1 y Jugador 2 ingresados satisfactoriamente---");
		out.println("****************");

	}
	
	 static void ListarJugadores() {
	ArrayList<Jugador> lista = GestorJ.getListaJugadores();
		
		for(Jugador NombreJugador: lista) {
		System.out.println(NombreJugador);
	}
		
		
	}
	   //Comiezan el juego de nuevo
	    private void ReiniciarTablero() {
	        
	    	Gano = false;
	        JugadorActual = 1;
	        tableroAjedrez.ResetTablero();
	        
	    }
	    //Nuevo juego
	    public void JuegoNuevo() {
	        
	    	PartidaInicial = false;
	        ReiniciarTablero();
	        
	    }
	    
	    
	
	
}
