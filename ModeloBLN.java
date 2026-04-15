package es.studium.BlockNotas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ModeloBLN
{
	public String vocales = "aeiou";
	
	public String abrirFichero(String ruta)
	{
		String resultado = "";
		try
		{
			FileReader fileR = new FileReader(ruta);
			BufferedReader bufferedR = new BufferedReader(fileR);
			String linea;

			while ((linea = bufferedR.readLine()) != null)
			{
				resultado += linea + "\n";
			}

			bufferedR.close();
			fileR.close();
		}

		catch (FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}

		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return resultado;
	}
	
	public String guardarFichero(String ruta, String textoGuardar)
	{
		String resultado = "";
		try
		{
			FileWriter fileW = new FileWriter(ruta);
			BufferedWriter bufferedW = new BufferedWriter(fileW);
			PrintWriter printW = new PrintWriter(bufferedW);
			
			printW.println(textoGuardar);
			
			printW.close();
			bufferedW.close();
			fileW.close();
		}

		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return resultado;
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
