/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DelegatedSubnet Parameters.
 */
public class DelegatedSubnetParameters {
    /**
     * Delegated Network Controller ARM resource ID.
     */
    @JsonProperty(value = "controllerID")
    private String controllerID;

    /**
     * Get delegated Network Controller ARM resource ID.
     *
     * @return the controllerID value
     */
    public String controllerID() {
        return this.controllerID;
    }

    /**
     * Set delegated Network Controller ARM resource ID.
     *
     * @param controllerID the controllerID value to set
     * @return the DelegatedSubnetParameters object itself.
     */
    public DelegatedSubnetParameters withControllerID(String controllerID) {
        this.controllerID = controllerID;
        return this;
    }

}
