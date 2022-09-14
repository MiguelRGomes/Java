public class Cliente {
    
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    
    public Cliente(){
    
    }
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public void setNumeroConta(String numeroConta){
        if(numeroConta.length()== 8){
              if(numeroConta.charAt(6) == '-'){
                    this.numeroConta = numeroConta;
              }
              else {
                  System.out.println("Número da conta sem dígito verificador");
                  this.numeroConta = "Inválido";
              }
        }
        else {
                 System.out.println("Número da conta sem dígito verificador");
                 this.numeroConta = "Inválido";
        }
    }
    public void setNumeroAgencia(String numeroAgencia){
        if(numeroAgencia.length() == 8){
              if(numeroAgencia.charAt(6) == '-'){
                    this.numeroAgencia = numeroAgencia;
              }
              else {
                  System.out.println("Número da agência sem dígito verificador");
                  this.numeroAgencia = "Inválido";
              }
        }
        else {
            System.out.println("Número da agência sem dígito verificador");
            this.numeroAgencia = "Inválido";
        }
    }
    public void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("Nome com tamanho inválido");
            this.nome = "Inválido";
        }
    }
    public void setSaldo(float saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo não pode ser negativo");
    }
    
    public void sacar(float x){
        this.setSaldo(this.saldo-x);
    }
    
    public void depositar(float x){
        this.setSaldo(this.saldo+x);
    }
    // getters
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public String mostra(){
        return "Conta " + this.numeroConta + " Agencia "+ this.numeroAgencia + 
                " Nome " + this.nome + " Saldo " + this.saldo;
    }
}
