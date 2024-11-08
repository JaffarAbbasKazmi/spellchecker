package com.example.richard

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [detail.newInstance] factory method to
 * create an instance of this fragment.
 */
class detail : Fragment() {
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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = detailArgs.fromBundle(requireArguments())
        val drawable = args.drawable
        val title = args.title

        var imgView = view.findViewById<ImageView>(R.id.imageView)
        var text = view.findViewById<TextView>(R.id.textView)

        text.setText(title)
        imgView.setImageResource(drawable)

    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment detail.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param2: Int , title : String) =
            detail().apply {
                arguments = Bundle().apply {

                    putString(ARG_PARAM1 , title)
                    putString(ARG_PARAM2, param2.toString())

                }
            }
    }
}