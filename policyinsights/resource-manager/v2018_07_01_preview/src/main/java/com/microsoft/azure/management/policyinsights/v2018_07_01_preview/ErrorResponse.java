/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response.
 */
public class ErrorResponse {
    /**
     * The error details.
     */
    @JsonProperty(value = "error")
    private ErrorDefinition error;

    /**
     * Get the error details.
     *
     * @return the error value
     */
    public ErrorDefinition error() {
        return this.error;
    }

    /**
     * Set the error details.
     *
     * @param error the error value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorDefinition error) {
        this.error = error;
        return this;
    }

}
