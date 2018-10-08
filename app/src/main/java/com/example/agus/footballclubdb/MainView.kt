package com.example.agus.footballclubdb

/**
 * Created by agus on 27/09/18.
 */

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}