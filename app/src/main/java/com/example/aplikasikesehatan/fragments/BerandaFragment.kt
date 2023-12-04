package com.example.aplikasikesehatan.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.aplikasikesehatan.ArtikelActivity
import com.example.aplikasikesehatan.ChatDokterActivity
import com.example.aplikasikesehatan.R
import com.example.aplikasikesehatan.RumahSakitActivity
import com.example.aplikasikesehatan.TokoActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BerandaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BerandaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rlchatdokter = view.findViewById<RelativeLayout>(R.id.rlchatdokter)
        val rltoko = view.findViewById<RelativeLayout>(R.id.rltoko)
        val rlrumahsakit = view.findViewById<RelativeLayout>(R.id.rlrumahsakit)
        val rlartikel = view.findViewById<RelativeLayout>(R.id.rlartikel)

        rlchatdokter.setOnClickListener {
            val intent = Intent(activity, ChatDokterActivity::class.java)
            startActivity(intent)
        }

        rltoko.setOnClickListener {
            val intent = Intent(activity, TokoActivity::class.java)
            startActivity(intent)
        }

        rlrumahsakit.setOnClickListener {
            val intent = Intent(activity, RumahSakitActivity::class.java)
            startActivity(intent)
        }

        rlartikel.setOnClickListener {
            val intent = Intent(activity, ArtikelActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_beranda, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BerandaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BerandaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}