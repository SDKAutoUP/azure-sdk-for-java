/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WorkflowRunOperations.
 */
public class WorkflowRunOperationsInner {
    /** The Retrofit service to perform REST calls. */
    private WorkflowRunOperationsService service;
    /** The service client containing this operation class. */
    private LogicManagementClientImpl client;

    /**
     * Initializes an instance of WorkflowRunOperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WorkflowRunOperationsInner(Retrofit retrofit, LogicManagementClientImpl client) {
        this.service = retrofit.create(WorkflowRunOperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WorkflowRunOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WorkflowRunOperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunOperations get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/runs/{runName}/operations/{operationId}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workflowName") String workflowName, @Path("runName") String runName, @Path("operationId") String operationId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets an operation for a run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param operationId The workflow operation id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkflowRunInner object if successful.
     */
    public WorkflowRunInner get(String resourceGroupName, String workflowName, String runName, String operationId) {
        return getWithServiceResponseAsync(resourceGroupName, workflowName, runName, operationId).toBlocking().single().body();
    }

    /**
     * Gets an operation for a run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param operationId The workflow operation id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkflowRunInner> getAsync(String resourceGroupName, String workflowName, String runName, String operationId, final ServiceCallback<WorkflowRunInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workflowName, runName, operationId), serviceCallback);
    }

    /**
     * Gets an operation for a run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param operationId The workflow operation id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkflowRunInner object
     */
    public Observable<WorkflowRunInner> getAsync(String resourceGroupName, String workflowName, String runName, String operationId) {
        return getWithServiceResponseAsync(resourceGroupName, workflowName, runName, operationId).map(new Func1<ServiceResponse<WorkflowRunInner>, WorkflowRunInner>() {
            @Override
            public WorkflowRunInner call(ServiceResponse<WorkflowRunInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets an operation for a run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param operationId The workflow operation id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkflowRunInner object
     */
    public Observable<ServiceResponse<WorkflowRunInner>> getWithServiceResponseAsync(String resourceGroupName, String workflowName, String runName, String operationId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (runName == null) {
            throw new IllegalArgumentException("Parameter runName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workflowName, runName, operationId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WorkflowRunInner>>>() {
                @Override
                public Observable<ServiceResponse<WorkflowRunInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WorkflowRunInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WorkflowRunInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WorkflowRunInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WorkflowRunInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
