/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.batch.v2017_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batch.v2017_09_01.Locations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.batch.v2017_09_01.BatchLocationQuota;
import com.microsoft.azure.management.batch.v2017_09_01.CheckNameAvailabilityResult;

class LocationsImpl extends WrapperImpl<LocationsInner> implements Locations {
    private final BatchManager manager;

    LocationsImpl(BatchManager manager) {
        super(manager.inner().locations());
        this.manager = manager;
    }

    public BatchManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BatchLocationQuota> getQuotasAsync(String locationName) {
        LocationsInner client = this.inner();
        return client.getQuotasAsync(locationName)
        .map(new Func1<BatchLocationQuotaInner, BatchLocationQuota>() {
            @Override
            public BatchLocationQuota call(BatchLocationQuotaInner inner) {
                return new BatchLocationQuotaImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String locationName, String name) {
        LocationsInner client = this.inner();
        return client.checkNameAvailabilityAsync(locationName, name)
        .map(new Func1<CheckNameAvailabilityResultInner, CheckNameAvailabilityResult>() {
            @Override
            public CheckNameAvailabilityResult call(CheckNameAvailabilityResultInner inner) {
                return new CheckNameAvailabilityResultImpl(inner, manager());
            }
        });
    }

}
