package pl.vulcan.uonetmobile.dao.api.interfaces;

import pl.vulcan.uonetmobile.model.requests.impl.ByIdRequest;
import pl.vulcan.uonetmobile.model.requests.impl.MobileApiRequest;
import pl.vulcan.uonetmobile.model.responses.PushResponse;
import pl.vulcan.uonetmobile.model.responses.SimpleResponse;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;

public interface PushApiService {
	@POST("AddPushToken ")
	Call<SimpleResponse> addPushToken(@Body MobileApiRequest mobileApiRequest);

	@POST("GetCertificatePushConfig")
	Call<PushResponse> getCertificatePushConfig(@Body ByIdRequest byIdRequest);

	@POST("SetCertificatePushToken ")
	Call<SimpleResponse> setCertificatePushToken(@Body MobileApiRequest mobileApiRequest);
}
