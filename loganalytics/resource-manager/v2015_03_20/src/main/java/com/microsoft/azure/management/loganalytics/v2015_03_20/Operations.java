/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20;

import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2015_03_20.implementation.OperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Operations.
 */
public interface Operations extends HasInner<OperationsInner> {
    /**
     * Lists all of the available OperationalInsights Rest API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationListResult> listAsync();

}
