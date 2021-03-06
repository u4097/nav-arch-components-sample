package com.jcmsalves.navarchcomponentssample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentB : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonB.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("primitive_argument", "my argument")
            bundle.putParcelable("custom_object", SomeDataClass("field", 99))
            view.findNavController().navigate(R.id.fragmentBtoC, bundle)
        }
    }
}
