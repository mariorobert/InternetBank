package internetbank;

import static internetbank.Conta.criarConta;
import static internetbank.Conta.login;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class InternetBank {
    
    public static void main(String[] args) {
        
        /*
         *
         *  INCOMPLETO
         *  INCOMPLETO
         *
         */
        
        ArrayList<Conta> liConta = new ArrayList();
        Conta conta = new Conta();
        
        // LOGIN & REGISTRO
        while(true){
            int mOpcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar conta\n2 - Login\n3 - Fechar"));
            switch(mOpcao) {
                case 1:
                    criarConta(conta);
                    liConta.add(conta);
                    break;
                case 2:
                    login(liConta, conta.getNumConta(), conta.getAgencia(), conta.getSenha());
                case 3:    
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
            }
        }
        
    }
    
}
