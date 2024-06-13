package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping;
import com.vmware.vim25.DVPortgroupConfigSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping", propOrder = {"dvPortgroupSpec", "dvPortgroup", "service"})
public class ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping extends DynamicData {
  protected DVPortgroupConfigSpec dvPortgroupSpec;
  
  protected ManagedObjectReference dvPortgroup;
  
  @XmlElement(required = true)
  protected String service;
  
  public DVPortgroupConfigSpec getDvPortgroupSpec() {
    return this.dvPortgroupSpec;
  }
  
  public void setDvPortgroupSpec(DVPortgroupConfigSpec paramDVPortgroupConfigSpec) {
    this.dvPortgroupSpec = paramDVPortgroupConfigSpec;
  }
  
  public ManagedObjectReference getDvPortgroup() {
    return this.dvPortgroup;
  }
  
  public void setDvPortgroup(ManagedObjectReference paramManagedObjectReference) {
    this.dvPortgroup = paramManagedObjectReference;
  }
  
  public String getService() {
    return this.service;
  }
  
  public void setService(String paramString) {
    this.service = paramString;
  }
}
