/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Description of an hostingEnvironment (App Service Environment).
 */
@JsonFlatten
public class HostingEnvironment extends Resource {
    /**
     * Name of the hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.name")
    private String hostingEnvironmentName;

    /**
     * Location of the hostingEnvironment (App Service Environment), e.g.
     * "West US".
     */
    @JsonProperty(value = "properties.location")
    private String hostingEnvironmentLocation;

    /**
     * Current status of the hostingEnvironment (App Service Environment).
     * Possible values include: 'Preparing', 'Ready', 'Scaling', 'Deleting'.
     */
    @JsonProperty(value = "properties.status")
    private HostingEnvironmentStatus status;

    /**
     * Name of the hostingEnvironment's (App Service Environment) virtual
     * network.
     */
    @JsonProperty(value = "properties.vnetName")
    private String vnetName;

    /**
     * Resource group of the hostingEnvironment's (App Service Environment)
     * virtual network.
     */
    @JsonProperty(value = "properties.vnetResourceGroupName")
    private String vnetResourceGroupName;

    /**
     * Subnet of the hostingEnvironment's (App Service Environment) virtual
     * network.
     */
    @JsonProperty(value = "properties.vnetSubnetName")
    private String vnetSubnetName;

    /**
     * Description of the hostingEnvironment's (App Service Environment)
     * virtual network.
     */
    @JsonProperty(value = "properties.virtualNetwork")
    private VirtualNetworkProfile virtualNetwork;

    /**
     * Specifies which endpoints to serve internally in the
     * hostingEnvironment's (App Service Environment) VNET. Possible values
     * include: 'None', 'Web', 'Publishing'.
     */
    @JsonProperty(value = "properties.internalLoadBalancingMode")
    private InternalLoadBalancingMode internalLoadBalancingMode;

    /**
     * Front-end VM size, e.g. "Medium", "Large".
     */
    @JsonProperty(value = "properties.multiSize")
    private String multiSize;

    /**
     * Number of front-end instances.
     */
    @JsonProperty(value = "properties.multiRoleCount")
    private Integer multiRoleCount;

    /**
     * Description of worker pools with worker size ids, VM sizes, and number
     * of workers in each pool.
     */
    @JsonProperty(value = "properties.workerPools")
    private List<WorkerPool> workerPools;

    /**
     * Number of IP SSL addresses reserved for this hostingEnvironment (App
     * Service Environment).
     */
    @JsonProperty(value = "properties.ipsslAddressCount")
    private Integer ipsslAddressCount;

    /**
     * Edition of the metadata database for the hostingEnvironment (App
     * Service Environment) e.g. "Standard".
     */
    @JsonProperty(value = "properties.databaseEdition")
    private String databaseEdition;

    /**
     * Service objective of the metadata database for the hostingEnvironment
     * (App Service Environment) e.g. "S0".
     */
    @JsonProperty(value = "properties.databaseServiceObjective")
    private String databaseServiceObjective;

    /**
     * Number of upgrade domains of this hostingEnvironment (App Service
     * Environment).
     */
    @JsonProperty(value = "properties.upgradeDomains")
    private Integer upgradeDomains;

    /**
     * Subscription of the hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.subscriptionId")
    private String subscriptionId;

    /**
     * DNS suffix of the hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.dnsSuffix")
    private String dnsSuffix;

    /**
     * Last deployment action on this hostingEnvironment (App Service
     * Environment).
     */
    @JsonProperty(value = "properties.lastAction")
    private String lastAction;

    /**
     * Result of the last deployment action on this hostingEnvironment (App
     * Service Environment).
     */
    @JsonProperty(value = "properties.lastActionResult")
    private String lastActionResult;

    /**
     * List of comma separated strings describing which VM sizes are allowed
     * for front-ends.
     */
    @JsonProperty(value = "properties.allowedMultiSizes")
    private String allowedMultiSizes;

    /**
     * List of comma separated strings describing which VM sizes are allowed
     * for workers.
     */
    @JsonProperty(value = "properties.allowedWorkerSizes")
    private String allowedWorkerSizes;

    /**
     * Maximum number of VMs in this hostingEnvironment (App Service
     * Environment).
     */
    @JsonProperty(value = "properties.maximumNumberOfMachines")
    private Integer maximumNumberOfMachines;

