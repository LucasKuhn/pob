    /** 
     * 
     * Convenção para retorno dos métodos de inclusão:
     * 0 - Inclusão com sucesso 
     * 1 - Indice inválido 
     * 2 - Capacidade excedida
     * 3 - Aluno já existe
     * 
     * @author Lucas
     * @version 12/04
     */ 
public class ListaDeAlunos
{   
    private Nodo inicio = null ;
    private Nodo fim = null ;
    private int tamanho;
    private int capacidade;
    
    public ListaDeAlunos()
    {
        this.capacidade = -1 ;
    }
    
    public ListaDeAlunos(int capacidade)
    {
        this.capacidade = capacidade ;
    }
    
    public Aluno getAluno(int index)
    {
        Nodo temp = this.inicio ;
        int i = 0 ;
        while (temp.getProx() != null) {
            temp = temp.getProx() ;
            i++ ;
            if (i == index) {
                return temp.getInfo() ;
            }
        }
    }
    
    public int getCapacidade()
    {
        return this.capacidade;
    }
    
    public int setCapacidade(int capacidade)
    {
        return this.capacidade = capacidade;
    }
    
    public int incluir(Aluno novoAluno) 
    {
        if ( this.tamanho >= this.capacidade){
            return 2;
        }
        
        if ( this.contem(novoAluno.nome) != null ){
            return 3;
        }
       
        Nodo temp = new Nodo(novoAluno);
        if ( this.tamanho == 0 ) {
            this.inicio = this.fim = temp;
        }
        else {
            this.fim.setProx(temp) ;
            this.fim = temp ;
        }
        this.tamanho++ ;
        return 0 ;
    }    
    
    
    
    public int incluir(Aluno novoAluno, int index) 
    {
        if ( this.contem(novoAluno.nome) != null ){
            return 3; // Aluno já existe
        }
        
        if ( this.tamanho >= this.capacidade){
            return 2; // Capacidade Excedida
        }        
        
        if ( index < 0 || index > this.tamanho ){
            return 1; // Indice inválido
        }   
        
        if ( index == this.tamanho ) // Ultima posição
        {  
            return this.incluir(novoAluno) ;
        }
        
        Nodo temp = this.inicio ;
        int i = 0 ;
         while (true) 
        {
            if (i == index) 
            { 
                Nodo novoNodo = new Nodo(novoAluno) ;
                if (index == 0) // Primeira posição
                { 
                    novoNodo.setProx(temp) ;
                    this.inicio = novoNodo ;
                }
                else 
                {
                     novoNodo.setProx(temp.getProx()) ;
                     temp.setProx(novoNodo) ;
                     this.fim = novoNodo ;
                }
                return 0 ;
            }
            temp = temp.getProx() ;
            i++ ;
        }
    }  
    
    public boolean vazia() 
    {
        return this.tamanho == 0 ;
    }  
    
    public int tamanho()
    {
        return this.tamanho;
    }
    
    
    /**
     * Metodo para encontrar um aluno através do nome do aluno.
     * @param nome Nome do aluno que deve ser procurado
     * @return o aluno casa o encontre ou null
     */
    public Aluno contem(String nomeDoAluno)
    {
        Nodo temp = this.inicio ;
        while (temp != null) {
            if (temp.getInfo().nome.equals(nomeDoAluno)) {
                return temp.getInfo() ;
            }
            temp = temp.getProx();
        }
        return null;
    }
    
    public boolean ordernar()
    {
        // Bubble Sort
        Nodo temp = this.inicio ; 
        boolean trocou = true ;
        while (trocou)
        {
            temp = this.inicio ; 
            trocou = true ;
            while(trocou)
            {
                if (temp.getInfo().nome == temp.getProx().getInfo().nome) {
                    alunoAuxiliar = this.alunosDaLista[i];
                    this.alunosDaLista[i] = this.alunosDaLista[j];
                    this.alunosDaLista[j] = alunoAuxiliar;
                }
            }
        }
        for (int i = 0; i < this.tamanho; i++) {
            for (int j = i + 1; j < this.tamanho; j++) {
                Aluno alunoAuxiliar ;
                
            }
        }
        return true ;
    }
}