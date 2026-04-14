package es.studium.BlockNotas;

import java.util.StringTokenizer;

public class ModeloBLN
{
	public String vocales = "aeiou";
	
	public void abrirFichero(String ruta)
	{

	}

	public int contarPalabras(String txt)
	{
		StringTokenizer espacios = new StringTokenizer(txt, " ");
		StringTokenizer saltos = new StringTokenizer(txt, "\n");
		int contador = espacios.countTokens() + saltos.countTokens();
		if (contador != 0)
		{
			contador--;
		}

		return contador;
	}

	public int contarLetras(String txt)
	{
		int contador = 0;

		for (int i = 0; i < txt.length(); i++)
		{
			if (Character.isLetter(txt.charAt(i)))
			{
				contador++;
			}
		}
		return contador;
	}

	public int contarVocales(String txt)
	{
		int contador = 0;

		for (int i = 0; i < txt.length(); i++)
		{
			for (int j = 0; j < vocales.length(); j++)
			{
				if(txt.charAt(i) == vocales.charAt(j))
				{
					contador++;
				}
			}
		}
		return contador;
	}
}
