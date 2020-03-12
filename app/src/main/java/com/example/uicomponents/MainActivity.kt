package com.example.uicomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uicomponents.adapter.contact.ContactListAdapter
import com.example.uicomponents.data.DataProvider
import kotlinx.android.synthetic.main.content_scrolling.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
