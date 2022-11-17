package br.ufc.qxd.arrumaluna.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.ufc.qxd.arrumaluna.R
import br.ufc.qxd.arrumaluna.ui.`class`.*


class MoradiaFragment : Fragment() {
    private var tarefas1 : ArrayList<Tarefa> = ArrayList()
    private var contas1 : ArrayList<Conta> = ArrayList()
    private var compras1 : ArrayList<Item> = ArrayList()
    private var m1 = Moradia("131451", "Moradia A", "1",
        Endereco("Acre","Ria Branco", "abc", "adb", "23", "B"),
        tarefas1, contas1, compras1)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_moradia, container, false)
    }

}