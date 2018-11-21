package pl.vulcan.uonetmobile.model.entities.mail.impl;

import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.model.entities.mail.MailEntity;

@DatabaseTable(tableName = "SentMails")
public class SentMailEntity extends MailEntity {
    public SentMailEntity(MailEntity mailEntity) {
        super(mailEntity);
    }
}
