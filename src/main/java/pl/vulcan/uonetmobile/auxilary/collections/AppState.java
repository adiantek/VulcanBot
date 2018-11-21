package pl.vulcan.uonetmobile.auxilary.collections;

import java.io.Serializable;
import pl.vulcan.uonetmobile.model.entities.data.PupilEntity;

public class AppState implements Serializable {
    public PupilEntity a;
    public boolean b;

    protected AppState() {
    }

    public static AppState a() {
        return new AppState();
    }

    public AppState a(PupilEntity pupilEntity) {
        this.a = pupilEntity;
        return this;
    }

    public AppState a(boolean z) {
        this.b = z;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AppState{mPupilEntity=");
        stringBuilder.append(this.a == null ? "null" : Integer.valueOf(this.a.u));
        stringBuilder.append(", mOffline=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
