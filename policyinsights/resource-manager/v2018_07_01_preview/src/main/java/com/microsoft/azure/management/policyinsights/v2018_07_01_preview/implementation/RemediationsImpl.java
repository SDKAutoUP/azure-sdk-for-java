/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.Remediations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.RemediationDeployment;
import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.Remediation;

class RemediationsImpl extends WrapperImpl<RemediationsInner> implements Remediations {
    private final PolicyInsightsManager manager;

    RemediationsImpl(PolicyInsightsManager manager) {
        super(manager.inner().remediations());
        this.manager = manager;
    }

    public PolicyInsightsManager manager() {
        return this.manager;
    }

    @Override
    public RemediationImpl define(String name) {
        return wrapModel(name);
    }

    private RemediationImpl wrapModel(RemediationInner inner) {
        return  new RemediationImpl(inner, manager());
    }

    private RemediationImpl wrapModel(String name) {
        return new RemediationImpl(name, this.manager());
    }

    @Override
    public Observable<RemediationDeployment> listDeploymentsAtManagementGroupAsync(final String managementGroupId, final String remediationName) {
        RemediationsInner client = this.inner();
        return client.listDeploymentsAtManagementGroupAsync(managementGroupId, remediationName)
        .flatMapIterable(new Func1<Page<RemediationDeploymentInner>, Iterable<RemediationDeploymentInner>>() {
            @Override
            public Iterable<RemediationDeploymentInner> call(Page<RemediationDeploymentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemediationDeploymentInner, RemediationDeployment>() {
            @Override
            public RemediationDeployment call(RemediationDeploymentInner inner) {
                return new RemediationDeploymentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> cancelAtManagementGroupAsync(String managementGroupId, String remediationName) {
        RemediationsInner client = this.inner();
        return client.cancelAtManagementGroupAsync(managementGroupId, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> listForManagementGroupAsync(final String managementGroupId) {
        RemediationsInner client = this.inner();
        return client.listForManagementGroupAsync(managementGroupId)
        .flatMapIterable(new Func1<Page<RemediationInner>, Iterable<RemediationInner>>() {
            @Override
            public Iterable<RemediationInner> call(Page<RemediationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> getAtManagementGroupAsync(String managementGroupId, String remediationName) {
        RemediationsInner client = this.inner();
        return client.getAtManagementGroupAsync(managementGroupId, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> deleteAtManagementGroupAsync(String managementGroupId, String remediationName) {
        RemediationsInner client = this.inner();
        return client.deleteAtManagementGroupAsync(managementGroupId, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RemediationDeployment> listDeploymentsAtSubscriptionAsync(final String subscriptionId, final String remediationName) {
        RemediationsInner client = this.inner();
        return client.listDeploymentsAtSubscriptionAsync(subscriptionId, remediationName)
        .flatMapIterable(new Func1<Page<RemediationDeploymentInner>, Iterable<RemediationDeploymentInner>>() {
            @Override
            public Iterable<RemediationDeploymentInner> call(Page<RemediationDeploymentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemediationDeploymentInner, RemediationDeployment>() {
            @Override
            public RemediationDeployment call(RemediationDeploymentInner inner) {
                return new RemediationDeploymentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> cancelAtSubscriptionAsync(String subscriptionId, String remediationName) {
        RemediationsInner client = this.inner();
        return client.cancelAtSubscriptionAsync(subscriptionId, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> createOrUpdateAtSubscriptionAsync(String subscriptionId, String remediationName, RemediationInner parameters) {
        RemediationsInner client = this.inner();
        return client.createOrUpdateAtSubscriptionAsync(subscriptionId, remediationName, parameters)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> getAtSubscriptionAsync(String subscriptionId, String remediationName) {
        RemediationsInner client = this.inner();
        return client.getAtSubscriptionAsync(subscriptionId, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> deleteAtSubscriptionAsync(String subscriptionId, String remediationName) {
        RemediationsInner client = this.inner();
        return client.deleteAtSubscriptionAsync(subscriptionId, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RemediationDeployment> listDeploymentsAtResourceGroupAsync(final String subscriptionId, final String resourceGroupName, final String remediationName) {
        RemediationsInner client = this.inner();
        return client.listDeploymentsAtResourceGroupAsync(subscriptionId, resourceGroupName, remediationName)
        .flatMapIterable(new Func1<Page<RemediationDeploymentInner>, Iterable<RemediationDeploymentInner>>() {
            @Override
            public Iterable<RemediationDeploymentInner> call(Page<RemediationDeploymentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemediationDeploymentInner, RemediationDeployment>() {
            @Override
            public RemediationDeployment call(RemediationDeploymentInner inner) {
                return new RemediationDeploymentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> cancelAtResourceGroupAsync(String subscriptionId, String resourceGroupName, String remediationName) {
        RemediationsInner client = this.inner();
        return client.cancelAtResourceGroupAsync(subscriptionId, resourceGroupName, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> createOrUpdateAtResourceGroupAsync(String subscriptionId, String resourceGroupName, String remediationName, RemediationInner parameters) {
        RemediationsInner client = this.inner();
        return client.createOrUpdateAtResourceGroupAsync(subscriptionId, resourceGroupName, remediationName, parameters)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> getByResourceGroupAsync(String subscriptionId, String resourceGroupName, String remediationName) {
        RemediationsInner client = this.inner();
        return client.getByResourceGroupAsync(subscriptionId, resourceGroupName, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> deleteAtResourceGroupAsync(String subscriptionId, String resourceGroupName, String remediationName) {
        RemediationsInner client = this.inner();
        return client.deleteAtResourceGroupAsync(subscriptionId, resourceGroupName, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RemediationDeployment> listDeploymentsAtResourceAsync(final String resourceId, final String remediationName) {
        RemediationsInner client = this.inner();
        return client.listDeploymentsAtResourceAsync(resourceId, remediationName)
        .flatMapIterable(new Func1<Page<RemediationDeploymentInner>, Iterable<RemediationDeploymentInner>>() {
            @Override
            public Iterable<RemediationDeploymentInner> call(Page<RemediationDeploymentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemediationDeploymentInner, RemediationDeployment>() {
            @Override
            public RemediationDeployment call(RemediationDeploymentInner inner) {
                return new RemediationDeploymentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> cancelAtResourceAsync(String resourceId, String remediationName) {
        RemediationsInner client = this.inner();
        return client.cancelAtResourceAsync(resourceId, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> createOrUpdateAtResourceAsync(String resourceId, String remediationName, RemediationInner parameters) {
        RemediationsInner client = this.inner();
        return client.createOrUpdateAtResourceAsync(resourceId, remediationName, parameters)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> getAtResourceAsync(String resourceId, String remediationName) {
        RemediationsInner client = this.inner();
        return client.getAtResourceAsync(resourceId, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> deleteAtResourceAsync(String resourceId, String remediationName) {
        RemediationsInner client = this.inner();
        return client.deleteAtResourceAsync(resourceId, remediationName)
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> listAsync(final String subscriptionId) {
        RemediationsInner client = this.inner();
        return client.listAsync(subscriptionId)
        .flatMapIterable(new Func1<Page<RemediationInner>, Iterable<RemediationInner>>() {
            @Override
            public Iterable<RemediationInner> call(Page<RemediationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> listByResourceGroupAsync(final String subscriptionId, final String resourceGroupName) {
        RemediationsInner client = this.inner();
        return client.listByResourceGroupAsync(subscriptionId, resourceGroupName)
        .flatMapIterable(new Func1<Page<RemediationInner>, Iterable<RemediationInner>>() {
            @Override
            public Iterable<RemediationInner> call(Page<RemediationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Remediation> listForResourceAsync(final String resourceId) {
        RemediationsInner client = this.inner();
        return client.listForResourceAsync(resourceId)
        .flatMapIterable(new Func1<Page<RemediationInner>, Iterable<RemediationInner>>() {
            @Override
            public Iterable<RemediationInner> call(Page<RemediationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemediationInner, Remediation>() {
            @Override
            public Remediation call(RemediationInner inner) {
                return new RemediationImpl(inner, manager());
            }
        });
    }

}
