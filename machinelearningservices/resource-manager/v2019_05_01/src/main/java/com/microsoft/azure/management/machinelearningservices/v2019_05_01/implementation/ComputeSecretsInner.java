/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01.implementation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.machinelearningservices.v2019_05_01.AksComputeSecrets;
import com.microsoft.azure.management.machinelearningservices.v2019_05_01.DatabricksComputeSecrets;
import com.microsoft.azure.management.machinelearningservices.v2019_05_01.VirtualMachineSecrets;

/**
 * Secrets related to a Machine Learning compute. Might differ for every type
 * of compute.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("ComputeSecrets")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AKS", value = AksComputeSecrets.class),
    @JsonSubTypes.Type(name = "VirtualMachine", value = VirtualMachineSecrets.class),
    @JsonSubTypes.Type(name = "Databricks", value = DatabricksComputeSecrets.class)
})
public class ComputeSecretsInner {
}
