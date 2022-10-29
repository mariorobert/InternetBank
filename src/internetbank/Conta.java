package internetbank;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conta {
    
    private int agencia;
    private int numConta;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String senha;
    private double saldo;
    
    // número da conta
    public int setNumConta(int numConta) {
        this.numConta++;
        return this.numConta;
    }
    
    public int getNumConta(){
        return numConta;
    }
    
    
    // agencia
    public int getAgencia() { return agencia; }
    public void setAgencia(int agencia) { this.agencia = agencia; }

    // endereço
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    
    // nome
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // cpf
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    // senha
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    // email
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // saldo
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    
    // retorna NOME + CPF + E-MAIL + SALDO
    public String retorno() {
        return "NOME: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nE-MAIL: " + this.getEmail() + "\nSALDO: " + this.getSaldo();
    }

    // metodo para criar conta
    public static int criarConta(Conta conta){
        
        conta.setNome(JOptionPane.showInputDialog("Digite nome completo"));
        conta.setEndereco(JOptionPane.showInputDialog("Digite endereço"));
        conta.setCpf(JOptionPane.showInputDialog("Digite CPF"));
        conta.setNumConta(0);
        conta.setAgencia(2022);
        conta.setEmail(JOptionPane.showInputDialog("Digite endereço de e-mail"));
        conta.setSaldo(0);
          
        return 0;
    }
    
    // TELA LOGIN
    public static int telaLogin(){
        boolean loginRun = true;
        while(loginRun) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Depositar\n2 - Sacar\n3 - Transferir\n4 - Sair"));
            switch(opcao){
                case 4:
                    loginRun = false;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");
            }
        }
        return 0;
    }
    
    // LOGIN
    public static int login(ArrayList<Conta> liConta, int numConta, int agencia, String senha){
        if ( !liConta.isEmpty()){
            for(Conta conta : liConta) {
                if(conta.getNumConta() == numConta) {
                    JOptionPane.showMessageDialog(null, "NOME: " + conta.getNome() + "\nCPF: " + conta.getCpf() + "\nE-MAIL: " + conta.getEmail() + "\nSALDO: " + String.valueOf(conta.getSaldo()));
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Nenhuma conta encontrada");
        }
        
        return 0;
    }

    
    
}
