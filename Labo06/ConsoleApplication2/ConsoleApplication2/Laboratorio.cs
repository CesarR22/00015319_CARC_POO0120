using System;

namespace ConsoleApplication2
{
    public class Laboratorio : Evaluacion
    {
        private String tipo;

        public Laboratorio(int porcentaje, string nombre, string tipo) : base(porcentaje, nombre)
        {
            this.tipo = tipo;
        }
    }

    
}