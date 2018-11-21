package pl.vulcan.uonetmobile.model.entities.inner;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import org.joda.time.DateTime;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.data.PupilEntity;

@DatabaseTable(tableName = "Synchronization")
public class SynchronizationEntity extends BaseEntity<SynchronizationEntity> {
	@DatabaseField(canBeNull = false, columnName = "DataSynchronizacji", dataType = DataType.LONG)
	private long c;
	@DatabaseField(canBeNull = false, columnName = "Tabela", dataType = DataType.STRING)
	private String d;
	@DatabaseField(canBeNull = false, columnName = "Partycja", dataType = DataType.STRING)
	private String e;
	@DatabaseField(canBeNull = false, columnName = "FlagaSpojnosci", dataType = DataType.BOOLEAN)
	private boolean f;

	public SynchronizationEntity(PupilEntity pupilEntity, String str, String str2, boolean z) {
		this.b = pupilEntity == null ? Integer.MIN_VALUE : pupilEntity.a();
		this.d = str;
		this.e = str2;
		this.c = 0;
		this.f = z;
	}

	public int a(SynchronizationEntity synchronizationEntity) {
		return this.a - synchronizationEntity.a;
	}

	public void a(long j) {
		this.c = j;
	}

	public void a(AppState appState, b bVar) {
	}

	public void a(boolean z) {
		this.f = z;
	}

	public Comparable c(int i) {
		return Integer.valueOf(this.a);
	}

	public boolean c() {
		return true;
	}

	public /* synthetic */ int compareTo(Object obj) {
		return a((SynchronizationEntity) obj);
	}

	public DateTime d() {
		return new DateTime(this.c);
	}

	/* JADX WARNING: inconsistent code. */
	/* Code decompiled incorrectly, please refer to instructions dump. */
	public boolean equals(java.lang.Object r5) {
		/*
		 * r4 = this; r0 = 1; if (r4 != r5) goto L_0x0004; L_0x0003: return r0;
		 * L_0x0004: r1 = 0; if (r5 == 0) goto L_0x0044; L_0x0007: r2 =
		 * r4.getClass(); r3 = r5.getClass(); if (r2 == r3) goto L_0x0012;
		 * L_0x0011: return r1; L_0x0012: r2 = super.equals(r5); if (r2 != 0)
		 * goto L_0x0019; L_0x0018: return r1; L_0x0019: r5 =
		 * (pl.vulcan.uonetmobile.model.entities.inner.SynchronizationEntity)
		 * r5; r2 = r4.e; if (r2 == 0) goto L_0x002a; L_0x001f: r2 = r4.e; r3 =
		 * r5.e; r2 = r2.equals(r3); if (r2 != 0) goto L_0x002e; L_0x0029: goto
		 * L_0x0042; L_0x002a: r2 = r5.e; if (r2 != 0) goto L_0x0042; L_0x002e:
		 * r2 = r4.d; if (r2 == 0) goto L_0x003d; L_0x0032: r2 = r4.d; r5 =
		 * r5.d; r5 = r2.equals(r5); if (r5 != 0) goto L_0x0043; L_0x003c: goto
		 * L_0x0042; L_0x003d: r5 = r5.d; if (r5 != 0) goto L_0x0042; L_0x0041:
		 * return r0; L_0x0042: r0 = 0; L_0x0043: return r0; L_0x0044: return
		 * r1;
		 */
		throw new UnsupportedOperationException(
				"Method not decompiled: pl.vulcan.uonetmobile.model.entities.inner.SynchronizationEntity.equals(java.lang.Object):boolean");
	}

	public int hashCode() {
		return (super.hashCode() * 31) + (this.d != null ? this.d.hashCode() : 0);
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SynchronizationEntity{mSynchro=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mTable='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mPartition='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mConsistent=");
		stringBuilder.append(this.f);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}
