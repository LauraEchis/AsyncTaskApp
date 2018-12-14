package com.example.laura.asynctaskapp

import android.app.ProgressDialog
import android.content.Context
import android.net.ConnectivityManager
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.getSystemService

import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : AppCompatActivity() {

    lateinit var context: Context
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
//        listView = findViewById(R.id.listView)
//        val heroes = arrayOf("Gamora", "Thor", "Star Lord")
//
//        listView.adapter = ArrayAdapter<String> (context, android.R.layout.simple_list_item_1, heroes)
//

        getQuestions().execute()

    }

    internal inner class getQuestions : AsyncTask<Void, Void, String>() {

        lateinit var progressDialog: ProgressDialog
        var hasInternet = false

        override fun onPreExecute() {
            super.onPreExecute()
            progressDialog = ProgressDialog(context)
            progressDialog.setMessage("Данные загружаются из далёкой-далёкой галактики...")
            progressDialog.setCancelable(false)
            progressDialog.show()
        }

        override fun doInBackground(vararg params: Void?): String {
            if (isNetworkAvailible()) {
                hasInternet = true
                val client = OkHttpClient()
                val url = "https://swapi.co/api/"
                val request = Request.Builder().url(url).build()
                val response = client.newCall(request).execute()
                return response.body()?.string().toString()
            } else {
                return ""
            }
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            progressDialog.dismiss()

            if (hasInternet) {



            } else {
                Toast.makeText(context, "NOOOOOOO", Toast.LENGTH_LONG)
            }
        }

    }


    private fun isNetworkAvailible(): Boolean {
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }
}
