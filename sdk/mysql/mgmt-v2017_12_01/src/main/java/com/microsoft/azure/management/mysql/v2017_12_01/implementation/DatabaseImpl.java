/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01.implementation;

import com.microsoft.azure.management.mysql.v2017_12_01.Database;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class DatabaseImpl extends CreatableUpdatableImpl<Database, DatabaseInner, DatabaseImpl> implements Database, Database.Definition, Database.Update {
    private final DBForMySQLManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;

    DatabaseImpl(String name, DBForMySQLManager manager) {
        super(name, new DatabaseInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
    }

    DatabaseImpl(DatabaseInner inner, DBForMySQLManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
    }

    @Override
    public DBForMySQLManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Database> createResourceAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Database> updateResourceAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DatabaseInner> getInnerAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String charset() {
        return this.inner().charset();
    }

    @Override
    public String collation() {
        return this.inner().collation();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DatabaseImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public DatabaseImpl withCharset(String charset) {
        this.inner().withCharset(charset);
        return this;
    }

    @Override
    public DatabaseImpl withCollation(String collation) {
        this.inner().withCollation(collation);
        return this;
    }

}
