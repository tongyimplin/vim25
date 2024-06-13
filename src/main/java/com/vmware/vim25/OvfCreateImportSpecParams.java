package com.vmware.vim25;

import com.vmware.vim25.KeyValue;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfConsumerOstNode;
import com.vmware.vim25.OvfCreateImportSpecParams;
import com.vmware.vim25.OvfManagerCommonParams;
import com.vmware.vim25.OvfNetworkMapping;
import com.vmware.vim25.OvfResourceMap;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfCreateImportSpecParams", propOrder = {"entityName", "hostSystem", "networkMapping", "ipAllocationPolicy", "ipProtocol", "propertyMapping", "resourceMapping", "diskProvisioning", "instantiationOst"})
public class OvfCreateImportSpecParams extends OvfManagerCommonParams {
  @XmlElement(required = true)
  protected String entityName;
  
  protected ManagedObjectReference hostSystem;
  
  protected List<OvfNetworkMapping> networkMapping;
  
  protected String ipAllocationPolicy;
  
  protected String ipProtocol;
  
  protected List<KeyValue> propertyMapping;
  
  protected List<OvfResourceMap> resourceMapping;
  
  protected String diskProvisioning;
  
  protected OvfConsumerOstNode instantiationOst;
  
  public String getEntityName() {
    return this.entityName;
  }
  
  public void setEntityName(String paramString) {
    this.entityName = paramString;
  }
  
  public ManagedObjectReference getHostSystem() {
    return this.hostSystem;
  }
  
  public void setHostSystem(ManagedObjectReference paramManagedObjectReference) {
    this.hostSystem = paramManagedObjectReference;
  }
  
  public List<OvfNetworkMapping> getNetworkMapping() {
    if (this.networkMapping == null)
      this.networkMapping = new ArrayList<>(); 
    return this.networkMapping;
  }
  
  public String getIpAllocationPolicy() {
    return this.ipAllocationPolicy;
  }
  
  public void setIpAllocationPolicy(String paramString) {
    this.ipAllocationPolicy = paramString;
  }
  
  public String getIpProtocol() {
    return this.ipProtocol;
  }
  
  public void setIpProtocol(String paramString) {
    this.ipProtocol = paramString;
  }
  
  public List<KeyValue> getPropertyMapping() {
    if (this.propertyMapping == null)
      this.propertyMapping = new ArrayList<>(); 
    return this.propertyMapping;
  }
  
  public List<OvfResourceMap> getResourceMapping() {
    if (this.resourceMapping == null)
      this.resourceMapping = new ArrayList<>(); 
    return this.resourceMapping;
  }
  
  public String getDiskProvisioning() {
    return this.diskProvisioning;
  }
  
  public void setDiskProvisioning(String paramString) {
    this.diskProvisioning = paramString;
  }
  
  public OvfConsumerOstNode getInstantiationOst() {
    return this.instantiationOst;
  }
  
  public void setInstantiationOst(OvfConsumerOstNode paramOvfConsumerOstNode) {
    this.instantiationOst = paramOvfConsumerOstNode;
  }
}
