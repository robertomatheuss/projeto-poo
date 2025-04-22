package br.ifal.edu.domain.services;

import br.ifal.edu.domain.entities.User;

public class UserService {

    public static void validarDadosComuns(User user) {
        if (user == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo.");
        }
        validarCPF(user);
        validarEmail(user);
        validarNome(user);
    }
    private static void validarCPF(User user) {
        if (user.getCpf() == null || user.getCpf().isBlank()) {
            throw new IllegalArgumentException("CPF é obrigatório.");
        }
        if(user.getCpf().length() != 11) {
            throw new IllegalArgumentException("É obrigatorio o CPF ter 11 digitos");
        }

    }

    private static void validarNome(User user) {
        if (user.getName() == null || user.getName().isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }
    }
    private static void validarEmail(User user){
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }

}
