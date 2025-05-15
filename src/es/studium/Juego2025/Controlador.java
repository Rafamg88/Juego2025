package es.studium.Juego2025;

public class Controlador
{
	Vista vista;
	Modelo modelo;

public Controlador(Modelo m, Vista v) 
{ 
    this.modelo = m;                    
    this.vista = v;
}
}