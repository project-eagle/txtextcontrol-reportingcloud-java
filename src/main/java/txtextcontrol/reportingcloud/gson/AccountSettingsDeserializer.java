/**
 * ReportingCloud Java Wrapper
 *
 * Official wrapper (authored by Text Control GmbH, publisher of ReportingCloud) to access
 * ReportingCloud in Java.
 *
 * Go to http://www.reporting.cloud to learn more about ReportingCloud
 * Go to https://github.com/TextControl/txtextcontrol-reportingcloud-java for the
 * canonical source repository.
 *
 * License: https://raw.githubusercontent.com/TextControl/txtextcontrol-reportingcloud-java/master/LICENSE.md
 *
 * Copyright: © 2016 Text Control GmbH
 */
package txtextcontrol.reportingcloud.gson;

import com.google.gson.*;
import txtextcontrol.reportingcloud.AccountSettings;

import java.lang.reflect.Type;

/**
 * Created by thorsten on 10.06.2016.
 */
public class AccountSettingsDeserializer implements JsonDeserializer<AccountSettings> {
    @Override
    public AccountSettings deserialize(JsonElement json, Type typeOfT,
                                       JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObj = json.getAsJsonObject();
        return new AccountSettings(
            jsonObj.get("serialNumber").getAsString(),
            jsonObj.get("createdDocuments").getAsInt(),
            jsonObj.get("uploadedTemplates").getAsInt(),
            jsonObj.get("maxDocuments").getAsInt(),
            jsonObj.get("maxTemplates").getAsInt(),
            jsonObj.get("validUntil").getAsString()
        );
    }
}