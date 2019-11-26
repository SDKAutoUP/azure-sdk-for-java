/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ServerAdvisors;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ServerAdvisor;

class ServerAdvisorsImpl extends WrapperImpl<ServerAdvisorsInner> implements ServerAdvisors {
    private final SqlManager manager;

    ServerAdvisorsImpl(SqlManager manager) {
        super(manager.inner().serverAdvisors());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private ServerAdvisorImpl wrapModel(AdvisorInner inner) {
        return  new ServerAdvisorImpl(inner, manager());
    }

    @Override
    public Observable<ServerAdvisor> listByServerAsync(String resourceGroupName, String serverName) {
        ServerAdvisorsInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<AdvisorInner>, Observable<AdvisorInner>>() {
            @Override
            public Observable<AdvisorInner> call(List<AdvisorInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<AdvisorInner, ServerAdvisor>() {
            @Override
            public ServerAdvisor call(AdvisorInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerAdvisor> getAsync(String resourceGroupName, String serverName, String advisorName) {
        ServerAdvisorsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, advisorName)
        .map(new Func1<AdvisorInner, ServerAdvisor>() {
            @Override
            public ServerAdvisor call(AdvisorInner inner) {
                return wrapModel(inner);
            }
       });
    }

}