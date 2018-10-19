package de.jensklingenberg.jktesting.network

import de.jensklingenberg.jktesting.model.Post
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface TestApi {

    @GET("posts")
    fun getPostList(): Single<Response<List<Post>>>


}