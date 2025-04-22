package br.ifal.edu.domain.entities;

public abstract class User  {
    private int id;
    private String name;
    private String email;
    private String cpf;

    public User(String name, String email, String cpf) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n  Nome: ").append(getName());
        sb.append("\n  CPF: ").append(getCpf());
        sb.append("\n  Email: ").append(getEmail());
        return sb.toString();
    }
}
