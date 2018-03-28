
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.serjltt.moshi.adapters.FallbackOnNull
import com.squareup.moshi.Moshi
import de.jensklingenberg.rxjavaretrofittesting.network.RetrofitApi
import okhttp3.OkHttpClient
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.MockitoAnnotations
import org.mockito.runners.MockitoJUnitRunner
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@RunWith(MockitoJUnitRunner::class)
class RetrofitTest {
  internal lateinit var api: RetrofitApi
  private var retrofit: Retrofit? = null
  private val okHttpClient: OkHttpClient? = null
  private var moshi: Moshi? = null

  private fun setupRetrofit() {

    retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(RetrofitApi.BASE_URL)
        .build()
  }

  private fun setupMoshi() {
    moshi = Moshi.Builder().add(FallbackOnNull.ADAPTER_FACTORY).build()
  }

  @Before
  @Throws(Exception::class)
  fun setUp() {
    MockitoAnnotations.initMocks(this)
    setupMoshi()
    setupRetrofit()

    api = retrofit!!.create(RetrofitApi::class.java)
  }

  @Test
  fun getSinglePostQuery() {
    val observer = api.getSinglePostQuery().test()
    observer.assertNoErrors()
    val postList = observer.values()[0].body()

    Assert.assertNotEquals(postList?.size, 0)
    Assert.assertEquals(1,postList?.get(0)?.id)

  }
}

