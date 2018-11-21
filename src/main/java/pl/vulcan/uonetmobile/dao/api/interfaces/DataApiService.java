package pl.vulcan.uonetmobile.dao.api.interfaces;

import pl.vulcan.uonetmobile.model.entities.data.GradeEntity;
import pl.vulcan.uonetmobile.model.entities.data.NoteEntity;
import pl.vulcan.uonetmobile.model.entities.data.PresenceEntity;
import pl.vulcan.uonetmobile.model.entities.mail.impl.ReceivedMailEntity;
import pl.vulcan.uonetmobile.model.requests.impl.ByIdRequest;
import pl.vulcan.uonetmobile.model.responses.ByIdResponse;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;

public interface DataApiService {
	@POST("Ocena")
	Call<ByIdResponse<GradeEntity>> gradeById(@Body ByIdRequest byIdRequest);

	@POST("Wiadomosc")
	Call<ByIdResponse<ReceivedMailEntity>> messageById(@Body ByIdRequest byIdRequest);

	@POST("Uwaga")
	Call<ByIdResponse<NoteEntity>> noteById(@Body ByIdRequest byIdRequest);

	@POST("Frekwencja")
	Call<ByIdResponse<PresenceEntity>> presenceById(@Body ByIdRequest byIdRequest);
}
