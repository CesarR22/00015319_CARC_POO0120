using System;

namespace Labo5_03
{
    internal class Program
    {
        public static void Main(string[] args)
        {
             Console.WriteLine("Ingresar N numeros a querer mostrar: ");
                    int n =int.Parse(Console.ReadLine());
                    imprimirN(n,0);
                }
                public static void imprimirN(int numeros, int act){
                    act++;
                    if(numeros==act)
                    {
                        Console.Write(""+numeros);
                    }
                    else
                    {
                        Console.Write(""+act+",");
                        imprimirN(numeros,act);
                        Console.Write(","+act);
                    }
                }
        }
    }
