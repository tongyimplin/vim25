package com.vmware.vim25;

import com.vmware.vim25.DVSContactInfo;
import com.vmware.vim25.DVSSummary;
import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSSummary", propOrder = {"name", "uuid", "numPorts", "productInfo", "hostMember", "vm", "host", "portgroupName", "description", "contact", "numHosts"})
public class DVSSummary extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String uuid;
  
  protected int numPorts;
  
  protected DistributedVirtualSwitchProductSpec productInfo;
  
  protected List<ManagedObjectReference> hostMember;
  
  protected List<ManagedObjectReference> vm;
  
  protected List<ManagedObjectReference> host;
  
  protected List<String> portgroupName;
  
  protected String description;
  
  protected DVSContactInfo contact;
  
  protected Integer numHosts;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public int getNumPorts() {
    return this.numPorts;
  }
  
  public void setNumPorts(int paramInt) {
    this.numPorts = paramInt;
  }
  
  public DistributedVirtualSwitchProductSpec getProductInfo() {
    return this.productInfo;
  }
  
  public void setProductInfo(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.productInfo = paramDistributedVirtualSwitchProductSpec;
  }
  
  public List<ManagedObjectReference> getHostMember() {
    if (this.hostMember == null)
      this.hostMember = new ArrayList<>(); 
    return this.hostMember;
  }
  
  public List<ManagedObjectReference> getVm() {
    if (this.vm == null)
      this.vm = new ArrayList<>(); 
    return this.vm;
  }
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
  
  public List<String> getPortgroupName() {
    if (this.portgroupName == null)
      this.portgroupName = new ArrayList<>(); 
    return this.portgroupName;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public DVSContactInfo getContact() {
    return this.contact;
  }
  
  public void setContact(DVSContactInfo paramDVSContactInfo) {
    this.contact = paramDVSContactInfo;
  }
  
  public Integer getNumHosts() {
    return this.numHosts;
  }
  
  public void setNumHosts(Integer paramInteger) {
    this.numHosts = paramInteger;
  }
}
