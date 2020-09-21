/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The deleted share to be restored.
 */
public class DeletedShare {
    /**
     * Required. Identify the name of the deleted share that will be restored.
     */
    @JsonProperty(value = "deletedShareName", required = true)
    private String deletedShareName;

    /**
     * Required. Identify the version of the deleted share that will be
     * restored.
     */
    @JsonProperty(value = "deletedShareVersion", required = true)
    private String deletedShareVersion;

    /**
     * Get required. Identify the name of the deleted share that will be restored.
     *
     * @return the deletedShareName value
     */
    public String deletedShareName() {
        return this.deletedShareName;
    }

    /**
     * Set required. Identify the name of the deleted share that will be restored.
     *
     * @param deletedShareName the deletedShareName value to set
     * @return the DeletedShare object itself.
     */
    public DeletedShare withDeletedShareName(String deletedShareName) {
        this.deletedShareName = deletedShareName;
        return this;
    }

    /**
     * Get required. Identify the version of the deleted share that will be restored.
     *
     * @return the deletedShareVersion value
     */
    public String deletedShareVersion() {
        return this.deletedShareVersion;
    }

    /**
     * Set required. Identify the version of the deleted share that will be restored.
     *
     * @param deletedShareVersion the deletedShareVersion value to set
     * @return the DeletedShare object itself.
     */
    public DeletedShare withDeletedShareVersion(String deletedShareVersion) {
        this.deletedShareVersion = deletedShareVersion;
        return this;
    }

}
