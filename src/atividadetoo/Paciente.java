package atividadetoo;

import javax.swing.JOptionPane;

public class Paciente extends Pessoa {

    private int codPaciente;
    private String senhaPaciente;

    public boolean logar(String senhaPaciente) {

        boolean certa = false;
        String senha="";
        senha = JOptionPane.showInputDialog(null, "(paciente)Senha: ");
        if (senha.equals(this.senhaPaciente)) {
            certa = true;
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }
        return certa;
    }

    public int getCodPaciente() {
        this.codPaciente =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do paciente"));
        System.out.println("o código paciente é: " + codPaciente);
        return this.codPaciente;

    }

    public String getSenhaFuncionario() {
        this.senhaPaciente = JOptionPane.showInputDialog(null,"Digite a senha de paciente");
        System.out.println("a senha de paciente é: " + senhaPaciente);
        return this.senhaPaciente;
    }

    public void setSenhaFuncionario(String senha) {

        if (senha != "") {
            this.senhaPaciente = senha;
        }
    }

    // codFuncionario não existente 
    public void setCodPaciente(int codPaciente) {
        if (codPaciente != 0) {
            this.codPaciente = codPaciente;
        }
    }

    @Override
    public void setNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSobrenome(String sobrenome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCpf(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRg(String rg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
