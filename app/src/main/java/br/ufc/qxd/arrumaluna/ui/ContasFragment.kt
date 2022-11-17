package br.ufc.qxd.arrumaluna.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.ufc.qxd.arrumaluna.R
import br.ufc.qxd.arrumaluna.ui.`class`.Conta

class ContasFragment : Fragment() {
    private var contas1 : ArrayList<Conta> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contas, container, false)
    }
}