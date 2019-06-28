/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Snapshot patch.
 */
public class SnapshotPatch {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Object tags;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Object tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the SnapshotPatch object itself.
     */
    public SnapshotPatch withTags(Object tags) {
        this.tags = tags;
        return this;
    }

}
