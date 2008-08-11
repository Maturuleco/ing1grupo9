using System;
using System.Collections.Generic;
using System.Text;

namespace CasinoNEW
{
	class ManejadorManipulacion
	{

		private EscritorManipulacion escritor = new EscritorManipulacion();

		public void ManipularMesaDados(int id, string usuario, int dado1,
			int dado2, TipoJugada tj)
		{
			Casino c = Casino.GetInstance();
			if (!c.EstaAbierto())
				escritor.DenegarManipulacionDados(id, usuario);
			else
			{
				GestionadorUsuarios g = GestionadorUsuarios.GetInstance();
				try
				{
					// En realidad, no uso al manipulador. S�lo lo
					// pido para saber si el usuario est� autenticado
					// como manipulador.
					// TODO: �Rever?
					Manipulador m = g.GetManip(usuario);

					m.manipularResultado(new ResultadoDados(dado1, dado2),
						JuegoDados.GetInstance().getMesas());

					escritor.AceptarManipulacionDados(id, usuario);
				}
				// No distingo las excepciones porque el protocolo
				// ni siquiera tiene la opci�n de enviar un motivo
				// para denegar la operaci�n.
				catch (Exception e)
				{
					escritor.DenegarManipulacionDados(id, usuario);
				}
			}
		}
	}
}
