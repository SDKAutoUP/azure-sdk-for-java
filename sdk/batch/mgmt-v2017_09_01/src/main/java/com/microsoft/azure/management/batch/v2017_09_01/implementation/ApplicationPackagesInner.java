/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.batch.v2017_09_01.ActivateApplicationPackageParameters;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ApplicationPackages.
 */
public class ApplicationPackagesInner {
    /** The Retrofit service to perform REST calls. */
    private ApplicationPackagesService service;
    /** The service client containing this operation class. */
    private BatchManagementClientImpl client;

    /**
     * Initializes an instance of ApplicationPackagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ApplicationPackagesInner(Retrofit retrofit, BatchManagementClientImpl client) {
        this.service = retrofit.create(ApplicationPackagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApplicationPackages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApplicationPackagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.batch.v2017_09_01.ApplicationPackages activate" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Batch/batchAccounts/{accountName}/applications/{applicationId}/versions/{version}/activate")
        Observable<Response<ResponseBody>> activate(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("applicationId") String applicationId, @Path("version") String version, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body ActivateApplicationPackageParameters parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.batch.v2017_09_01.ApplicationPackages create" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Batch/batchAccounts/{accountName}/applications/{applicationId}/versions/{version}")
        Observable<Response<ResponseBody>> create(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("applicationId") String applicationId, @Path("version") String version, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.batch.v2017_09_01.ApplicationPackages delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Batch/batchAccounts/{accountName}/applications/{applicationId}/versions/{version}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("applicationId") String applicationId, @Path("version") String version, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.batch.v2017_09_01.ApplicationPackages get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Batch/batchAccounts/{accountName}/applications/{applicationId}/versions/{version}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("applicationId") String applicationId, @Path("version") String version, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Activates the specified application package.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application to activate.
     * @param format The format of the application package binary file.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void activate(String resourceGroupName, String accountName, String applicationId, String version, String format) {
        activateWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version, format).toBlocking().single().body();
    }

    /**
     * Activates the specified application package.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application to activate.
     * @param format The format of the application package binary file.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> activateAsync(String resourceGroupName, String accountName, String applicationId, String version, String format, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(activateWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version, format), serviceCallback);
    }

    /**
     * Activates the specified application package.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application to activate.
     * @param format The format of the application package binary file.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> activateAsync(String resourceGroupName, String accountName, String applicationId, String version, String format) {
        return activateWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version, format).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Activates the specified application package.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application to activate.
     * @param format The format of the application package binary file.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> activateWithServiceResponseAsync(String resourceGroupName, String accountName, String applicationId, String version, String format) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (applicationId == null) {
            throw new IllegalArgumentException("Parameter applicationId is required and cannot be null.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Parameter version is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (format == null) {
            throw new IllegalArgumentException("Parameter format is required and cannot be null.");
        }
        ActivateApplicationPackageParameters parameters = new ActivateApplicationPackageParameters();
        parameters.withFormat(format);
        return service.activate(resourceGroupName, accountName, applicationId, version, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = activateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> activateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates an application package record.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationPackageInner object if successful.
     */
    public ApplicationPackageInner create(String resourceGroupName, String accountName, String applicationId, String version) {
        return createWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version).toBlocking().single().body();
    }

    /**
     * Creates an application package record.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationPackageInner> createAsync(String resourceGroupName, String accountName, String applicationId, String version, final ServiceCallback<ApplicationPackageInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version), serviceCallback);
    }

    /**
     * Creates an application package record.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationPackageInner object
     */
    public Observable<ApplicationPackageInner> createAsync(String resourceGroupName, String accountName, String applicationId, String version) {
        return createWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version).map(new Func1<ServiceResponse<ApplicationPackageInner>, ApplicationPackageInner>() {
            @Override
            public ApplicationPackageInner call(ServiceResponse<ApplicationPackageInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates an application package record.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationPackageInner object
     */
    public Observable<ServiceResponse<ApplicationPackageInner>> createWithServiceResponseAsync(String resourceGroupName, String accountName, String applicationId, String version) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (applicationId == null) {
            throw new IllegalArgumentException("Parameter applicationId is required and cannot be null.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Parameter version is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.create(resourceGroupName, accountName, applicationId, version, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationPackageInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationPackageInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationPackageInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationPackageInner> createDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationPackageInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<ApplicationPackageInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes an application package record and its associated binary file.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String accountName, String applicationId, String version) {
        deleteWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version).toBlocking().single().body();
    }

    /**
     * Deletes an application package record and its associated binary file.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String accountName, String applicationId, String version, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version), serviceCallback);
    }

    /**
     * Deletes an application package record and its associated binary file.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String accountName, String applicationId, String version) {
        return deleteWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes an application package record and its associated binary file.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String accountName, String applicationId, String version) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (applicationId == null) {
            throw new IllegalArgumentException("Parameter applicationId is required and cannot be null.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Parameter version is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, accountName, applicationId, version, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets information about the specified application package.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationPackageInner object if successful.
     */
    public ApplicationPackageInner get(String resourceGroupName, String accountName, String applicationId, String version) {
        return getWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version).toBlocking().single().body();
    }

    /**
     * Gets information about the specified application package.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationPackageInner> getAsync(String resourceGroupName, String accountName, String applicationId, String version, final ServiceCallback<ApplicationPackageInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version), serviceCallback);
    }

    /**
     * Gets information about the specified application package.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationPackageInner object
     */
    public Observable<ApplicationPackageInner> getAsync(String resourceGroupName, String accountName, String applicationId, String version) {
        return getWithServiceResponseAsync(resourceGroupName, accountName, applicationId, version).map(new Func1<ServiceResponse<ApplicationPackageInner>, ApplicationPackageInner>() {
            @Override
            public ApplicationPackageInner call(ServiceResponse<ApplicationPackageInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets information about the specified application package.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationId The ID of the application.
     * @param version The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationPackageInner object
     */
    public Observable<ServiceResponse<ApplicationPackageInner>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String applicationId, String version) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (applicationId == null) {
            throw new IllegalArgumentException("Parameter applicationId is required and cannot be null.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Parameter version is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, accountName, applicationId, version, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationPackageInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationPackageInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationPackageInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationPackageInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationPackageInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationPackageInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
