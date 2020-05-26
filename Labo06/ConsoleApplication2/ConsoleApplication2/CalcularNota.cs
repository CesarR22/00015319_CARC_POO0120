
using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.Runtime.InteropServices;


namespace ConsoleApplication2
{
    public abstract class CalcularNota<ev, Promedio>
    {
        public abstract double Calculator(List<Evaluacion> ev);


        private static double Nota = 0;

            foreach

        private static double Promedio = 0;

            foreach(VarEnum s :Evaluacion in ev)
        {
            Console.WriteLine("Ingres la nota de " + s.Nombre);
            Nota = Convert.ToDouble(Console.ReadLine());
            Promedio += (Nota * ((s.Porcentaje) / 100.00));


        }
        return Promedio;

    }

}

 
