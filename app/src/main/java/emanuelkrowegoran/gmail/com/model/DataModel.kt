package emanuelkrowegoran.gmail.com.model

import com.google.gson.annotations.SerializedName

data class DataModel(
        @SerializedName("id")
        var id: kotlin.Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("username")
        val username: String,
        @SerializedName("email")
        val email: String
)