package com.example.uicomponents.adapter.contact

import androidx.annotation.LayoutRes
import com.example.uicomponents.R

enum class ContactViewType(
    val typeInt: Int,
    @LayoutRes val layoutId: Int
) {
    Simple(1, R.layout.item_contact),
    WithPhoto(2, R.layout.item_contact_with_photo);

    companion object {

        fun byTypeInt(typeInt: Int): ContactViewType = values().first { it.typeInt == typeInt }
    }
}


