package atividadetoo;

import javax.swing.JOptionPane;

public class Enfermeiro {

    int corem;
    double salario;
    String senhaEnfermeiro;

    public boolean logar(String senhaEnfermeiro) {

        boolean certa = false;
        String senha="";
        senha = JOptionPane.showInputDialog(null, "(enfermeiro)Senha: ");
        if (senha.equals(this.senhaEnfermeiro)) {
            certa = true;
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }
        return certa;
    }

    public int getCorem() {
        int corem = 11372;
        System.out.println("o corem é: " + corem);
        return this.corem;
    }

    // crm não existente 
    public void setCorem(int corem) {
        if (corem != 0) {
            this.corem = corem;
        }
    }

    public String getSenhaEnfermeiro() {
        this.senhaEnfermeiro = JOptionPane.showInputDialog(null,"Digite a senha de enfermeiro");
        System.out.println("a senha de enfermagem é: " + senhaEnfermeiro);
        return this.senhaEnfermeiro;
    }

    public void setSenhaEnfermeiro(String senha) {
        if (senha != "") {
            this.senhaEnfermeiro = senha;
        }
    }
}
