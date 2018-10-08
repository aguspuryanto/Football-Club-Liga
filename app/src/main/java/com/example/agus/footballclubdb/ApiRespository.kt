package com.example.agus.footballclubdb

import java.net.URL

/**
 * Created by agus on 27/09/18.
 */

class ApiRepository {

    fun doRequest(url: String): String {
        return URL(url).readText()
    }
}