using System;

namespace labo5_02
{
    internal class Program
    {
        public static void Main(String[] args)
        {
            String frase;
            Console.Write("Escriba frase: ");
            frase = Console.ReadLine();

            char[] temp = frase.ToCharArray();
            Array.Reverse(temp);
            String frase1 = new String(temp);

            if (frase.ToLower().Equals(frase1.ToLower()))
            {
                Console.Write("Es palindrome");
            }
            else
            {
                Console.Write("No es palindrome");
            }

        }
    }
}