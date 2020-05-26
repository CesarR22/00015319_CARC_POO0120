using System;

namespace ConsoleApplication2
{
    public class Evaluacion
    {
        private int porcentaje;

        public int Porcentaje => porcentaje;
        private String nombre;

        public string Nombre => nombre;

        public Evaluacion(int porcentaje, string nombre)
        {
            this.porcentaje = porcentaje;
            this.nombre = nombre;
        }
    }
}