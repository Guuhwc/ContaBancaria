package contabancaria;

import javax.swing.JOptionPane;

public class Principal 
{
    public static void main(String args[])
    {
        Conta c1 = new Conta();
        int opcao = 0;
        do 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n\n1: Cadastrar & Exibir\n2: Exibir\n3: Deposito\n4: Saque"));
            switch (opcao)
            {
                case 1: 
                    c1.cadastrar(); 
                    c1.consultar();
                    break;  
                case 2: 
                    c1.consultar();
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null, "Saldo atual: "+c1.deposito());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saldo atual: "+c1.saque());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
            
        } while (opcao != 0);
    }
}
