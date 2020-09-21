/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.StorageClassificationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Storage object definition.
 */
public class StorageClassificationInner extends ProxyResource {
    /**
     * Properties of the storage object.
     */
    @JsonProperty(value = "properties")
    private StorageClassificationProperties properties;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get properties of the storage object.
     *
     * @return the properties value
     */
    public StorageClassificationProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the storage object.
     *
     * @param properties the properties value to set
     * @return the StorageClassificationInner object itself.
     */
    public StorageClassificationInner withProperties(StorageClassificationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get resource Location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource Location.
     *
     * @param location the location value to set
     * @return the StorageClassificationInner object itself.
     */
    public StorageClassificationInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
