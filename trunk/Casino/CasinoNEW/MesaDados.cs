using System;
using System.Configuration;

namespace CasinoNEW
{
    public class MesaDados : Mesa
    {
		public MesaDados(int identificador)
		{
			id = identificador;
		}
        public override void jugar() { }
        public override void agregarParticipante(Jugador j) { }
        public override void quitarParticipante(Jugador j) { }
        public void reportar() { }
    }
}
