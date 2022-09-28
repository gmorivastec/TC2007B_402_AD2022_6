package mx.itesm.navigationpm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class ArgsFragment : Fragment() {

    val args: ArgsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_args, container, false)

        view.findViewById<TextView>(R.id.args1).text = args.nombre
        view.findViewById<TextView>(R.id.args2).text = args.altura.toString()

        return view
    }
}