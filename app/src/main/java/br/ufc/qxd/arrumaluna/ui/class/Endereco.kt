package br.ufc.qxd.arrumaluna.ui.`class`

import java.math.BigInteger

class Endereco {
    lateinit var estado: String
    lateinit var cidade: String
    lateinit var bairro: String
    lateinit var rua: String
    lateinit var numero: String
    lateinit var complemento: String

    constructor(
        estado: String,
        cidade: String,
        bairro: String,
        rua: String,
        numero: String,
        complemento: String
    ) {
        this.estado = estado
        this.cidade = cidade
        this.bairro = bairro
        this.rua = rua
        this.numero = numero
        this.complemento = complemento
    }
}