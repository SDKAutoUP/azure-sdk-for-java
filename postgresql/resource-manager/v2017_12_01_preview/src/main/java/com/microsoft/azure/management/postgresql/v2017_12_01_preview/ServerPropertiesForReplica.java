/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties to create a new replica.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode")
@JsonTypeName("Replica")
public class ServerPropertiesForReplica extends ServerPropertiesForCreate {
    /**
     * The master server id to create replica from.
     */
    @JsonProperty(value = "sourceServerId", required = true)
    private String sourceServerId;

    /**
     * Get the master server id to create replica from.
     *
     * @return the sourceServerId value
     */
    public String sourceServerId() {
        return this.sourceServerId;
    }

    /**
     * Set the master server id to create replica from.
     *
     * @param sourceServerId the sourceServerId value to set
     * @return the ServerPropertiesForReplica object itself.
     */
    public ServerPropertiesForReplica withSourceServerId(String sourceServerId) {
        this.sourceServerId = sourceServerId;
        return this;
    }

}
