/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProductTransferStatus.
 */
public final class ProductTransferStatus extends ExpandableStringEnum<ProductTransferStatus> {
    /** Static value NotStarted for ProductTransferStatus. */
    public static final ProductTransferStatus NOT_STARTED = fromString("NotStarted");

    /** Static value InProgress for ProductTransferStatus. */
    public static final ProductTransferStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for ProductTransferStatus. */
    public static final ProductTransferStatus COMPLETED = fromString("Completed");

    /** Static value Failed for ProductTransferStatus. */
    public static final ProductTransferStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a ProductTransferStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding ProductTransferStatus
     */
    @JsonCreator
    public static ProductTransferStatus fromString(String name) {
        return fromString(name, ProductTransferStatus.class);
    }

    /**
     * @return known ProductTransferStatus values
     */
    public static Collection<ProductTransferStatus> values() {
        return values(ProductTransferStatus.class);
    }
}
