package kr.ac.kumoh.s20180287.prof.w0701implicitintend

import android.content.Intent
import android.net.Uri
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180287.prof.w0701implicitintend.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnHomepage.setOnClickListener{
            val uri = Uri.parse("https://www.naver.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)

            startActivity(intent)

        }


    }
}