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

/**
 * This enum lists all possible return formats for the Merge method.
 *
 * @author Thorsten Kummerow
 */
public enum ReturnFormat {
    /**
     * Adobe PDF
     */
    PDF,

    /**
     * Adobe PDF/A
     */
    PDFA,

    /**
     * Microsoft Word 97-2003
     */
    DOC,

    /**
     * Microsoft Office Open XML
     */
    DOCX,

    /**
     * Rich Text Format
     */
    RTF,

    /**
     * TX Text Control Internal Format
     */
    TX,

    /**
     * Plain text
     */
    TXT,

    /**
     * Hypertext Markup Language
     */
    HTML
}