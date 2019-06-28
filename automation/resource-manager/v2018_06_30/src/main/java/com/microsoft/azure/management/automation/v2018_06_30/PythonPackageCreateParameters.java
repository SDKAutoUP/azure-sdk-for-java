/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters supplied to the create or update module operation.
 */
@JsonFlatten
public class PythonPackageCreateParameters {
    /**
     * Gets or sets the module content link.
     */
    @JsonProperty(value = "properties.contentLink", required = true)
    private ContentLink contentLink;

    /**
     * Gets or sets the tags attached to the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get gets or sets the module content link.
     *
     * @return the contentLink value
     */
    public ContentLink contentLink() {
        return this.contentLink;
    }

    /**
     * Set gets or sets the module content link.
     *
     * @param contentLink the contentLink value to set
     * @return the PythonPackageCreateParameters object itself.
     */
    public PythonPackageCreateParameters withContentLink(ContentLink contentLink) {
        this.contentLink = contentLink;
        return this;
    }

    /**
     * Get gets or sets the tags attached to the resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set gets or sets the tags attached to the resource.
     *
     * @param tags the tags value to set
     * @return the PythonPackageCreateParameters object itself.
     */
    public PythonPackageCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
