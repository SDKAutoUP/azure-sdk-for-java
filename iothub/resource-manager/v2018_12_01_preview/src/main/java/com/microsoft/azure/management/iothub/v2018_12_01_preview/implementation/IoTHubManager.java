/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.iothub.v2018_12_01_preview.Operations;
import com.microsoft.azure.management.iothub.v2018_12_01_preview.IotHubResources;
import com.microsoft.azure.management.iothub.v2018_12_01_preview.ResourceProviderCommons;
import com.microsoft.azure.management.iothub.v2018_12_01_preview.Certificates;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Devices resource management.
 */
public final class IoTHubManager extends ManagerCore<IoTHubManager, IotHubClientImpl> {
    private Operations operations;
    private IotHubResources iotHubResources;
    private ResourceProviderCommons resourceProviderCommons;
    private Certificates certificates;
    /**
    * Get a Configurable instance that can be used to create IoTHubManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new IoTHubManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of IoTHubManager that exposes Devices resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the IoTHubManager
    */
    public static IoTHubManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new IoTHubManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of IoTHubManager that exposes Devices resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the IoTHubManager
    */
    public static IoTHubManager authenticate(RestClient restClient, String subscriptionId) {
        return new IoTHubManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of IoTHubManager that exposes Devices management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Devices management API entry points that work across subscriptions
        */
        IoTHubManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage IotHubResources.
     */
    public IotHubResources iotHubResources() {
        if (this.iotHubResources == null) {
            this.iotHubResources = new IotHubResourcesImpl(this);
        }
        return this.iotHubResources;
    }

    /**
     * @return Entry point to manage ResourceProviderCommons.
     */
    public ResourceProviderCommons resourceProviderCommons() {
        if (this.resourceProviderCommons == null) {
            this.resourceProviderCommons = new ResourceProviderCommonsImpl(this);
        }
        return this.resourceProviderCommons;
    }

    /**
     * @return Entry point to manage Certificates.
     */
    public Certificates certificates() {
        if (this.certificates == null) {
            this.certificates = new CertificatesImpl(this);
        }
        return this.certificates;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public IoTHubManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return IoTHubManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private IoTHubManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new IotHubClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
