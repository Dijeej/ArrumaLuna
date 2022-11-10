package br.ufc.qxd.arrumaluna.ui.`class`

import java.math.BigInteger

class Item {
    lateinit var id: BigInteger
    lateinit var nome: String
    lateinit var quantidade: String

    constructor(id: BigInteger, nome: String, quantidade: String) {
        this.id = id
        this.nome = nome
        this.quantidade = quantidade
    }
}