package contabancaria;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Conta 
{    
    int numeroDaConta;
    double saldo;
    String proprietario;
    
    public Conta()
    {
        this.numeroDaConta = 0;
        this.proprietario = "";
        this.saldo = 200.0;        
    }
    public void cadastrar()
    {
        numeroDaConta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
        proprietario = JOptionPane.showInputDialog("Proprietario: ");
        Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
        //saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));
    }
    
    public void consultar()
    {
        DecimalFormat df = new DecimalFormat("¤ ###,###,##0.00"); //Mascara de reais (R$ 00,00)
        JOptionPane.showMessageDialog(null, "Bem vindo "+ this.proprietario + "!\nNumero da conta: "+ this.numeroDaConta + "\nSaldo: "+ df.format(this.saldo));
    }
    
    public double saque()
    {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
        if (valor <= 0)
        {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
        else
        {
            if (valor > saldo)
            {
                JOptionPane.showMessageDialog(null, "Você não possui essa quantia em sua conta!");
            }
            else
            {
                saldo = saldo - valor;
            }
        }
        return saldo;
    }
    
    public double deposito()
    {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        if (valor >= 0) 
        {
            saldo = saldo + valor;            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
        return saldo;
    }
}
