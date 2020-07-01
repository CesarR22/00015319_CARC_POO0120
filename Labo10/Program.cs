using System;
using System.Collections.Generic;

namespace Laboratorio10
{
    class Program
    {
        private delegate void MyDelegate(List<CuentaBancaria> cuentas);
        static MyDelegate accountsActions;
        
        static void Main(string[] args)
        {
            var account = new List<CuentaBancaria>();
            int op = 0;
            string name;
            double balance;

            account.Add(new CuentaBancaria("Samuel", 200));
            account.Add(new CuentaBancaria("Daniela", 150));


            do
            {
                mainMenu();
                op = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("--------------------------------------");
                switch (op)
                {
                    case 1:
                        //Agregar cuenta
                        Console.WriteLine("Nombre: ");
                        name = Console.ReadLine();
                        Console.WriteLine("Saldo: ");
                        balance = Convert.ToDouble(Console.ReadLine());
                        account.Add(new CuentaBancaria(name, balance));
                        Console.WriteLine($"{name} su cuenta ha sido agregada!!");
                        break;
                    case 2:
                        //Ver cuentas almacenadas
                        foreach (var cuentaBancaria in account)
                        {
                            Console.WriteLine($"Nombre: {cuentaBancaria.name}");
                        }
                        break;
                    case 3:
                        //Ver cuentas almacenadas y sus totales
                        accountsActions = showAccounts;
                        accountsActions += totalAccounts;
                        
                        accountsActions.Invoke(account);
                        break;
                    case 4:
                        //Ver cuentas almacenadas y sus totales por la vocal de inicio
                        Action<List<CuentaBancaria>> myActions = (ac) =>
                        {
                            foreach (var cuentaBancaria in ac)
                            {
                                Console.WriteLine($"Nombre: {cuentaBancaria.name}, Saldo: ${cuentaBancaria.balance}");
                            }
                        };

                        myActions += (acc) =>
                        {
                            double total = 0;

                            foreach (var cuentaBancaria in acc)
                            {
                                total += cuentaBancaria.balance;
                            }
                            Console.WriteLine($"Total de cuentas: ${total}");
                        };

                        myActions += (acco) =>
                        {
                            Console.WriteLine("Cuentas que inician con vocal: ");
                            foreach (var cuentaBancaria in acco)
                            {
                                var c = Char.ToLower(cuentaBancaria.name[0]);
                                if (c.Equals('a') || c.Equals('e') || c.Equals('i') || c.Equals('o')
                                || c.Equals('u'))
                                {
                                    Console.WriteLine($"Nombre: {cuentaBancaria.name}," +
                                                      $" Saldo: {cuentaBancaria.balance}");
                                }
                            }
                        };
                        
                        myActions.Invoke(account);
                        break;
                }

            } while (op != 5);
        }
        
        public static void mainMenu()
        {
            Console.WriteLine("---------------------" +
                              "\n[1]- Agregar cuenta." +
                              "\n[2]- Ver cuentas almacenadas." +
                              "\n[3]- Ver cuentas almacenadas y total de cuentas." +
                              "\n[4]- Ver cuentas almacenadas, total de cuentas, y cuentas con vocal." +
                              "\n[5]- Salir." +
                              "\nSu opcion: ");
        }

        public static void showAccounts(List<CuentaBancaria> ac)
        {
            foreach (var cuentaBancaria in ac)
            {
                Console.WriteLine($"Nombre: {cuentaBancaria.name}, Saldo: ${cuentaBancaria.balance}");
            }
        }

        public static void totalAccounts(List<CuentaBancaria> acc)
        {
            double total = 0;

            foreach (var cuentaBancaria in acc)
            {
                total += cuentaBancaria.balance;
            }
            
            Console.WriteLine($"Total de cuentas: ${total}");
        }
        
    }
}