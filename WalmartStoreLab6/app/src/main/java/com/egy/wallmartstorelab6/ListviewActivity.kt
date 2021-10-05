package com.egy.wallmartstorelab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView
import android.widget.Toast;
import kotlinx.android.synthetic.main.activity_listview.*

class ListviewActivity : AppCompatActivity() {

    private lateinit var  strings : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        strings = arrayOf("Asia","Australia","America","Belgium","Brazil","Canada","California","Dubai","France","Paris")
        // Get the XML configured vales into the Activity and stored into an String Array
        //strings = getResources().getStringArray(R.array.countries);
        /* Pass three parameters to the ArrayAdapter
        1. The current context,
        2. The resource ID for a built-in layout file containing a TextView to use when instantiating views,
           which are available in android.R.layout
        3. The objects to represent in the values
        */
        val adapter = ArrayAdapter<String>(this, android.R.layout.activity_list_item, strings)

        listview.setAdapter(adapter)
//        listview.

        listview.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                Toast.makeText(this,"Item selected is " + parent.getItemAtPosition(position),Toast.LENGTH_LONG).show()

            }

    }
}

/*
                  var idval = parent.getItemIdAtPosition(position)
                  getItemAtPosition takes the int position and return object
                  Toast.makeText(this, "Value at "+id.toString() + " selected is : "+parent.getItemAtPosition(position) + "is in : " + position,Toast.LENGTH_LONG).show();
                 var idval = parent.getItemIdAtPosition(position)
                Toast.makeText(this,"Item selected is : "+parent.getItemIdAtPosition(id.toInt()),Toast.LENGTH_LONG).show();*/