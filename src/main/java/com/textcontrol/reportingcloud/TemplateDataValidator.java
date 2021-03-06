/**
 * ReportingCloud Java SDK
 *
 * Official Java SDK for the ReportingCloud Web API. Authored, maintained and fully supported
 * by Text Control GmbH. (http://www.textcontrol.com).
 *
 * Go to http://www.reporting.cloud to learn more about ReportingCloud
 * Go to https://github.com/TextControl/txtextcontrol-reportingcloud-java for the
 * canonical source repository.
 *
 * License: https://raw.githubusercontent.com/TextControl/txtextcontrol-reportingcloud-java/master/LICENSE.md
 *
 * Copyright: © 2019 Text Control GmbH
 */
package com.textcontrol.reportingcloud;

import java.security.InvalidParameterException;

/**
 * Internal method parameter validator class.
 *
 * @author Thorsten Kummerow
 */
class TemplateDataValidator {
    /**
     * Checks if a template data buffer contains something. Throws an exception if not.
     *
     * @param templateData Template data.
     */
    public static void validate(byte[] templateData) throws InvalidParameterException {
        if ((templateData == null) || (templateData.length == 0)) {
            throw new InvalidParameterException("No template data provided.");
        }
    }
}
