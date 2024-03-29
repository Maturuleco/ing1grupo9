using System;
using System.Data;
using System.Configuration;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using EstaDefinidaYDinero = System.Web.UI.Pair;

namespace Casino
{
    public class ApuestaGanarEnContra: ApuestaDados
    {
        private bool aFavor;
        private int puntaje;

        ApuestaGanarEnContra(bool aFavor, int puntaje)
        {
            aFavor = aFavor;
            puntaje = puntaje;
        }
        public override EstaDefinidaYDinero evaluar(ResultadoDados res)
        {
            decimal premio=0;
            if (res.sumaDados()==7) 
            { 
                if (aFavor) 
                { 
                    premio = 0;
                    return new Pair(true,premio); 
                } 
                else 
                { 
                    switch (res.sumaDados())
                    {
                        case 4: premio = valor * 5 / 11; 
                                break;
                        case 5: premio = valor*5/8;
                                break;
                        case 6: premio = valor*4/5;
                                break;
                        case 8: premio = valor*4/5;
                                break;
                        case 9: premio = valor*5/8;
                                break;
                        case 10: premio = valor*5/11;
                                break;
                    }
                    return new Pair(true,premio); 
                } 
            } 
            else if (res.sumaDados()==puntaje) 
            { 
                if (!aFavor) 
                { 
                    premio = 0;
                    return new Pair(true,premio);
                } 
                else 
                {
                    switch (res.sumaDados())
                    {
                        case 4: premio = valor * 9 / 5;
                                break;
                        case 5: premio = valor * 7 / 5;
                                break;
                        case 6: premio = valor * 7 / 6;
                                break;
                        case 8: premio = valor * 7 / 6;
                                break;
                        case 9: premio = valor * 7 / 5;
                                break;
                        case 10: premio = valor * 9 / 5;
                                break;
                    }
                    return new Pair(true,premio);
                }
            } 
            else
            { 
                return new Pair(false,-1); 
            }
        }
    }
}
