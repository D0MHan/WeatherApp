package kr.ac.daelim.weatherapp

import org.json.JSONObject
import retrofit2.Response

class WeatherRepository {
    private val retrofitRemoteDataSource: RemoteDataSource = RemoteDataSourceImpl()
    fun getWehatherInfo(
        jsonObject: JSONObject,
        onResponse: (Response<WeatherModel>) -> Unit,
        onFailure: (Throwable) -> Unit,
    ) {
        retrofitRemoteDataSource.getWeatherInfo(jsonObject, onResponse, onFailure)
    }

    fun getForcastInfo(
        jsonObject: JSONObject,
        onResponse: (Response<ForecastModel>) -> Unit,
        onFailure: (Throwable) -> Unit,
    ) {
        retrofitRemoteDataSource.getForecastInfo(jsonObject, onResponse, onFailure)
    }
}