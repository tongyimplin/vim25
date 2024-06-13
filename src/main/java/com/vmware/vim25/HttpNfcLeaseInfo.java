package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HttpNfcLeaseDatastoreLeaseInfo;
import com.vmware.vim25.HttpNfcLeaseDeviceUrl;
import com.vmware.vim25.HttpNfcLeaseInfo;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseInfo", propOrder = {"lease", "entity", "deviceUrl", "totalDiskCapacityInKB", "leaseTimeout", "hostMap"})
public class HttpNfcLeaseInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference lease;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  protected List<HttpNfcLeaseDeviceUrl> deviceUrl;
  
  protected long totalDiskCapacityInKB;
  
  protected int leaseTimeout;
  
  protected List<HttpNfcLeaseDatastoreLeaseInfo> hostMap;
  
  public ManagedObjectReference getLease() {
    return this.lease;
  }
  
  public void setLease(ManagedObjectReference paramManagedObjectReference) {
    this.lease = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public List<HttpNfcLeaseDeviceUrl> getDeviceUrl() {
    if (this.deviceUrl == null)
      this.deviceUrl = new ArrayList<>(); 
    return this.deviceUrl;
  }
  
  public long getTotalDiskCapacityInKB() {
    return this.totalDiskCapacityInKB;
  }
  
  public void setTotalDiskCapacityInKB(long paramLong) {
    this.totalDiskCapacityInKB = paramLong;
  }
  
  public int getLeaseTimeout() {
    return this.leaseTimeout;
  }
  
  public void setLeaseTimeout(int paramInt) {
    this.leaseTimeout = paramInt;
  }
  
  public List<HttpNfcLeaseDatastoreLeaseInfo> getHostMap() {
    if (this.hostMap == null)
      this.hostMap = new ArrayList<>(); 
    return this.hostMap;
  }
}
