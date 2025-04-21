package br.ifal.edu.domain.entities;

public abstract class User  {
    private int cpf;
    private String name;
    private String email;

    protected User(int cpf,String name,String email){
        this.cpf = cpf;
        this.email = email;
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
