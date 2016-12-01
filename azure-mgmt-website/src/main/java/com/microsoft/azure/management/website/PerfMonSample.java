/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.website;

import org.joda.time.DateTime;

/**
 * Performance monitor sample in a set.
 */
public class PerfMonSample {
    /**
     * Point in time for which counter was measured.
     */
    private DateTime time;

    /**
     * Name of the server on which the measurement is made.
     */
    private String instanceName;

    /**
     * Value of counter at a certain time.
     */
    private Double value;

    /**
     * Get the time value.
     *
     * @return the time value
     */
    public DateTime time() {
        return this.time;
    }

    /**
     * Set the time value.
     *
     * @param time the time value to set
     * @return the PerfMonSample object itself.
     */
    public PerfMonSample withTime(DateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get the instanceName value.
     *
     * @return the instanceName value
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Set the instanceName value.
     *
     * @param instanceName the instanceName value to set
     * @return the PerfMonSample object itself.
     */
    public PerfMonSample withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the PerfMonSample object itself.
     */
    public PerfMonSample withValue(Double value) {
        this.value = value;
        return this;
    }

}
