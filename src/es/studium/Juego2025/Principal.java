package es.studium.Juego2025;

public class Principal 
{ 
	public static void main(String[] args) 
	{ 
		Vista vista = new Vista(); 
		Modelo modelo = new Modelo(); //Ranking: consulta a la base de datos
		new Controlador(modelo, vista); 
		} 
	} 
