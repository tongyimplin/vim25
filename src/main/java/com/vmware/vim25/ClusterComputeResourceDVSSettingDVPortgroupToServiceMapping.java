package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping", propOrder = {"dvPortgroup", "service"})
public class ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference dvPortgroup;
  
  @XmlElement(required = true)
  protected String service;
  
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
