package pl.vulcan.uonetmobile.model.entities.grades;

import pl.vulcan.uonetmobile.managers.b.a;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;

public abstract class SummaryGradeEntity extends BaseEntity<SummaryGradeEntity> {
    public int a(SummaryGradeEntity summaryGradeEntity) {
        return d() == null ? (summaryGradeEntity == null || summaryGradeEntity.d() == null) ? 0 : -1 : d().compareTo(summaryGradeEntity.d());
    }

    public Comparable c(int i) {
        return d() == null ? "---" : d();
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((SummaryGradeEntity) obj);
    }

    public abstract String d();

    public abstract String d(int i);

    public int e() {
        return 1;
    }

    public abstract int e(int i);

    public int f(int i) {
        return a.a(d(i), null, null);
    }
}
