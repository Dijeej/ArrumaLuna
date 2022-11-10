package br.ufc.qxd.arrumaluna.ui.`class`

import java.math.BigInteger

class Tarefa {
    lateinit var id: BigInteger
    lateinit var titulo: String
    lateinit var descricao: String
    lateinit var prazo: String
    lateinit var prioridade: String
    lateinit var tipo: String

    constructor(
        id: BigInteger,
        titulo: String,
        descricao: String,
        prazo: String,
        prioridade: String,
        tipo: String
    ) {
        this.id = id
        this.titulo = titulo
        this.descricao = descricao
        this.prazo = prazo
        this.prioridade = prioridade
        this.tipo = tipo
    }
}