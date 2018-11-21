package pl.vulcan.uonetmobile.model.entities.teachers;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "TeacherSchool")
public class TeacherSchoolEntity extends TeacherRelationEntity {
    public TeacherSchoolEntity(String str) {
        a(str);
    }
}
