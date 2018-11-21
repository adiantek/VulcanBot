package pl.vulcan.uonetmobile.dao.api;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Response;

import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.dao.api.interfaces.DataApiService;
import pl.vulcan.uonetmobile.dao.api.interfaces.MobileApiService;
import pl.vulcan.uonetmobile.dao.api.interfaces.PushApiService;
import pl.vulcan.uonetmobile.model.entities.data.PupilEntity;
import pl.vulcan.uonetmobile.model.entities.inner.AccountEntity;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit.Builder;

public class Api {
	public Api() {
	}

	private <T> T a(Class<T> cls, AccountEntity accountEntity, String str) {
		OkHttpClient protocols = new OkHttpClient().setProtocols(Collections.singletonList(Protocol.HTTP_1_1));
		protocols.setConnectTimeout(25, TimeUnit.SECONDS);
		protocols.setReadTimeout(25, TimeUnit.SECONDS);
		protocols.interceptors().add(new pl.vulcan.uonetmobile.dao.api.Encryption(accountEntity));
		return new Builder().baseUrl(str).client(protocols)
				.addConverterFactory(GsonConverterFactory.create(new GsonBuilder().serializeNulls().create())).build()
				.create(cls);
	}

	public MobileApiService a(String str) {
		OkHttpClient protocols = new OkHttpClient().setProtocols(Collections.singletonList(Protocol.HTTP_1_1));
		protocols.setConnectTimeout(25, TimeUnit.SECONDS);
		protocols.setReadTimeout(25, TimeUnit.SECONDS);
		protocols.interceptors().add(new Interceptor() {

			public Response intercept(Chain chain) throws IOException {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append("Sending Request to: ");
				stringBuilder.append(chain.request().url());
				return chain.proceed(chain.request());
			}
		});
		Builder builder = new Builder();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(str);
		stringBuilder.append("/");
		stringBuilder.append("Uczen.v3.UczenStart");
		stringBuilder.append("/");
		return (MobileApiService) builder.baseUrl(stringBuilder.toString()).client(protocols)
				.addConverterFactory(GsonConverterFactory.create(new GsonBuilder().serializeNulls().create())).build()
				.create(MobileApiService.class);
	}

	public MobileApiService a(AppState appState) {
		PupilEntity pupilEntity = appState.a;
		AccountEntity m = pupilEntity.m();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(pupilEntity.m().h());
		stringBuilder.append(pupilEntity.h());
		stringBuilder.append("/");
		stringBuilder.append("mobile-api");
		stringBuilder.append("/");
		stringBuilder.append("Uczen.v3.Uczen");
		stringBuilder.append("/");
		return (MobileApiService) a(MobileApiService.class, m, stringBuilder.toString());
	}

	public MobileApiService a(AccountEntity accountEntity) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(accountEntity.h());
		stringBuilder.append("mobile-api");
		stringBuilder.append("/");
		stringBuilder.append("Uczen.v3.UczenStart");
		stringBuilder.append("/");
		return (MobileApiService) a(MobileApiService.class, accountEntity, stringBuilder.toString());
	}

	public DataApiService b(AppState appState) {
		PupilEntity pupilEntity = appState.a;
		AccountEntity m = pupilEntity.m();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(pupilEntity.m().h());
		stringBuilder.append(pupilEntity.h());
		stringBuilder.append("/");
		stringBuilder.append("mobile-api");
		stringBuilder.append("/");
		stringBuilder.append("Data.v1.Data");
		stringBuilder.append("/");
		return (DataApiService) a(DataApiService.class, m, stringBuilder.toString());
	}

	public PushApiService c(AppState appState) {
		PupilEntity pupilEntity = appState.a;
		AccountEntity m = pupilEntity.m();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(pupilEntity.m().h());
		stringBuilder.append(pupilEntity.h());
		stringBuilder.append("/");
		stringBuilder.append("mobile-api");
		stringBuilder.append("/");
		stringBuilder.append("Push.v1.Push");
		stringBuilder.append("/");
		return (PushApiService) a(PushApiService.class, m, stringBuilder.toString());
	}
}
