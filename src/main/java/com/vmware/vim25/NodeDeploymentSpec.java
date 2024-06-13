package com.vmware.vim25;

import com.vmware.vim25.CustomizationIPSettings;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NodeDeploymentSpec;
import com.vmware.vim25.PassiveNodeDeploymentSpec;
import com.vmware.vim25.ServiceLocator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeDeploymentSpec", propOrder = {"esxHost", "datastore", "publicNetworkPortGroup", "clusterNetworkPortGroup", "folder", "resourcePool", "managementVc", "nodeName", "ipSettings"})
@XmlSeeAlso({PassiveNodeDeploymentSpec.class})
public class NodeDeploymentSpec extends DynamicData {
  protected ManagedObjectReference esxHost;
  
  protected ManagedObjectReference datastore;
  
  protected ManagedObjectReference publicNetworkPortGroup;
  
  protected ManagedObjectReference clusterNetworkPortGroup;
  
  @XmlElement(required = true)
  protected ManagedObjectReference folder;
  
  protected ManagedObjectReference resourcePool;
  
  protected ServiceLocator managementVc;
  
  @XmlElement(required = true)
  protected String nodeName;
  
  @XmlElement(required = true)
  protected CustomizationIPSettings ipSettings;
  
  public ManagedObjectReference getEsxHost() {
    return this.esxHost;
  }
  
  public void setEsxHost(ManagedObjectReference paramManagedObjectReference) {
    this.esxHost = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPublicNetworkPortGroup() {
    return this.publicNetworkPortGroup;
  }
  
  public void setPublicNetworkPortGroup(ManagedObjectReference paramManagedObjectReference) {
    this.publicNetworkPortGroup = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getClusterNetworkPortGroup() {
    return this.clusterNetworkPortGroup;
  }
  
  public void setClusterNetworkPortGroup(ManagedObjectReference paramManagedObjectReference) {
    this.clusterNetworkPortGroup = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getFolder() {
    return this.folder;
  }
  
  public void setFolder(ManagedObjectReference paramManagedObjectReference) {
    this.folder = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getResourcePool() {
    return this.resourcePool;
  }
  
  public void setResourcePool(ManagedObjectReference paramManagedObjectReference) {
    this.resourcePool = paramManagedObjectReference;
  }
  
  public ServiceLocator getManagementVc() {
    return this.managementVc;
  }
  
  public void setManagementVc(ServiceLocator paramServiceLocator) {
    this.managementVc = paramServiceLocator;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public void setNodeName(String paramString) {
    this.nodeName = paramString;
  }
  
  public CustomizationIPSettings getIpSettings() {
    return this.ipSettings;
  }
  
  public void setIpSettings(CustomizationIPSettings paramCustomizationIPSettings) {
    this.ipSettings = paramCustomizationIPSettings;
  }
}
