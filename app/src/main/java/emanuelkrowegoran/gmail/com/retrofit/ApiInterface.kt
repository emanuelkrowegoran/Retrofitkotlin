package emanuelkrowegoran.gmail.com.retrofit

import emanuelkrowegoran.gmail.com.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("users")
    fun getUsers(): Call<List<DataModel>>
}