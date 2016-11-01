package net.apispark.webapi;

import net.apispark.webapi.db.ContactPersistence;
import net.apispark.webapi.representation.Contact;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Cannelle on 26/10/2016.
 */
public class ContactPersistenceTest {
    @Test
    public void Test() {
        Contact contact = new Contact();
        Assert.assertEquals(ContactPersistence.INSTANCE.addContact(contact), contact);
        // ou Assert.assertThat(ContactPersistence.INSTANCE.addContact(contact).getId(), is(instanceOf(String.class)));
    }

    @Test
    public void Test2() {
        Contact contact = new Contact();
        contact.setId("1");
        ContactPersistence.INSTANCE.addContact(contact);
        Assert.assertEquals(ContactPersistence.INSTANCE.getContact(contact.getId()), contact);
    }
}
