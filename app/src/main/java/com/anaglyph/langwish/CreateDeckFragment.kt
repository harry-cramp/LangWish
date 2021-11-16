package com.anaglyph.langwish

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class CreateDeckFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            val inflater = requireActivity().layoutInflater

            builder.setView(inflater.inflate(R.layout.fragment_create_deck, null))
                .setPositiveButton(R.string.create_deck_fragment_accept_button_text,
                    DialogInterface.OnClickListener { dialog, id ->
                        // add new deck to deck manager with inputted name
                    })
                .setNegativeButton(R.string.misc_cancel, null)
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}