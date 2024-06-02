package br.com.movie_list

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.tela_home)


            val btnsair: Button = findViewById(R.id.btn_sair)

            btnsair.setOnClickListener{
                val intent = Intent(this,TelaLogin::class.java)
                startActivity(intent)
            }

            val btnpopular: Button = findViewById(R.id.btn_popular)

            btnpopular.setOnClickListener{
                val intent = Intent(this,TelaEmAlta::class.java)
                startActivity(intent)
            }

            val btnaclamados: Button = findViewById(R.id.btn_aclamados)

            btnaclamados.setOnClickListener {
                val intent = Intent(this, TelaMaisBemAvaliados::class.java)
                startActivity(intent)
            }

            val btnporvir: Button = findViewById(R.id.btn_porvir)

            btnporvir.setOnClickListener {
                val intent = Intent(this, TelaPorVir::class.java)
                startActivity(intent)

            }

    }
}
