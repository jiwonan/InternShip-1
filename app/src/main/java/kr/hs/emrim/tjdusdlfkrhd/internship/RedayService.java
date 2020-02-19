package kr.hs.emrim.tjdusdlfkrhd.internship;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RedayService {

    String URL = "http://192.168.9.162:1234";

    @POST("users") // requestparam == Query
    Call<User> createUser(@Query("username") String username, @Query("usernickname") String usernickname, @Query("password") String password, @Query("email") String email);

    @POST("users/login")
    Call<LoginResponse> loginUser(@Query("email") String email, @Query("password") String password);

    @Multipart
    @POST("{username}/articles")
    Call<String> createArticle(@Path("username") String username, @Query("title") String title, @Query("contents") String contents, @Part MultipartBody.Part file);

    /*
    // 유저 이름 가져오기.
    @GET("{email}/getusername")
    Call<String> getUsername(@Path("email") String email);
    */

    @GET("/users/{email}")
    Call<User> getUser(@Path("email") String email);

    @GET("/articles")
    Iterable<Article> readArticlesDataAll();
}
