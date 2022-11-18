package br.ufc.qxd.arrumaluna.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.ufc.qxd.arrumaluna.R
import br.ufc.qxd.arrumaluna.databinding.FragmentHomeBinding
import br.ufc.qxd.arrumaluna.databinding.FragmentMoradiaBinding
import br.ufc.qxd.arrumaluna.ui.`class`.*


class MoradiaFragment : Fragment() {
    private var _binding: FragmentMoradiaBinding? = null
    private val binding get() = _binding!!

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
        _binding = FragmentMoradiaBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkClicks()
    }
    private fun checkClicks(){
        binding.verTarefas.setOnClickListener {
            findNavController().navigate(R.id.action_moradiaFragment_to_tarefasFragment)
        }
        binding.verCompras.setOnClickListener {
            findNavController().navigate(R.id.action_moradiaFragment_to_comprasFragment2)
        }
        binding.verContas.setOnClickListener {
            findNavController().navigate(R.id.action_moradiaFragment_to_contasFragment)
        }
    }
}