    public class Gerente extends Funcionario {
        private int senha;
        private int numeroDeFuncionariosGerenciados;

        public boolean autentica(int senha) {
            if (this.senha == senha) {
                System.out.println("Acesso Permitido!");
                return true;
            } else {
                System.out.println("Acesso Negado!");
                return false;
            }
        }
        
        public void setNome(String nome) {
            this.nome = nome;
            return ;
        }
        
        public void setSenha(int senha) {
            this.senha = senha;
            return ;
        }
        // setter da senha omitido
    }