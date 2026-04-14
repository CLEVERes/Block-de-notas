package es.studium.BlockNotas;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

public class VistaBLN
{
	Frame ventana = new Frame("Block de Notas");
	MenuBar mnBar = new MenuBar();
	Menu archivo = new Menu("Archivo");
	Menu gestion = new Menu("Gestión");
	MenuItem mniNuevo = new MenuItem("Nuevo");
	MenuItem mniAbrir = new MenuItem("Abrir");
	MenuItem mniGuardar = new MenuItem("Guardar");
	MenuItem mniSalir = new MenuItem("Salir");
	MenuItem mniContarPalabras = new MenuItem("Contador de palabras");
	MenuItem mniContarLetras = new MenuItem("Contador de Letras");
	MenuItem mniContarVocales = new MenuItem("Contador de Vocales");
	TextArea txa = new TextArea("");
	
	Dialog dlg = new Dialog(ventana, "",true);
	Label lblDlg = new Label("");
	
	FileDialog fdlg = new FileDialog(ventana,"Seleccionar archivo", FileDialog.LOAD);
	
	public VistaBLN()
	{
		//ventana.setLayout(null);
		
		ventana.setMenuBar(mnBar);
		mnBar.add(archivo);
		archivo.add(mniNuevo);
		archivo.add(mniAbrir);
		archivo.add(mniGuardar);
		archivo.addSeparator();
		archivo.add(mniSalir);
		
		mnBar.add(gestion);
		gestion.add(mniContarPalabras);
		gestion.add(mniContarLetras);
		gestion.add(mniContarVocales);
		
		ventana.add(txa);
		
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(true);
		ventana.setSize(800, 600);
		
		dlg.setLayout(new FlowLayout());
		dlg.add(lblDlg);
		
		dlg.setVisible(false);
		dlg.setLocationRelativeTo(null);
		dlg.setResizable(false);
		dlg.setSize(400, 200);
		
		fdlg.setFile("*.txt");
		fdlg.setVisible(false);
	}
}
