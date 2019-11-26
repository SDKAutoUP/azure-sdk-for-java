/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_04_04;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Summary results.
 */
public class Summary {
    /**
     * OData entity ID; always set to null since summaries do not have an
     * entity ID.
     */
    @JsonProperty(value = "@odata\\.id")
    private String odataid;

    /**
     * OData context string; used by OData clients to resolve type information
     * based on metadata.
     */
    @JsonProperty(value = "@odata\\.context")
    private String odatacontext;

    /**
     * Non-compliance summary for all policy assignments.
     */
    @JsonProperty(value = "results")
    private SummaryResults results;

    /**
     * Policy assignments summary.
     */
    @JsonProperty(value = "policyAssignments")
    private List<PolicyAssignmentSummary> policyAssignments;

    /**
     * Get the odataid value.
     *
     * @return the odataid value
     */
    public String odataid() {
        return this.odataid;
    }

    /**
     * Set the odataid value.
     *
     * @param odataid the odataid value to set
     * @return the Summary object itself.
     */
    public Summary withOdataid(String odataid) {
        this.odataid = odataid;
        return this;
    }

    /**
     * Get the odatacontext value.
     *
     * @return the odatacontext value
     */
    public String odatacontext() {
        return this.odatacontext;
    }

    /**
     * Set the odatacontext value.
     *
     * @param odatacontext the odatacontext value to set
     * @return the Summary object itself.
     */
    public Summary withOdatacontext(String odatacontext) {
        this.odatacontext = odatacontext;
        return this;
    }

    /**
     * Get the results value.
     *
     * @return the results value
     */
    public SummaryResults results() {
        return this.results;
    }

    /**
     * Set the results value.
     *
     * @param results the results value to set
     * @return the Summary object itself.
     */
    public Summary withResults(SummaryResults results) {
        this.results = results;
        return this;
    }

    /**
     * Get the policyAssignments value.
     *
     * @return the policyAssignments value
     */
    public List<PolicyAssignmentSummary> policyAssignments() {
        return this.policyAssignments;
    }

    /**
     * Set the policyAssignments value.
     *
     * @param policyAssignments the policyAssignments value to set
     * @return the Summary object itself.
     */
    public Summary withPolicyAssignments(List<PolicyAssignmentSummary> policyAssignments) {
        this.policyAssignments = policyAssignments;
        return this;
    }

}