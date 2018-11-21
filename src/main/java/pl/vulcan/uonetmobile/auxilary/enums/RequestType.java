package pl.vulcan.uonetmobile.auxilary.enums;

import pl.vulcan.uonetmobile.model.entities.data.ExamEntity;
import pl.vulcan.uonetmobile.model.entities.data.GradeEntity;
import pl.vulcan.uonetmobile.model.entities.data.HomeworkEntity;
import pl.vulcan.uonetmobile.model.entities.data.NoteEntity;
import pl.vulcan.uonetmobile.model.entities.data.PresenceEntity;
import pl.vulcan.uonetmobile.model.entities.data.PupilEntity;
import pl.vulcan.uonetmobile.model.entities.data.ScheduleEntity;
import pl.vulcan.uonetmobile.model.entities.data.SchoolDataEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.EmployeeEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.GradeCategoryEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.NoteCategoryEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.PresenceCategoryEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.PresenceTypeEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TeacherEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TimeEntity;
import pl.vulcan.uonetmobile.model.entities.grades.impl.AverageGradeEntity;
import pl.vulcan.uonetmobile.model.entities.grades.impl.EndGradeEntity;
import pl.vulcan.uonetmobile.model.entities.grades.impl.ProposedGradeEntity;
import pl.vulcan.uonetmobile.model.entities.mail.impl.ReceivedMailEntity;
import pl.vulcan.uonetmobile.model.entities.mail.impl.RemovedMailEntity;
import pl.vulcan.uonetmobile.model.entities.mail.impl.SentMailEntity;
import pl.vulcan.uonetmobile.model.entities.teachers.TeacherSchoolEntity;
import pl.vulcan.uonetmobile.model.entities.teachers.TeacherSubjectEntity;

public enum RequestType {
    DICTIONARIES("Uczen/Slowniki", 1440, new String[]{"Data/Nauczyciele", "Data/Pracownicy", "Data/Przedmioty", "Data/PoryLekcji", "Data/KategorieOcen", "Data/KategorieUwag", "Data/KategorieFrekwencji", "Data/TypyFrekwencji"}, new Class[]{TeacherEntity[].class, EmployeeEntity[].class, SubjectEntity[].class, TimeEntity[].class, GradeCategoryEntity[].class, NoteCategoryEntity[].class, PresenceCategoryEntity[].class, PresenceTypeEntity[].class}, false),
    HOMEWORK("Uczen/ZadaniaDomowe", 45, new String[]{"Data"}, new Class[]{HomeworkEntity[].class}, false),
    NOTES("Uczen/UwagiUcznia", 45, new String[]{"Data"}, new Class[]{NoteEntity[].class}, false),
    SCHEDULE("Uczen/PlanLekcjiZeZmianami", 45, new String[]{"Data"}, new Class[]{ScheduleEntity[].class}, false),
    TEACHERS("Uczen/Nauczyciele", 45, new String[]{"Data/NauczycieleSzkola", "Data/NauczycielePrzedmioty"}, new Class[]{TeacherSchoolEntity[].class, TeacherSubjectEntity[].class}, true),
    SCHOOL_DATA("Uczen/DaneSzkoly", 1440, new String[]{"Data/DaneSzkoly"}, new Class[]{SchoolDataEntity.class}, true),
    EXAMS("Uczen/Sprawdziany", 45, new String[]{"Data"}, new Class[]{ExamEntity[].class}, false),
    PUPILS("UczenStart/ListaUczniow", 1440, new String[]{"Data"}, new Class[]{PupilEntity[].class}, false),
    PRESENCE("Uczen/Frekwencje", 45, new String[]{"Data/Frekwencje"}, new Class[]{PresenceEntity[].class}, false),
    GRADES("Uczen/Oceny", 15, new String[]{"Data"}, new Class[]{GradeEntity[].class}, false),
    GRADES_SUMMARY("Uczen/OcenyPodsumowanie", 15, new String[]{"Data/OcenyPrzewidywane", "Data/OcenyKlasyfikacyjne", "Data/SrednieOcen"}, new Class[]{ProposedGradeEntity[].class, EndGradeEntity[].class, AverageGradeEntity[].class}, true),
    GET_SENT_MAILS("Uczen/WiadomosciWyslane", 5, new String[]{"Data"}, new Class[]{SentMailEntity[].class}, false),
    GET_RECEIVED_MAILS("Uczen/WiadomosciOdebrane", 5, new String[]{"Data"}, new Class[]{ReceivedMailEntity[].class}, false),
    GET_REMOVED_MAILS("Uczen/WiadomosciUsuniete", 5, new String[]{"Data"}, new Class[]{RemovedMailEntity[].class}, false);
//    MAIL_STATUS_CHANGE_REMOVE("Uczen/ZmienStatusWiadomosci", 999999999, new String[]{""}, new Class[]{SimpleResponse.class}, false),
//    MAIL_STATUS_CHANGE("Uczen/ZmienStatusWiadomosci", 999999999, new String[]{""}, new Class[]{SimpleResponse.class}, false),
//    MAIL_SEND("Uczen/DodajWiadomosc", 999999999, new String[]{""}, new Class[]{m.class}, false),
//    ACCOUNT("UczenStart/Certyfikat", 999999999, new String[]{""}, new Class[]{SimpleResponse.class}, false),
//    LOG("Uczen/LogAppStart", 999999999, new String[]{""}, new Class[]{SimpleResponse.class}, false),
//    PUSH_REGISTER("Uczen/UstawPushToken", 999999999, new String[]{""}, new Class[]{SimpleResponse.class}, false);
    
    private int u;
    private String v;
    private String[] w;
    private Class[] x;
    private boolean y;

    private RequestType(String str, int i, String[] strArr, Class[] clsArr, boolean z) {
        this.v = str;
        this.u = i;
        this.w = strArr;
        this.x = clsArr;
        this.y = z;
        if (this.w.length != this.x.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RequestType of URL: ");
            stringBuilder.append(this.v);
            stringBuilder.append(" has nonuniform length of mappings and paths (");
            stringBuilder.append(this.x.length);
            stringBuilder.append(" vs ");
            stringBuilder.append(this.w.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static RequestType a(Class cls) {
        for (RequestType requestType : values()) {
            for (Class cls2 : requestType.b()) {
                if (cls2.equals(cls)) {
                    return requestType;
                }
                if (cls2.getComponentType() != null && cls2.getComponentType().equals(cls)) {
                    return requestType;
                }
            }
        }
        return null;
    }

    public int a() {
        return this.u;
    }

    public Class[] b() {
        return this.x;
    }

    public boolean c() {
        return this.y;
    }
}
