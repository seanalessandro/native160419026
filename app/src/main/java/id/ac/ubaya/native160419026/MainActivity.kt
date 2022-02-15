package id.ac.ubaya.native160419026

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //nambahin variabel login
    var login:Boolean = true
    var password:String = ""


    //tambah fitur lupa password
    var lupaPassword:Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}