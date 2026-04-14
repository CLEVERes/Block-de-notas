package es.studium.BlockNotas;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ControladorBLN extends WindowAdapter implements ActionListener
{
	private VistaBLN vbln;
	private ModeloBLN mbln;
	
	public ControladorBLN(ModeloBLN mbln, VistaBLN vbln)
	{
		this.vbln = vbln;
		this.mbln = mbln;
		
		this.vbln.ventana.addWindowListener(this);
		this.vbln.mniNuevo.addActionListener(this);
		this.vbln.mniAbrir.addActionListener(this);
		this.vbln.mniGuardar.addActionListener(this);
		this.vbln.mniSalir.addActionListener(this);
		this.vbln.mniContarPalabras.addActionListener(this);
		this.vbln.mniContarLetras.addActionListener(this);
		this.vbln.mniContarVocales.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(vbln.mniNuevo))
		{
			vbln.txa.setText("");
		}
		else if(e.getSource().equals(vbln.mniAbrir))
		{
			vbln.fdlg.setMode(FileDialog.LOAD);
			String ruta = vbln.fdlg.getDirectory() + vbln.fdlg.getFile();
			mbln.abrirFichero(ruta);
		}
		else if(e.getSource().equals(vbln.mniGuardar))
		{
			
		}
		else if(e.getSource().equals(vbln.mniSalir))
		{
			
		}
		else if(e.getSource().equals(vbln.mniContarPalabras))
		{
			String txt = vbln.txa.getText();
			int nPalabras = mbln.contarPalabras(txt);
			vbln.dlg.setTitle("Contador de Palabras");
			vbln.lblDlg.setText("Hay " + nPalabras + " en este Texto");
			vbln.dlg.setVisible(true);
		}
		else if(e.getSource().equals(vbln.mniContarLetras))
		{
			String txt = vbln.txa.getText();
			mbln.contarLetras(txt);
		}
		else if(e.getSource().equals(vbln.mniContarVocales))
		{
			String txt = vbln.txa.getText();
			mbln.contarVocales(txt);
		}
	}
	
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	
}
