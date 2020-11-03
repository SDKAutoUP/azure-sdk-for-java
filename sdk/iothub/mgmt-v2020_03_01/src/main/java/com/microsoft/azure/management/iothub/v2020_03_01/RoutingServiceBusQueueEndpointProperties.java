/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties related to service bus queue endpoint types.
 */
public class RoutingServiceBusQueueEndpointProperties {
    /**
     * Id of the service bus queue endpoint.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The connection string of the service bus queue endpoint.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /**
     * The url of the service bus queue endpoint. It must include the protocol
     * sb://.
     */
    @JsonProperty(value = "endpointUri")
    private String endpointUri;

    /**
     * Queue name on the service bus namespace.
     */
    @JsonProperty(value = "entityPath")
    private String entityPath;

    /**
     * Method used to authenticate against the service bus queue endpoint.
     * Possible values include: 'keyBased', 'identityBased'.
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /**
     * The name that identifies this endpoint. The name can only include
     * alphanumeric characters, periods, underscores, hyphens and has a maximum
     * length of 64 characters. The following names are reserved:  events,
     * fileNotifications, $default. Endpoint names must be unique across
     * endpoint types. The name need not be the same as the actual queue name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The subscription identifier of the service bus queue endpoint.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * The name of the resource group of the service bus queue endpoint.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Get id of the service bus queue endpoint.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set id of the service bus queue endpoint.
     *
     * @param id the id value to set
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the connection string of the service bus queue endpoint.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connection string of the service bus queue endpoint.
     *
     * @param connectionString the connectionString value to set
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the url of the service bus queue endpoint. It must include the protocol sb://.
     *
     * @return the endpointUri value
     */
    public String endpointUri() {
        return this.endpointUri;
    }

    /**
     * Set the url of the service bus queue endpoint. It must include the protocol sb://.
     *
     * @param endpointUri the endpointUri value to set
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties withEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    /**
     * Get queue name on the service bus namespace.
     *
     * @return the entityPath value
     */
    public String entityPath() {
        return this.entityPath;
    }

    /**
     * Set queue name on the service bus namespace.
     *
     * @param entityPath the entityPath value to set
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties withEntityPath(String entityPath) {
        this.entityPath = entityPath;
        return this;
    }

    /**
     * Get method used to authenticate against the service bus queue endpoint. Possible values include: 'keyBased', 'identityBased'.
     *
     * @return the authenticationType value
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set method used to authenticate against the service bus queue endpoint. Possible values include: 'keyBased', 'identityBased'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types. The name need not be the same as the actual queue name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types. The name need not be the same as the actual queue name.
     *
     * @param name the name value to set
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subscription identifier of the service bus queue endpoint.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscription identifier of the service bus queue endpoint.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the name of the resource group of the service bus queue endpoint.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the name of the resource group of the service bus queue endpoint.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

}
