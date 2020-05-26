using System;

namespace Labo5_01
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int n, f1 = 0, f2 = 1, r;
            
            Console.Write("Digite cantidad de numero a querer sumar: ");
            n=int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(f1);
                r = f1 + f2;
                f1 = f2;
                f2 = r;
            }
        }
    }
}