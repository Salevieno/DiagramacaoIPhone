package main ;

import iPhoneFunctionalities.IPhone;

/**
 * 
 * @author Salevieno
 * @version 1.0
 * @since December 20, 2022
 *
 **/

public class App
{
	public static void main(String[] args)
	{
		IPhone iPhone = new IPhone() ;
		iPhone.ligar() ;
		iPhone.atender() ;
		iPhone.iniciarCorreioVoz() ;
		iPhone.exibirPagina() ;
		iPhone.adicionarNovaAba() ;
		iPhone.atualizarPagina() ;
		iPhone.tocarMusica() ;
		iPhone.pausarMusica() ;
		iPhone.selecionarMusica() ;
	}
}
