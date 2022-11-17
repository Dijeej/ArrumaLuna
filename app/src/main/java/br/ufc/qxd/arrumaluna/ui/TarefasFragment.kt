package br.ufc.qxd.arrumaluna.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.ufc.qxd.arrumaluna.R
import br.ufc.qxd.arrumaluna.ui.`class`.Tarefa

class TarefasFragment : Fragment() {
    private var tarefas1 : ArrayList<Tarefa> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tarefas, container, false)
    }

}