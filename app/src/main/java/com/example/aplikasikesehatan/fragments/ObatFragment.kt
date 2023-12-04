package com.example.aplikasikesehatan.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import com.example.aplikasikesehatan.ChatDokterActivity
import com.example.aplikasikesehatan.R
import com.example.aplikasikesehatan.TokoActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ObatFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ObatFragment : Fragment() {
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_obat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ibkembalil = view.findViewById<ImageButton>(R.id.ibkembali)
        val rldetail = view.findViewById<RelativeLayout>(R.id.relativeLayout4)


        ibkembalil.setOnClickListener {
            val intent = Intent(activity, TokoActivity::class.java)
            startActivity(intent)
        }

        rldetail.setOnClickListener {
            val fragment = DetailObatFragment() // Buat instance dari fragment tujuan
            val transaction = requireActivity().supportFragmentManager.beginTransaction()

            // Ganti R.id.container dengan ID dari container di mana Anda ingin menampilkan fragment selanjutnya
            transaction.replace(R.id.flobat, fragment)

            transaction.addToBackStack(null)

            transaction.commit()
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ObatFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ObatFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}