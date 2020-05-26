using System;

namespace Labo5_04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Digite palabra/frase: ");
            String palabra = Console.ReadLine();

            palabra = palabra.Replace("a", "b");
            
            Console.Write(palabra);
        }
    }
}