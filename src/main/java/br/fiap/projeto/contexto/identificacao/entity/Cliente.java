package br.fiap.projeto.contexto.identificacao.entity;

import br.fiap.projeto.contexto.identificacao.entity.vo.Cpf;
import br.fiap.projeto.contexto.identificacao.entity.vo.Email;
import br.fiap.projeto.contexto.identificacao.usecase.exception.EntradaInvalidaException;

public class Cliente {

    public final static String CPF_AUSENTE = "Informe o cpf!";
    public final static String EMAIL_AUSENTE = "Informe o e-mail!";
    public final static String NOME_AUSENTE = "Informe o nome!";
    public final static String ENTIDADE_NAO_ENCONTRADA = "Cliente não encontrado!";
    public final static String CPF_DUPLICADO = "Esse cpf já está cadastrado!";
    public final static String EMAIL_DUPLICADO = "Esse e-mail já está cadastrado!";
    public final static String CODIGO_AUSENTE = "Informe o código do cliente!";
    private final String nome;
    private final Cpf cpf;
    private final Email email;
    private String codigo;

    public Cliente(String codigo, String nome, String cpf, String email) throws EntradaInvalidaException {
        this.codigo = codigo;
        this.nome = nome;
        validaCodigo();
        validaCpf(cpf);
        validaEmail(email);
        validaNome();
        this.cpf = Cpf.fromString(cpf);
        this.email = Email.fromString(email);
    }

    public Cliente(String nome, String cpf, String email) throws EntradaInvalidaException {
        this.nome = nome;
        validaCpf(cpf);
        validaEmail(email);
        validaNome();
        this.cpf = Cpf.fromString(cpf);
        this.email = Email.fromString(email);
    }

    private void validaCodigo() throws EntradaInvalidaException {
        if (codigo == null) {
            throw new EntradaInvalidaException(CODIGO_AUSENTE);
        }
    }

    private void validaCpf(String cpf) throws EntradaInvalidaException {
        if (cpf == null) {
            throw new EntradaInvalidaException(CPF_AUSENTE);
        }
        Cpf.fromString(cpf).validar();
    }

    private void validaEmail(String email) throws EntradaInvalidaException {
        if (email == null) {
            throw new EntradaInvalidaException(EMAIL_AUSENTE);
        }
        Email.fromString(email).validar();
    }

    private void validaNome() throws EntradaInvalidaException {
        if (nome == null || nome.length() == 0) {
            throw new EntradaInvalidaException(NOME_AUSENTE);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }
}