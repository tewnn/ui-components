package com.example.uicomponents.domain.model

sealed class Contact

data class SimpleContact(
    val fullName: String
) : Contact()

data class ContactWithPhoto(
    val photoUrl: String,
    val fullName: String
) : Contact()
