package jett.altlog.kimtintrctuynapp.retrofit

import jett.altlog.kimtintrctuynapp.retrofit.RequestModel
import jett.altlog.kimtintrctuynapp.retrofit.ResponseModel
import retrofit2.http.Body
import retrofit2.http.POST

interface JumpService {

    @POST("app_conf")
    suspend fun getJumpCode(@Body param: RequestModel): ResponseModel

}