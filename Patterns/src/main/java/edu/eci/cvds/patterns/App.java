package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		String[] nombre = args;
		String aux = "";
		for(int i = 0; i<nombre.length; i++){
			aux = aux+nombre[i]+" ";
		}
        System.out.println( "Hello "+aux+"!");
    }
}
