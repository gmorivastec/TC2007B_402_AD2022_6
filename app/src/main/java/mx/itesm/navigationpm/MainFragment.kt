package mx.itesm.navigationpm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        // para poder navegar utilizando el componente de navegación
        // necesitamos acceso al navigation controller

        // si estás en activity
        // Activity.findNavController(id: Int)

        // si tienes referencia a una view
        // View.findNavController()

        // si estás en un fragment
        // Fragment.findNavController()

        view.findViewById<Button>(R.id.btnSimple).setOnClickListener {

            findNavController().navigate(R.id.action_mainFragment_to_simpleFragment);
        }

        view.findViewById<Button>(R.id.btnArgs).setOnClickListener {

            val action = MainFragmentDirections
                .actionMainFragmentToArgsFragment(
                    view.findViewById<EditText>(R.id.nombre).text.toString(),
                    view.findViewById<EditText>(R.id.altura).text.toString().toFloat()
                )

            findNavController().navigate(action)
        }
        return view
    }


}