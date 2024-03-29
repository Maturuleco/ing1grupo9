// Terminal.cs created with MonoDevelop
// User: tas at 12:04 06/08/2008
//
// To change standard headers go to Edit->Preferences->Coding->Standard Headers
//

using System;

namespace CasinoNEW
{
	
	
	public class Terminal
	{
		private int id;
		public int Id{
			get{ return id;}
	//		set{ id = value;}
		}
		private Jugador observador;
		public Jugador Observador{
			get { return observador;}
	//		set {observador = value;}
		}
		public Terminal(Jugador obs)
		{
			id = GestionadorUsuarios.GetInstance().GetId(obs.Nombre);
			observador = obs;
		}
		public void Notificar(ReporteDados rep){
			ManejadorDados.Notificar(id, observador.Nombre, rep.IdMesa, 
			         rep.Jugadores, rep.ProxTirador, rep.ProxTiroSalida,
			         rep.Punto, rep.UltimoTirador, rep.ResultadoUltimo,
			                         rep.Premios, rep.Apuestas);
		}
	}
}
