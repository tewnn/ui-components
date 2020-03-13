package com.example.uicomponents.adapter.contact

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.uicomponents.domain.model.ContactWithPhoto
import com.example.uicomponents.domain.model.SimpleContact
import kotlinx.android.synthetic.main.item_contact.view.textName
import kotlinx.android.synthetic.main.item_contact_with_photo.view.*

sealed class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    open fun recycle() = Unit
}

class SimpleContactViewHolder(itemView: View) : ContactViewHolder(itemView) {

    fun bind(contact: SimpleContact) {
        itemView.textName.text = contact.fullName
    }
}

class WithPhotoContactViewHolder(itemView: View) : ContactViewHolder(itemView) {

    fun bind(contact: ContactWithPhoto) {
        itemView.textName.text = contact.fullName
        Glide.with(itemView)
            .load(contact.photoUrl)
            .centerCrop()
            .into(itemView.imagePhoto)
    }

    override fun recycle() {
        Glide.with(itemView)
            .clear(itemView.imagePhoto)
    }
}
