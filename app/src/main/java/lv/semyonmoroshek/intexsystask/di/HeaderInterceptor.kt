package lv.semyonmoroshek.intexsystask.di

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = chain.run {
        proceed(
            request()
                .newBuilder()
                .addHeader("x-apikey", "53ae2a823bbde6f79e657d38df5fb5de412236acd6e98b140ace9b45e405e3354877d6cd4452bc10b66fbfb2376\n" +
                        "733ea37f0fb7932ae6ea95d3f824334922bc1")
                .build()
        )
    }
}