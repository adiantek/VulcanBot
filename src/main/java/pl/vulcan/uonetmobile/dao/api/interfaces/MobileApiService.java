package pl.vulcan.uonetmobile.dao.api.interfaces;

import com.squareup.okhttp.ResponseBody;
import pl.vulcan.uonetmobile.model.entities.data.ExamEntity;
import pl.vulcan.uonetmobile.model.entities.data.GradeEntity;
import pl.vulcan.uonetmobile.model.entities.data.HomeworkEntity;
import pl.vulcan.uonetmobile.model.entities.data.NoteEntity;
import pl.vulcan.uonetmobile.model.entities.data.PupilEntity;
import pl.vulcan.uonetmobile.model.entities.data.ScheduleEntity;
import pl.vulcan.uonetmobile.model.entities.data.SchoolDataEntity;
import pl.vulcan.uonetmobile.model.entities.mail.impl.ReceivedMailEntity;
import pl.vulcan.uonetmobile.model.entities.mail.impl.RemovedMailEntity;
import pl.vulcan.uonetmobile.model.entities.mail.impl.SentMailEntity;
import pl.vulcan.uonetmobile.model.requests.impl.CertificateRequest;
import pl.vulcan.uonetmobile.model.requests.impl.MobileApiRequest;
import pl.vulcan.uonetmobile.model.responses.ByIdResponse;
import pl.vulcan.uonetmobile.model.responses.DataResponse;
import pl.vulcan.uonetmobile.model.responses.DictionaryResponse;
import pl.vulcan.uonetmobile.model.responses.GradeSummaryResponse;
import pl.vulcan.uonetmobile.model.responses.PresenceResponse;
import pl.vulcan.uonetmobile.model.responses.SimpleResponse;
import pl.vulcan.uonetmobile.model.responses.TeacherResponse;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;

public interface MobileApiService {
	@Headers({ "RequestMobileType: RegisterDevice", "Content-Type: application/json", "User-Agent: MobileUserAgent" })
	@POST("Certyfikat")
	Call<ResponseBody> certificate(@Body CertificateRequest certificateRequest);

	@POST("ZmienStatusWiadomosci")
	Call<SimpleResponse> changeMailStatus(@Body MobileApiRequest mobileApiRequest);

	@POST("Slowniki")
	Call<DictionaryResponse> dictionaries(@Body MobileApiRequest mobileApiRequest);

	@POST("Sprawdziany")
	Call<DataResponse<ExamEntity>> exams(@Body MobileApiRequest mobileApiRequest);

	@POST("OcenyPodsumowanie")
	Call<GradeSummaryResponse> gradeSummary(@Body MobileApiRequest mobileApiRequest);

	@POST("Oceny")
	Call<DataResponse<GradeEntity>> grades(@Body MobileApiRequest mobileApiRequest);

	@POST("ZadaniaDomowe")
	Call<DataResponse<HomeworkEntity>> homework(@Body MobileApiRequest mobileApiRequest);

	@POST("LogAppStart")
	Call<SimpleResponse> log(@Body MobileApiRequest mobileApiRequest);

	@POST("UwagiUcznia")
	Call<DataResponse<NoteEntity>> notes(@Body MobileApiRequest mobileApiRequest);

	@POST("Frekwencje")
	Call<PresenceResponse> presence(@Body MobileApiRequest mobileApiRequest);

	@POST("ListaUczniow")
	Call<DataResponse<PupilEntity>> pupils(@Body MobileApiRequest mobileApiRequest);

	@POST("WiadomosciOdebrane")
	Call<DataResponse<ReceivedMailEntity>> receivedMails(@Body MobileApiRequest mobileApiRequest);

	@POST("UstawPushToken")
	Call<SimpleResponse> registerToken(@Body MobileApiRequest mobileApiRequest);

	@POST("WiadomosciUsuniete")
	Call<DataResponse<RemovedMailEntity>> removeddMails(@Body MobileApiRequest mobileApiRequest);

	@POST("PlanLekcjiZeZmianami")
	Call<DataResponse<ScheduleEntity>> schedule(@Body MobileApiRequest mobileApiRequest);

	@POST("DaneSzkoly")
	Call<ByIdResponse<SchoolDataEntity>> schoolData(@Body MobileApiRequest mobileApiRequest);

	@POST("DodajWiadomosc")
	Call<ResponseBody> sendMail(@Body MobileApiRequest mobileApiRequest);

	@POST("WiadomosciWyslane")
	Call<DataResponse<SentMailEntity>> sentMails(@Body MobileApiRequest mobileApiRequest);

	@POST("Nauczyciele")
	Call<TeacherResponse> teachers(@Body MobileApiRequest mobileApiRequest);
}