    /**
     * Description of IP SSL mapping for this hostingEnvironment (App Service
     * Environment).
     */
    @JsonProperty(value = "properties.vipMappings")
    private List<VirtualIPMapping> vipMappings;

    /**
     * Current total, used, and available worker capacities.
     */
    @JsonProperty(value = "properties.environmentCapacities")
    private List<StampCapacity> environmentCapacities;

    /**
     * Access control list for controlling traffic to the hostingEnvironment
     * (App Service Environment).
     */
    @JsonProperty(value = "properties.networkAccessControlList")
    private List<NetworkAccessControlEntry> networkAccessControlList;

    /**
     * True/false indicating whether the hostingEnvironment (App Service
     * Environment) is healthy.
     */
    @JsonProperty(value = "properties.environmentIsHealthy")
    private Boolean environmentIsHealthy;

    /**
     * Detailed message about with results of the last check of the
     * hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.environmentStatus")
    private String environmentStatus;

    /**
     * Resource group of the hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.resourceGroup")
    private String resourceGroup;

    /**
     * Api Management Account associated with this Hosting Environment.
     */
    @JsonProperty(value = "properties.apiManagementAccountId")
    private String apiManagementAccountId;

    /**
     * True/false indicating whether the hostingEnvironment is suspended. The
     * environment can be suspended e.g. when the management endpoint is no
     * longer available
     * (most likely because NSG blocked the incoming traffic).
     */
    @JsonProperty(value = "properties.suspended")
    private Boolean suspended;

    /**
     * Get the hostingEnvironmentName value.
     *
     * @return the hostingEnvironmentName value
     */
    public String getHostingEnvironmentName() {
        return this.hostingEnvironmentName;
    }

    /**
     * Set the hostingEnvironmentName value.
     *
     * @param hostingEnvironmentName the hostingEnvironmentName value to set
     */
    public void setHostingEnvironmentName(String hostingEnvironmentName) {
        this.hostingEnvironmentName = hostingEnvironmentName;
    }

    /**
     * Get the hostingEnvironmentLocation value.
     *
     * @return the hostingEnvironmentLocation value
     */
    public String getHostingEnvironmentLocation() {
        return this.hostingEnvironmentLocation;
    }

