package atividadetoo;

import javax.swing.JOptionPane;

public class Medico {

    String especialidades;
    int crm;
    String senhaMedico;
    double salario;

    public boolean logar(String senhaMedico) {

        boolean certa = false;
        String senha="";
        senha = JOptionPane.showInputDialog(null, "(medico)Senha: ");
        if (senha.equals(this.senhaMedico)) {
            certa = true;
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }
        return certa;
    }

    public int getCrm() {
        this.crm = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o crm do médico"));
        return this.crm;

    }

    // crm não existente 
    public void setCrm(int crm) {
        if (crm != 0) {
            this.crm = crm;
        }
    }

    public String getEspecialidades() {
        this.especialidades =JOptionPane.showInputDialog(null,"Digite as especialidades do médico");
        System.out.println("as especialidades são: " + especialidades);
        return this.especialidades;
    }

    public void setEspecialidades(String especialidades) {
        if (especialidades != "") {
            this.especialidades = especialidades;
        }
    }

    public String getSenhaMedico() {
        this.senhaMedico = JOptionPane.showInputDialog(null,"Digite a senha de Médico");
        System.out.println("a senha de médicos é: " + senhaMedico);
        return this.senhaMedico;
    }

    public void setSenhaMedico(String senha) {

        if (senha != "") {
            this.senhaMedico = senha;
        }
    }
}
