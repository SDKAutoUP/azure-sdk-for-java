/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.implementation;

import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.ControllerState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.ControllerResource;

/**
 * Represents an instance of a DNC controller.
 */
@JsonFlatten
public class DelegatedControllerInner extends ControllerResource {
    /**
     * The current state of dnc controller resource. Possible values include:
     * 'Deleting', 'Succeeded', 'Failed', 'Provisioning'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ControllerState state;

    /**
     * The current state of dnc controller resource.
     */
    @JsonProperty(value = "properties.dncAppId")
    private String dncAppId;

    /**
     * dnc endpoint url that customers can use to connect to.
     */
    @JsonProperty(value = "properties.dncEndpoint")
    private String dncEndpoint;

    /**
     * Get the current state of dnc controller resource. Possible values include: 'Deleting', 'Succeeded', 'Failed', 'Provisioning'.
     *
     * @return the state value
     */
    public ControllerState state() {
        return this.state;
    }

    /**
     * Get the current state of dnc controller resource.
     *
     * @return the dncAppId value
     */
    public String dncAppId() {
        return this.dncAppId;
    }

    /**
     * Set the current state of dnc controller resource.
     *
     * @param dncAppId the dncAppId value to set
     * @return the DelegatedControllerInner object itself.
     */
    public DelegatedControllerInner withDncAppId(String dncAppId) {
        this.dncAppId = dncAppId;
        return this;
    }

    /**
     * Get dnc endpoint url that customers can use to connect to.
     *
     * @return the dncEndpoint value
     */
    public String dncEndpoint() {
        return this.dncEndpoint;
    }

    /**
     * Set dnc endpoint url that customers can use to connect to.
     *
     * @param dncEndpoint the dncEndpoint value to set
     * @return the DelegatedControllerInner object itself.
     */
    public DelegatedControllerInner withDncEndpoint(String dncEndpoint) {
        this.dncEndpoint = dncEndpoint;
        return this;
    }

}
