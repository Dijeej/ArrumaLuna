package br.ufc.qxd.arrumaluna.ui.`class`

import java.math.BigInteger

class Moradia {
    lateinit var id: String
    lateinit var nome: String
    lateinit var qtdMoradores: String
    lateinit var endereco: Endereco
    lateinit var tarefas: ArrayList<Tarefa>
    lateinit var contas: ArrayList<Conta>
    lateinit var compras: ArrayList<Item>

    constructor(
        id: String,
        nome: String,
        qtdMoradores: String,
        endereco: Endereco,
        tarefas:ArrayList<Tarefa>,
        contas: ArrayList<Conta>,
        compras: ArrayList<Item>
    ) {
        this.id = id
        this.nome = nome
        this.qtdMoradores = qtdMoradores
        this.endereco = endereco
        this.tarefas = tarefas
        this.contas = contas
        this.compras = compras
    }
}