import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {
    @POST("/test")
    Call<ResponseBody> callYourApi(@Body String a);
}
