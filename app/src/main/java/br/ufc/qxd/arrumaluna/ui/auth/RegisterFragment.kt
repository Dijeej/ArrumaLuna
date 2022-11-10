package br.ufc.qxd.arrumaluna.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import br.ufc.qxd.arrumaluna.R
import br.ufc.qxd.arrumaluna.databinding.FragmentRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkClicks()
    }

    private fun checkClicks(){
        binding.btnRegisterCreate.setOnClickListener { verifyData() }
    }

    private fun verifyData() {
        val nome = binding.editRegisterName.text.toString().trim()
        val sobrenome = binding.editRegisterSurname.text.toString().trim()
        val email = binding.editRegisterEmail.text.toString().trim()
        val dataNasc = binding.editRegisterBirthDate.text.toString().trim()
        val senha = binding.editRegisterPassword.text.toString().trim()
        val comSenha = binding.editRegisterConfirmPassword.text.toString().trim()
        var genero = "";
        if (binding.registerRadioMasc.isChecked) {
             genero = binding.registerRadioMasc.text.toString().trim()
        } else if (binding.registerRadioFem.isChecked) {
             genero = binding.registerRadioFem.text.toString().trim()
        } else if (binding.registerRadioOther.isChecked) {
             genero = binding.registerRadioOther.text.toString().trim()
        }else{
             genero = ""
        }

        if(nome.isNotEmpty()){
            if(sobrenome.isNotEmpty()){
                if(email.isNotEmpty()){
                    if(dataNasc.isNotEmpty()){
                        if(!(genero.equals(""))){
                            if(senha.isNotEmpty()){
                                if (comSenha == senha){
                                    binding.progressBar.isVisible = true
                                    findNavController().navigate(R.id.action_registerFragment_to_homeFragment)
                                }else{
                                    Toast.makeText(requireContext(),"Confirmação diferente da senha.", Toast.LENGTH_SHORT)
                                }
                            }else{
                                Toast.makeText(requireContext(),"Informe sua senha.", Toast.LENGTH_SHORT)
                            }
                        }else{
                            Toast.makeText(requireContext(),"Informe seu gênero.", Toast.LENGTH_SHORT)
                        }
                    }else{
                        Toast.makeText(requireContext(),"Informe sua data de nascimento.", Toast.LENGTH_SHORT)
                    }
                }else{
                    Toast.makeText(requireContext(),"Informe seu e-mail.", Toast.LENGTH_SHORT)
                }
            }else{
                Toast.makeText(requireContext(),"Informe seu sobrenome.", Toast.LENGTH_SHORT)
            }
        }else{
            Toast.makeText(requireContext(),"Informe seu nome.", Toast.LENGTH_SHORT)
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}