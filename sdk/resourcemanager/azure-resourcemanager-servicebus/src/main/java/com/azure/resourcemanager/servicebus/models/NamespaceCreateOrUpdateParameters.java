// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The NamespaceCreateOrUpdateParameters model. */
@JsonFlatten
@Fluent
public class NamespaceCreateOrUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NamespaceCreateOrUpdateParameters.class);

    /*
     * Namespace location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * SKU of the namespace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Namespace tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Provisioning state of the namespace.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * State of the namespace.
     */
    @JsonProperty(value = "properties.status")
    private NamespaceState status;

    /*
     * The time the namespace was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time the namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "properties.serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /*
     * Indicates whether to create an ACS namespace.
     */
    @JsonProperty(value = "properties.createACSNamespace")
    private Boolean createAcsNamespace;

    /*
     * Specifies whether this instance is enabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Get the location property: Namespace location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Namespace location.
     *
     * @param location the location value to set.
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sku property: SKU of the namespace.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the namespace.
     *
     * @param sku the sku value to set.
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tags property: Namespace tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Namespace tags.
     *
     * @param tags the tags value to set.
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: State of the namespace.
     *
     * @return the status value.
     */
    public NamespaceState status() {
        return this.status;
    }

    /**
     * Set the status property: State of the namespace.
     *
     * @param status the status value to set.
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withStatus(NamespaceState status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get the createAcsNamespace property: Indicates whether to create an ACS namespace.
     *
     * @return the createAcsNamespace value.
     */
    public Boolean createAcsNamespace() {
        return this.createAcsNamespace;
    }

    /**
     * Set the createAcsNamespace property: Indicates whether to create an ACS namespace.
     *
     * @param createAcsNamespace the createAcsNamespace value to set.
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withCreateAcsNamespace(Boolean createAcsNamespace) {
        this.createAcsNamespace = createAcsNamespace;
        return this;
    }

    /**
     * Get the enabled property: Specifies whether this instance is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Specifies whether this instance is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the NamespaceCreateOrUpdateParameters object itself.
     */
    public NamespaceCreateOrUpdateParameters withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model NamespaceCreateOrUpdateParameters"));
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