    /**
     * Set the hostingEnvironmentLocation value.
     *
     * @param hostingEnvironmentLocation the hostingEnvironmentLocation value to set
     */
    public void setHostingEnvironmentLocation(String hostingEnvironmentLocation) {
        this.hostingEnvironmentLocation = hostingEnvironmentLocation;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public HostingEnvironmentStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     */
    public void setStatus(HostingEnvironmentStatus status) {
        this.status = status;
    }

    /**
     * Get the vnetName value.
     *
     * @return the vnetName value
     */
    public String getVnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName value.
     *
     * @param vnetName the vnetName value to set
     */
    public void setVnetName(String vnetName) {
        this.vnetName = vnetName;
    }

    /**
     * Get the vnetResourceGroupName value.
     *
     * @return the vnetResourceGroupName value
     */
    public String getVnetResourceGroupName() {
        return this.vnetResourceGroupName;
    }

    /**
     * Set the vnetResourceGroupName value.
     *
     * @param vnetResourceGroupName the vnetResourceGroupName value to set
     */
    public void setVnetResourceGroupName(String vnetResourceGroupName) {
        this.vnetResourceGroupName = vnetResourceGroupName;
    }

    /**
     * Get the vnetSubnetName value.
     *
     * @return the vnetSubnetName value
     */
    public String getVnetSubnetName() {
        return this.vnetSubnetName;
    }

    /**
     * Set the vnetSubnetName value.
     *
     * @param vnetSubnetName the vnetSubnetName value to set
     */
    public void setVnetSubnetName(String vnetSubnetName) {
        this.vnetSubnetName = vnetSubnetName;
    }

    /**
     * Get the virtualNetwork value.
     *
     * @return the virtualNetwork value
     */
    public VirtualNetworkProfile getVirtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork value.
     *
     * @param virtualNetwork the virtualNetwork value to set
     */
    public void setVirtualNetwork(VirtualNetworkProfile virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
    }

    /**
     * Get the internalLoadBalancingMode value.
     *
     * @return the internalLoadBalancingMode value
     */
    public InternalLoadBalancingMode getInternalLoadBalancingMode() {
        return this.internalLoadBalancingMode;
    }

    /**
     * Set the internalLoadBalancingMode value.
     *
     * @param internalLoadBalancingMode the internalLoadBalancingMode value to set
     */
    public void setInternalLoadBalancingMode(InternalLoadBalancingMode internalLoadBalancingMode) {
        this.internalLoadBalancingMode = internalLoadBalancingMode;
    }

    /**
     * Get the multiSize value.
     *
     * @return the multiSize value
     */
    public String getMultiSize() {
        return this.multiSize;
    }

    /**
     * Set the multiSize value.
     *
     * @param multiSize the multiSize value to set
     */
    public void setMultiSize(String multiSize) {
        this.multiSize = multiSize;
    }

    /**
     * Get the multiRoleCount value.
     *
     * @return the multiRoleCount value
     */
    public Integer getMultiRoleCount() {
        return this.multiRoleCount;
    }

    /**
     * Set the multiRoleCount value.
     *
     * @param multiRoleCount the multiRoleCount value to set
     */
    public void setMultiRoleCount(Integer multiRoleCount) {
        this.multiRoleCount = multiRoleCount;
    }

    /**
     * Get the workerPools value.
     *
     * @return the workerPools value
     */
    public List<WorkerPool> getWorkerPools() {
        return this.workerPools;
    }

    /**
     * Set the workerPools value.
     *
     * @param workerPools the workerPools value to set
     */
    public void setWorkerPools(List<WorkerPool> workerPools) {
        this.workerPools = workerPools;
    }

    /**
     * Get the ipsslAddressCount value.
     *
     * @return the ipsslAddressCount value
     */
    public Integer getIpsslAddressCount() {
        return this.ipsslAddressCount;
    }

    /**
     * Set the ipsslAddressCount value.
     *
     * @param ipsslAddressCount the ipsslAddressCount value to set
     */
    public void setIpsslAddressCount(Integer ipsslAddressCount) {
        this.ipsslAddressCount = ipsslAddressCount;
    }

    /**
     * Get the databaseEdition value.
     *
     * @return the databaseEdition value
     */
    public String getDatabaseEdition() {
        return this.databaseEdition;
    }

    /**
     * Set the databaseEdition value.
     *
     * @param databaseEdition the databaseEdition value to set
     */
    public void setDatabaseEdition(String databaseEdition) {
        this.databaseEdition = databaseEdition;
    }

    /**
     * Get the databaseServiceObjective value.
     *
     * @return the databaseServiceObjective value
     */
    public String getDatabaseServiceObjective() {
        return this.databaseServiceObjective;
    }

    /**
     * Set the databaseServiceObjective value.
     *
     * @param databaseServiceObjective the databaseServiceObjective value to set
     */
    public void setDatabaseServiceObjective(String databaseServiceObjective) {
        this.databaseServiceObjective = databaseServiceObjective;
    }

    /**
     * Get the upgradeDomains value.
     *
     * @return the upgradeDomains value
     */
    public Integer getUpgradeDomains() {
        return this.upgradeDomains;
    }

    /**
     * Set the upgradeDomains value.
     *
     * @param upgradeDomains the upgradeDomains value to set
     */
    public void setUpgradeDomains(Integer upgradeDomains) {
        this.upgradeDomains = upgradeDomains;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Get the dnsSuffix value.
     *
     * @return the dnsSuffix value
     */
    public String getDnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Set the dnsSuffix value.
     *
     * @param dnsSuffix the dnsSuffix value to set
     */
    public void setDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
    }

    /**
     * Get the lastAction value.
     *
     * @return the lastAction value
     */
    public String getLastAction() {
        return this.lastAction;
    }

    /**
     * Set the lastAction value.
     *
     * @param lastAction the lastAction value to set
     */
    public void setLastAction(String lastAction) {
        this.lastAction = lastAction;
    }

    /**
     * Get the lastActionResult value.
     *
     * @return the lastActionResult value
     */
    public String getLastActionResult() {
        return this.lastActionResult;
    }

    /**
     * Set the lastActionResult value.
     *
     * @param lastActionResult the lastActionResult value to set
     */
    public void setLastActionResult(String lastActionResult) {
        this.lastActionResult = lastActionResult;
    }

    /**
     * Get the allowedMultiSizes value.
     *
     * @return the allowedMultiSizes value
     */
    public String getAllowedMultiSizes() {
        return this.allowedMultiSizes;
    }

    /**
     * Set the allowedMultiSizes value.
     *
     * @param allowedMultiSizes the allowedMultiSizes value to set
     */
    public void setAllowedMultiSizes(String allowedMultiSizes) {
        this.allowedMultiSizes = allowedMultiSizes;
    }

    /**
     * Get the allowedWorkerSizes value.
     *
     * @return the allowedWorkerSizes value
     */
    public String getAllowedWorkerSizes() {
        return this.allowedWorkerSizes;
    }

    /**
     * Set the allowedWorkerSizes value.
     *
     * @param allowedWorkerSizes the allowedWorkerSizes value to set
     */
    public void setAllowedWorkerSizes(String allowedWorkerSizes) {
        this.allowedWorkerSizes = allowedWorkerSizes;
    }

    /**
     * Get the maximumNumberOfMachines value.
     *
     * @return the maximumNumberOfMachines value
     */
    public Integer getMaximumNumberOfMachines() {
        return this.maximumNumberOfMachines;
    }

    /**
     * Set the maximumNumberOfMachines value.
     *
     * @param maximumNumberOfMachines the maximumNumberOfMachines value to set
     */
    public void setMaximumNumberOfMachines(Integer maximumNumberOfMachines) {
        this.maximumNumberOfMachines = maximumNumberOfMachines;
    }

    /**
     * Get the vipMappings value.
     *
     * @return the vipMappings value
     */
    public List<VirtualIPMapping> getVipMappings() {
        return this.vipMappings;
    }

    /**
     * Set the vipMappings value.
     *
     * @param vipMappings the vipMappings value to set
     */
    public void setVipMappings(List<VirtualIPMapping> vipMappings) {
        this.vipMappings = vipMappings;
    }

    /**
     * Get the environmentCapacities value.
     *
     * @return the environmentCapacities value
     */
    public List<StampCapacity> getEnvironmentCapacities() {
        return this.environmentCapacities;
    }

    /**
     * Set the environmentCapacities value.
     *
     * @param environmentCapacities the environmentCapacities value to set
     */
    public void setEnvironmentCapacities(List<StampCapacity> environmentCapacities) {
        this.environmentCapacities = environmentCapacities;
    }

    /**
     * Get the networkAccessControlList value.
     *
     * @return the networkAccessControlList value
     */
    public List<NetworkAccessControlEntry> getNetworkAccessControlList() {
        return this.networkAccessControlList;
    }

    /**
     * Set the networkAccessControlList value.
     *
     * @param networkAccessControlList the networkAccessControlList value to set
     */
    public void setNetworkAccessControlList(List<NetworkAccessControlEntry> networkAccessControlList) {
        this.networkAccessControlList = networkAccessControlList;
    }

    /**
     * Get the environmentIsHealthy value.
     *
     * @return the environmentIsHealthy value
     */
    public Boolean getEnvironmentIsHealthy() {
        return this.environmentIsHealthy;
    }

    /**
     * Set the environmentIsHealthy value.
     *
     * @param environmentIsHealthy the environmentIsHealthy value to set
     */
    public void setEnvironmentIsHealthy(Boolean environmentIsHealthy) {
        this.environmentIsHealthy = environmentIsHealthy;
    }

    /**
     * Get the environmentStatus value.
     *
     * @return the environmentStatus value
     */
    public String getEnvironmentStatus() {
        return this.environmentStatus;
    }

    /**
     * Set the environmentStatus value.
     *
     * @param environmentStatus the environmentStatus value to set
     */
    public void setEnvironmentStatus(String environmentStatus) {
        this.environmentStatus = environmentStatus;
    }

    /**
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup value.
     *
     * @param resourceGroup the resourceGroup value to set
     */
    public void setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    /**
     * Get the apiManagementAccountId value.
     *
     * @return the apiManagementAccountId value
     */
    public String getApiManagementAccountId() {
        return this.apiManagementAccountId;
    }

    /**
     * Set the apiManagementAccountId value.
     *
     * @param apiManagementAccountId the apiManagementAccountId value to set
     */
    public void setApiManagementAccountId(String apiManagementAccountId) {
        this.apiManagementAccountId = apiManagementAccountId;
    }

    /**
     * Get the suspended value.
     *
     * @return the suspended value
     */
    public Boolean getSuspended() {
        return this.suspended;
    }

    /**
     * Set the suspended value.
     *
     * @param suspended the suspended value to set
     */
    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

}