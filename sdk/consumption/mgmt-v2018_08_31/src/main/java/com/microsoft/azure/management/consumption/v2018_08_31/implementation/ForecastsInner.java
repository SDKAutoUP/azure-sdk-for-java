/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_08_31.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.consumption.v2018_08_31.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
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
 * in Forecasts.
 */
public class ForecastsInner {
    /** The Retrofit service to perform REST calls. */
    private ForecastsService service;
    /** The service client containing this operation class. */
    private ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of ForecastsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ForecastsInner(Retrofit retrofit, ConsumptionManagementClientImpl client) {
        this.service = retrofit.create(ForecastsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Forecasts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ForecastsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_08_31.Forecasts list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Consumption/forecasts")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the forecast charges by subscriptionId.
     *
     * @return the PagedList<ForecastInner> object if successful.
     */
    public PagedList<ForecastInner> list() {
        PageImpl1<ForecastInner> page = new PageImpl1<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<ForecastInner>(page) {
            @Override
            public Page<ForecastInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Lists the forecast charges by subscriptionId.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ForecastInner>> listAsync(final ServiceCallback<List<ForecastInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists the forecast charges by subscriptionId.
     *
     * @return the observable to the List&lt;ForecastInner&gt; object
     */
    public Observable<Page<ForecastInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<ForecastInner>>, Page<ForecastInner>>() {
            @Override
            public Page<ForecastInner> call(ServiceResponse<List<ForecastInner>> response) {
                PageImpl1<ForecastInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Lists the forecast charges by subscriptionId.
     *
     * @return the observable to the List&lt;ForecastInner&gt; object
     */
    public Observable<ServiceResponse<List<ForecastInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.list(this.client.subscriptionId(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ForecastInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ForecastInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ForecastInner>> result = listDelegate(response);
                        List<ForecastInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ForecastInner>> clientResponse = new ServiceResponse<List<ForecastInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the forecast charges by subscriptionId.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @return the PagedList<ForecastInner> object if successful.
     */
    public PagedList<ForecastInner> list(String filter) {
        PageImpl1<ForecastInner> page = new PageImpl1<>();
        page.setItems(listWithServiceResponseAsync(filter).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<ForecastInner>(page) {
            @Override
            public Page<ForecastInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Lists the forecast charges by subscriptionId.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ForecastInner>> listAsync(String filter, final ServiceCallback<List<ForecastInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(filter), serviceCallback);
    }

    /**
     * Lists the forecast charges by subscriptionId.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @return the observable to the List&lt;ForecastInner&gt; object
     */
    public Observable<Page<ForecastInner>> listAsync(String filter) {
        return listWithServiceResponseAsync(filter).map(new Func1<ServiceResponse<List<ForecastInner>>, Page<ForecastInner>>() {
            @Override
            public Page<ForecastInner> call(ServiceResponse<List<ForecastInner>> response) {
                PageImpl1<ForecastInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Lists the forecast charges by subscriptionId.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @return the observable to the List&lt;ForecastInner&gt; object
     */
    public Observable<ServiceResponse<List<ForecastInner>>> listWithServiceResponseAsync(String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ForecastInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ForecastInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ForecastInner>> result = listDelegate(response);
                        List<ForecastInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ForecastInner>> clientResponse = new ServiceResponse<List<ForecastInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ForecastInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ForecastInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ForecastInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
