package org.maktab.scheduledlogs.remote;

import org.maktab.scheduledlogs.model.Logs;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RandomNameService {

    @GET(".")
    Call<List<Logs>> name();
}
