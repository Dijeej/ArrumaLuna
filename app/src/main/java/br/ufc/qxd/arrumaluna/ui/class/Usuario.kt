package br.ufc.qxd.arrumaluna.ui.`class`

import java.math.BigInteger

class Usuario {
    lateinit var id: BigInteger
    lateinit var nome: String
    lateinit var sobrenome: String
    lateinit var email: String
    lateinit var genero: String
    lateinit var dataNasc: String
    lateinit var senha: String

    constructor(
        id: BigInteger,
        nome: String,
        sobrenome: String,
        email: String,
        genero: String,
        dataNasc: String,
        senha: String
    ) {
        this.id = id
        this.nome = nome
        this.sobrenome = sobrenome
        this.email = email
        this.genero = genero
        this.dataNasc = dataNasc
        this.senha = senha
    }
}