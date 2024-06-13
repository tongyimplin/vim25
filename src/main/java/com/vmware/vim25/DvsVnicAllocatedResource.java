package com.vmware.vim25;

import com.vmware.vim25.DvsVnicAllocatedResource;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsVnicAllocatedResource", propOrder = {"vm", "vnicKey", "reservation"})
public class DvsVnicAllocatedResource extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected String vnicKey;
  
  protected Long reservation;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public String getVnicKey() {
    return this.vnicKey;
  }
  
  public void setVnicKey(String paramString) {
    this.vnicKey = paramString;
  }
  
  public Long getReservation() {
    return this.reservation;
  }
  
  public void setReservation(Long paramLong) {
    this.reservation = paramLong;
  }
}
