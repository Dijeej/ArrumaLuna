package br.ufc.qxd.arrumaluna.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import br.ufc.qxd.arrumaluna.R
import br.ufc.qxd.arrumaluna.databinding.FragmentHomeBinding
import br.ufc.qxd.arrumaluna.databinding.FragmentRegisterBinding
import br.ufc.qxd.arrumaluna.ui.`class`.*
import java.math.BigInteger

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val listaCasas : ArrayList<Moradia> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arrayAdapter: ArrayAdapter<*>

        var tarefas1 : ArrayList<Tarefa> = ArrayList()
        var tarefas2 : ArrayList<Tarefa> = ArrayList()
        var tarefas3 : ArrayList<Tarefa> = ArrayList()
        var contas1 : ArrayList<Conta> = ArrayList()
        var contas2 : ArrayList<Conta> = ArrayList()
        var contas3 : ArrayList<Conta> = ArrayList()
        var compras1 : ArrayList<Item> = ArrayList()
        var compras2 : ArrayList<Item> = ArrayList()
        var compras3 : ArrayList<Item> = ArrayList()
        var m1 = Moradia("131451", "Moradia A", "1",
            Endereco("Acre","Ria Branco", "abc", "adb", "23", "B"),
            tarefas1, contas1, compras1)
        var m2 = Moradia("131450", "Moradia B", "3",
            Endereco("Bahia","Salvador", "lnm", "hjk", "1871", "D"),
            tarefas2, contas2, compras2)
        var m3 = Moradia("131452", "Moradia C", "2",
            Endereco("Ceara","Fortaleza", "xyz", "zwv", "223", ""),
            tarefas3, contas3, compras3)

        listaCasas.add(m1)
        listaCasas.add(m2)
        listaCasas.add(m3)

        arrayAdapter = ArrayAdapter(view.context, android.R.layout.simple_list_item_1, listaCasas)

        //binding.recyclerView.adapter = arrayAdapter

        checkClicks()

    }

    private fun checkClicks(){
        binding.btnCriarMoradia.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_moradiaFragment)
        }
    }

}