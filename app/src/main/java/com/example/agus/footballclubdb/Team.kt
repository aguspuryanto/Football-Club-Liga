package com.example.agus.footballclubdb

import com.google.gson.annotations.SerializedName

/**
 * Created by agus on 27/09/18.
 */

data class Team(
        @SerializedName("idTeam")
        var teamId: String? = null,

        @SerializedName("strTeam")
        var teamName: String? = null,

        @SerializedName("strTeamBadge")
        var teamBadge: String? = null
)