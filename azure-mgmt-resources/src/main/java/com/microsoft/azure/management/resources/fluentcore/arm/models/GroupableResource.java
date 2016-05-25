package com.microsoft.azure.management.resources.fluentcore.arm.models;

import com.microsoft.azure.management.resources.ResourceGroup;

public interface GroupableResource extends Resource {
	
	String resourceGroupName();

	interface DefinitionWithGroupContext<T> {
	}

	/**
	 * A resource definition allowing a resource group to be selected
	 */
	interface DefinitionWithGroup<T>  extends DefinitionWithGroupContext<T> {
		/**
		 * Associates the resources with an existing resource group.
		 * @param groupName the name of an existing resource group to put this resource in.
		 * @return the next stage of the resource definition
		 */
		T withExistingGroup(String groupName);

		/**
		 * Associates the resources with an existing resource group.
		 * @param group an existing resource group to put the resource in
		 * @return the next stage of the resource definition
		 */
		T withExistingGroup(ResourceGroup group);

		/**
		 * Creates a new resource group to put the resource in. 
		 * <p>
		 * The group will be created in the same location as the resource.
		 * @param name the name of the new group
		 * @return the next stage of the resource definition
		 */
		T withNewGroup(String name);
		
		/**
		 * Creates a new resource group to put the resource in. 
		 * <p>
		 * The group will be created in the same location as the resource. 
		 * The group's name is automatically derived from the resource's name.
		 * @return the next stage of the resource definition
		 */
		T withNewGroup();
		
		/**
		 * Creates a new resource group to put the resource in, based on the definition specified.
		 * @param groupDefinition a creatable definition for a new resource group
		 * @return the next stage of the resource definition
		 */
		T withNewGroup(ResourceGroup.DefinitionCreatable groupDefinition) throws Exception;
	}
}
