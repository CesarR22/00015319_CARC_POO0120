namespace Laboratorio10
{
    public class CuentaBancaria
    {
        public string name;
        public double balance;

        public CuentaBancaria(string name = "unnamed", double balance = 0)
        {
            this.name = name;
            this.balance = balance;
        }
    }
}