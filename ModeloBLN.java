package es.studium.BlockNotas;

import java.util.StringTokenizer;

public class ModeloBLN
{
	public void abrirFichero(String ruta)
	{
		
	}
	
	public int contarPalabras(String txt)
	{
		StringTokenizer espacios = new StringTokenizer(txt, " ");
		StringTokenizer saltos = new StringTokenizer(txt, "\n");
		int contador = espacios.countTokens() + saltos.countTokens();
		if(contador != 0)
		{
			contador--;
		}
		
		return contador;
	}
	
	public int contarLetras(String txt)
	{
		int contador = 0;
		
		
		return contador;
	}
	
	public int contarVocales(String txt)
	{
		int contador = 0;
		
		
		return contador;
	}
}
