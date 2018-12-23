package com.example.laura.asynctaskapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.widget.*
import com.beust.klaxon.Klaxon

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread
import java.net.URL


class MainActivity : AppCompatActivity() {

//    lateinit var context: Context
//    lateinit var listView: ListView
//    lateinit var spinner: Spinner

    //lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        context = this

        val spinner: Spinner = findViewById(R.id.spinner)


        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

//        //Adapter for spinner
//        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, myStrings)
//
//        //item selected listener for spinner
//        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//
//            }
//        }
//        listView = findViewById(R.id.listView)
//        val heroes = arrayOf("Gamora", "Thor", "Star Lord")
//
//        listView.adapter = ArrayAdapter<String> (context, android.R.layout.simple_list_item_1, heroes)

//

        val context = this
        val searchView = findViewById<SearchView>(R.id.searchView)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                doAsync {
                    val url: String =
                        "https://swapi.co/api/" + spinner.selectedItem.toString().trim().toLowerCase() + "?search=$query"
                    var buffer = URL(url).readText()
                    var json_buf = Klaxon().parse<People>(buffer)!!

                    var peopleList = json_buf.results!!

                    uiThread {
                        var adapter = PeopleAdapter(context, peopleList)
                        val listView: ListView = findViewById(R.id.listViewPeople)
                        listView?.adapter = adapter
                        adapter.notifyDataSetChanged()

                        if (json_buf.count==0) toast("В текущем разделе данных не найдено")



                    }

                }

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        }
        )


    }

//    fun searchThis(view: View){
//        getQuestions().execute()
//    }
//
//    internal inner class getQuestions : AsyncTask<Void, Void, String>() {
//
//        lateinit var progressDialog: ProgressDialog
//        var hasInternet = false
//
//        override fun onPreExecute() {
//            super.onPreExecute()
//            progressDialog = ProgressDialog(context)
//            progressDialog.setMessage("Данные загружаются из далёкой-далёкой галактики...")
//            progressDialog.setCancelable(false)
//            progressDialog.show()
//        }
//
//        override fun doInBackground(vararg params: Void?): String {
//            if (isNetworkAvailible()) {
//                hasInternet = true
//                val client = OkHttpClient()
//                val url = "https://swapi.co/api/"+spinner.selectedItem.toString()+"/"
//                val request = Request.Builder().url(url).build()
//                val response = client.newCall(request).execute()
//                return response.body()?.string().toString()
//            } else {
//                return ""
//            }
//        }
//
//
//
//        override fun onPostExecute(result: String?) {
//            super.onPostExecute(result)
//            //val obj = JSON.parse(Data.serializer(),result!!)
//            progressDialog.dismiss()
//            //JSON.pa
//            if (hasInternet) {
//
//                Toast.makeText(context, result, Toast.LENGTH_LONG).show()
//
//
//            } else {
//                Toast.makeText(context, result, Toast.LENGTH_LONG).show()
//            }
//        }
//
//    }
//
//
//    private fun isNetworkAvailible(): Boolean {
//        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//        val activeNetworkInfo = connectivityManager.activeNetworkInfo
//        return activeNetworkInfo != null && activeNetworkInfo.isConnected
//    }
}

class PeopleList (val people: List<People>)

class People(val name: String, val birth_year: String,
             val eye_color: String, val gender: String,
             val hair_color: String, val height: String,
             val mass: String, val skin_color: String,
             val homeworld: String, val films: String,
             val species: String, val starships: String,
             val vehicles: String)