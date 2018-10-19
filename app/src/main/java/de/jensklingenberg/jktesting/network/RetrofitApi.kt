package de.jensklingenberg.rxjavaretrofittesting.network

import de.jensklingenberg.jktesting.model.Post
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitApi {

  @GET("/posts/")
  fun getSinglePostQuery(): Single<Response<List<Post>>>


  companion object {
    val BASE_URL = "https://jsonplaceholder.typicode.com"

  } }