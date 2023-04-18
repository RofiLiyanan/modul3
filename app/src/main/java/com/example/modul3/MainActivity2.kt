package com.example.modul3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    private var recyclerView : RecyclerView? =null
    private var mainAdapter : MainAdapter? = null
    private var clubBola = mutableListOf<ClubBola>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnKembali: Button = findViewById(R.id.kembali)
        btnKembali.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)
        }

        clubBola = ArrayList()

        recyclerView = findViewById<View>(R.id.rvClubBola) as RecyclerView
        mainAdapter = MainAdapter(this, clubBola as ArrayList<ClubBola>)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this,1)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = mainAdapter

        prepareclubData()

    }

    private fun prepareclubData() {
        var club = ClubBola("Persib","Indonesia","Sijalak Harupat",R.drawable.persib)
        clubBola.add(club)
        club = ClubBola("Psm","Indonesia","Mattoangin",R.drawable.psm)
        clubBola.add(club)
        club = ClubBola("Persebaya","Indonesia","GBT",R.drawable.persebaya)
        clubBola.add(club)
        club = ClubBola("Bali United","Indonesia","I wayan Dipta",R.drawable.bali)
        clubBola.add(club)
        club = ClubBola("Barcelona","Spanyol","Camp Nou",R.drawable.barca)
        clubBola.add(club)
        club = ClubBola("Real Madrid","Spanyol","Santiago Ber",R.drawable.real)
        clubBola.add(club)
        club = ClubBola("Man United","Inggris","Old Trafford",R.drawable.mu)
        clubBola.add(club)
        club = ClubBola("Liverpool","Inggris","Anfield",R.drawable.ipul)
        clubBola.add(club)
        club = ClubBola("Bayern Munchen","Jerman","Allianz Arena",R.drawable.bayern)
        clubBola.add(club)
        club = ClubBola("Dortmund","Jerman","Signal Iduna Park",R.drawable.dortmund)
        clubBola.add(club)
        club = ClubBola("PSG","Perancis","Park Des Prince",R.drawable.psg)
        clubBola.add(club)
        club = ClubBola("Marseille","Perancis","Velodrome",R.drawable.marseille)
        clubBola.add(club)
        club = ClubBola("Arsenal","Inggris","Emirates",R.drawable.arsenal)
        clubBola.add(club)
        club = ClubBola("Manchester city","Inggris","Etihad Stadium",R.drawable.city)
        clubBola.add(club)
    }
}