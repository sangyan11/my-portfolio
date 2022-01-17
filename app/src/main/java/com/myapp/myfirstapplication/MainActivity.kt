package com.myapp.myfirstapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflaror = menuInflater.inflate(R.menu.my_menu,menu)
        return  true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.view_more->{
         val intent =  Intent(this@MainActivity,MoreDetails::class.java)
                startActivity(intent)
            }
            R.id.exit->{
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
    fun gitHub(view : View)
    {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("www.github.com/sangyan11"))
        startActivity(intent)
    }
    fun shareMyProfile(view: View) {
        Toast.makeText(this@MainActivity,"Feature Coming Soon",Toast.LENGTH_LONG).show()
    }
}
