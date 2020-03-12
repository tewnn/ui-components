package com.example.uicomponents.adapter.contact

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uicomponents.domain.model.Contact
import com.example.uicomponents.domain.model.ContactWithPhoto
import com.example.uicomponents.domain.model.SimpleContact

class ContactListAdapter : RecyclerView.Adapter<ContactViewHolder>() {

    var contacts: List<Contact> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = contacts.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val type = ContactViewType.byTypeInt(viewType)
        val view = LayoutInflater.from(parent.context).inflate(type.layoutId, parent, false)
        return when (type) {
            ContactViewType.Simple -> SimpleContactViewHolder(view)
            ContactViewType.WithPhoto -> WithPhotoContactViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        when (holder) {
            is SimpleContactViewHolder -> holder.bind(contacts[position] as SimpleContact)
            is WithPhotoContactViewHolder -> holder.bind(contacts[position] as ContactWithPhoto)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (contacts[position]) {
            is SimpleContact -> ContactViewType.Simple.typeInt
            is ContactWithPhoto -> ContactViewType.WithPhoto.typeInt
        }
    }
}
