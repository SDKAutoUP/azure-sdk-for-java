/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VirtualMachinePriorityTypes.
 */
public final class VirtualMachinePriorityTypes extends ExpandableStringEnum<VirtualMachinePriorityTypes> {
    /** Static value Regular for VirtualMachinePriorityTypes. */
    public static final VirtualMachinePriorityTypes REGULAR = fromString("Regular");

    /** Static value Low for VirtualMachinePriorityTypes. */
    public static final VirtualMachinePriorityTypes LOW = fromString("Low");

    /** Static value Spot for VirtualMachinePriorityTypes. */
    public static final VirtualMachinePriorityTypes SPOT = fromString("Spot");

    /**
     * Creates or finds a VirtualMachinePriorityTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding VirtualMachinePriorityTypes
     */
    @JsonCreator
    public static VirtualMachinePriorityTypes fromString(String name) {
        return fromString(name, VirtualMachinePriorityTypes.class);
    }

    /**
     * @return known VirtualMachinePriorityTypes values
     */
    public static Collection<VirtualMachinePriorityTypes> values() {
        return values(VirtualMachinePriorityTypes.class);
    }
}