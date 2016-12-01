/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.website;


/**
 * SSL-enabled hostname.
 */
public class HostNameSslState {
    /**
     * Hostname.
     */
    private String name;

    /**
     * SSL type. Possible values include: 'Disabled', 'SniEnabled',
     * 'IpBasedEnabled'.
     */
    private SslState sslState;

    /**
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     */
    private String virtualIP;

    /**
     * SSL certificate thumbprint.
     */
    private String thumbprint;

    /**
     * Set to &lt;code&gt;true&lt;/code&gt; to update existing hostname.
     */
    private Boolean toUpdate;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the sslState value.
     *
     * @return the sslState value
     */
    public SslState sslState() {
        return this.sslState;
    }

    /**
     * Set the sslState value.
     *
     * @param sslState the sslState value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withSslState(SslState sslState) {
        this.sslState = sslState;
        return this;
    }

    /**
     * Get the virtualIP value.
     *
     * @return the virtualIP value
     */
    public String virtualIP() {
        return this.virtualIP;
    }

    /**
     * Set the virtualIP value.
     *
     * @param virtualIP the virtualIP value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withVirtualIP(String virtualIP) {
        this.virtualIP = virtualIP;
        return this;
    }

    /**
     * Get the thumbprint value.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint value.
     *
     * @param thumbprint the thumbprint value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the toUpdate value.
     *
     * @return the toUpdate value
     */
    public Boolean toUpdate() {
        return this.toUpdate;
    }

    /**
     * Set the toUpdate value.
     *
     * @param toUpdate the toUpdate value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withToUpdate(Boolean toUpdate) {
        this.toUpdate = toUpdate;
        return this;
    }

}
