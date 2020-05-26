using System;

using System.Collections.Generic;

using System.Linq;

namespace Labo5_05
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var vocales = new[] { 'a', 'e', 'i', 'o', 'u' };
            
            Console.WriteLine("Digite la frase: ");
            var text = Console.ReadLine().ToLower();
            
            foreach (var v in vocales)
            {
            var matches = text.Count(x => x == v);
            Console.WriteLine($"Existen {matches} vocales {v}");
            }
            

        }
    }
}