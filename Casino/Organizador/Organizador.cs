// Organizador.cs created with MonoDevelop
// User: tas at 12:01 12/08/2008
//
// To change standard headers go to Edit->Preferences->Coding->Standard Headers
//

using System;
using System.IO;
using System.Collections.Generic;

namespace Organizador
{
	public class Organizador
	{
		
		private string[] dirs;
		
		public string[] Dirs {
			get {return dirs;}
			set {dirs = value;}
		}

		public Organizador()
		{
			string a = Configuracion.DIRECTORIO_Escritura_Administracion;
			string b = Configuracion.DIRECTORIO_Escritura_Jugadores;
			string c = Configuracion.DIRECTORIO_Escritura_Servidor;
			string[] dirs = new string[]{a, b, c};
		}
				
		public void Organizar() {
			foreach (string dir in Dirs) {
				DirectoryInfo di = new DirectoryInfo(dir);
				FileInfo[] files = di.GetFiles("*.xml");
			
				foreach (FileInfo fi in files) {
					string mensaje = GetMensaje(fi);
					OrganizarMensaje(mensaje, fi);
				}
			}
		}
		
		public string GetMensaje(FileInfo archivo) {
			string nombreArchivo = archivo.Name;
			
			string[] partes = nombreArchivo.Split(new char[] {'.'});
            string completo = partes[0];
            string mensaje = completo.Substring(0, completo.Length - 6);
			
			return mensaje;
		}
		
		public void OrganizarMensaje(string mensaje, FileInfo fi)
		{
			if (Configuracion.Mensajes_Lectura_Administracion.Contains(mensaje))
				fi.MoveTo(Configuracion.DIRECTORIO_Lectura_Administracion);
			
			else if (Configuracion.Mensajes_Lectura_Jugadores.Contains(mensaje))
				fi.MoveTo(Configuracion.DIRECTORIO_Lectura_Jugadores);

			else if (Configuracion.Mensajes_Lectura_Servidor.Contains(mensaje))
				fi.MoveTo(Configuracion.DIRECTORIO_Lectura_Servidor);
		}
		
	}
}
