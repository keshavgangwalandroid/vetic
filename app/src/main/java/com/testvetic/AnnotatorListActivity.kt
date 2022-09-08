package com.testvetic

import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

import org.json.JSONException
import java.util.*


class AnnotatorListActivity : AppCompatActivity() {
    var myData = arrayOf(
        ItemsViewModel("50%", "https://assets.myntassets.com/f_webp,dpr_1.5,q_auto,w_210,c_limit,fl_progressive/assets/images/18414820/2022/5/25/6c3869c9-0f26-45a8-800c-a2d78c33f7ce1653469253577DogSweaters1.jpg", "GABBLE & WOOF","100",1,"S","Kids Red The Big Heart Printed Dog Tshirts","Aditya Birla New Age Private Limited"),
        ItemsViewModel("50%", "https://assets.myntassets.com/f_webp,dpr_1.5,q_auto,w_210,c_limit,fl_progressive/assets/images/19350666/2022/8/2/99f1928c-cd98-46c5-82a8-c9ffb2f396631659430984818DogTshirts1.jpg", "thepawpstarco","999",1,"L","Grey Patterned Dog Cotton Sweater","NAGESH KNIT AND WEAVE"),

        )

    var recyclerview: RecyclerView? = null
    var loadProgress: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // getting the recyclerview by its id
        recyclerview = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview?.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)

        getlist()


    }

    fun getlist() {

        try {



            val adapter = AnnotatorAdapter(this@AnnotatorListActivity, myData)
            recyclerview?.adapter = adapter


        } catch (e: JSONException) {
            e.printStackTrace()
        }


    }


}

