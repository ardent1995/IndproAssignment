package se.indpro.indproassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import se.indpro.indproassignment.adapter.ImageListAdapter
import se.indpro.indproassignment.db.ImageDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_image_list.layoutManager = LinearLayoutManager(this)
        rv_image_list.adapter = ImageListAdapter()
    }
}
