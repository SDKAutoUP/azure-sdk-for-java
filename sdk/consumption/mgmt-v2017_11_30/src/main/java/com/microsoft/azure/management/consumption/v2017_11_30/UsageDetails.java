/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2017_11_30;

import rx.Observable;
import com.microsoft.azure.management.consumption.v2017_11_30.implementation.UsageDetailsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing UsageDetails.
 */
public interface UsageDetails extends HasInner<UsageDetailsInner> {
    /**
     * Lists the usage details for a scope by billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listAsync(final String scope);

}
