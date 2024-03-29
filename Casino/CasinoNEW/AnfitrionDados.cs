using System;
using System.Configuration;
using System.Collections.Generic;

namespace CasinoNEW
{
    public class AnfitrionDados
    {
        private IList<Jugador> participantes = new List<Jugador>();
        
        public void recibirParticipante(Jugador j) 
        {
			if (participantes.Contains(j))
				throw new Exception ("El jugador ya se encuentra en la mesa");
            participantes.Add(j);
        }
        public void despedirParticipante(Jugador j) 
        {
            participantes.Remove(j);
        }
		
		public IList<Jugador> Participantes {
			get { return participantes; }
		}
    }
}
