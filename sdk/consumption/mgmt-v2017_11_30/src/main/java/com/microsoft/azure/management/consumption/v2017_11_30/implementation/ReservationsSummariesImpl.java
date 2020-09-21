/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2017_11_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2017_11_30.ReservationsSummaries;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.consumption.v2017_11_30.ReservationSummaries;
import com.microsoft.azure.management.consumption.v2017_11_30.Datagrain;

class ReservationsSummariesImpl extends WrapperImpl<ReservationsSummariesInner> implements ReservationsSummaries {
    private final ConsumptionManager manager;

    ReservationsSummariesImpl(ConsumptionManager manager) {
        super(manager.inner().reservationsSummaries());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ReservationSummaries> listAsync(String scope, Datagrain grain) {
        ReservationsSummariesInner client = this.inner();
        return client.listAsync(scope, grain)
        .flatMap(new Func1<List<ReservationSummariesInner>, Observable<ReservationSummariesInner>>() {
            @Override
            public Observable<ReservationSummariesInner> call(List<ReservationSummariesInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ReservationSummariesInner, ReservationSummaries>() {
            @Override
            public ReservationSummaries call(ReservationSummariesInner inner) {
                return new ReservationSummariesImpl(inner, manager());
            }
        });
    }

}
