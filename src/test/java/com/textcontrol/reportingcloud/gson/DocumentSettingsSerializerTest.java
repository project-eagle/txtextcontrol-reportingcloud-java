package com.textcontrol.reportingcloud.gson;

import com.google.gson.*;
import com.textcontrol.reportingcloud.DocumentSettings;
import org.junit.Assert;
import org.junit.Test;

/**
 * DocumentSettingsSerializer test class.
 *
 * @author Thorsten Kummerow
 */
public class DocumentSettingsSerializerTest {
    @Test
    public void serialize() {
        DocumentSettings s = new DocumentSettings();
        s.setCreationDate("2016-05-30T12:07:45+02:00");
        s.setAuthor("Author");
        s.setDocumentSubject("Subject");
        s.setCreatorApplication("Application");
        s.setDocumentTitle("Title");
        s.setUserPassword("password");

        GsonBuilder gb = new GsonBuilder();
        gb.registerTypeAdapter(DocumentSettings.class, new DocumentSettingsSerializer());
        gb.serializeNulls();
        Gson g = gb.create();

        String json = g.toJson(s);
        Assert.assertNotNull(json);
        Assert.assertTrue(json.length() > 0);
        JsonParser jp = new JsonParser();
        JsonObject obj = jp.parse(json).getAsJsonObject();

        Assert.assertEquals("2016-05-30T12:07:45+02:00", obj.get("creationDate").getAsString());
        Assert.assertEquals("Author", obj.get("author").getAsString());
        Assert.assertEquals("Subject", obj.get("documentSubject").getAsString());
        Assert.assertEquals("Application", obj.get("creatorApplication").getAsString());
        Assert.assertEquals("Title", obj.get("documentTitle").getAsString());
        Assert.assertEquals("password", obj.get("userPassword").getAsString());
    }
}
