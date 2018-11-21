package pl.vulcan.uonetmobile.model.entities.mail.impl;

import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.model.entities.mail.MailEntity;

@DatabaseTable(tableName = "RemovedMails")
public class RemovedMailEntity extends MailEntity {
    public RemovedMailEntity(MailEntity mailEntity) {
        super(mailEntity);
    }
}
