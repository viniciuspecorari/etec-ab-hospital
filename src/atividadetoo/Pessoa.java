package atividadetoo;

import javax.swing.JOptionPane;

abstract class Pessoa extends AtividadeTOO {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;

    public String getNome() {
        this.nome =JOptionPane.showInputDialog(null,"Digite o nome");
        return this.nome;

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome() {
        this.sobrenome =JOptionPane.showInputDialog(null,"Digite o sobrenome");
        System.out.println("o sobrenome é: " + sobrenome);
        return this.sobrenome;
    }

    public abstract void setSobrenome(String sobrenome);

    public String getCpf() {
        this.cpf =JOptionPane.showInputDialog(null,"Digite o CPF");
        System.out.println("o CPF é: " + cpf);
        return this.cpf;

    }

    public abstract void setCpf(String cpf);
    

    public String getRG() {
        this.rg =JOptionPane.showInputDialog(null,"Digite o RG");
        System.out.println("o RG é: " + rg);
        return this.rg;
    }
    
 
    public abstract void setRg(String rg);

    public boolean logar() {

        String senhaPessoa = "convidado";
        boolean certa = false;
        String senha="";
        senha = JOptionPane.showInputDialog(null, "(pessoa)Senha: ");
        if (senha.equals(senhaPessoa)) {
            certa = true;
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }
        return certa;
    }

}
