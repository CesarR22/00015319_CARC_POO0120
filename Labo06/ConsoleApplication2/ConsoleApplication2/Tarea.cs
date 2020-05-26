using System;

namespace ConsoleApplication2
{
    public class Tarea : Evaluacion
    {
        private DateTime FechaEntrega;

        public DateTime FechaEntrega1 => FechaEntrega;

        public Tarea(int porcentaje, string nombre, DateTime fechaEntrega) : base(porcentaje, nombre)
        {
            FechaEntrega = fechaEntrega;
        }
    }
}