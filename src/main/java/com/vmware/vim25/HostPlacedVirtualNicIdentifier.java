package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPlacedVirtualNicIdentifier;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPlacedVirtualNicIdentifier", propOrder = {"vm", "vnicKey", "reservation"})
public class HostPlacedVirtualNicIdentifier extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected String vnicKey;
  
  protected Integer reservation;
  
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
  
  public Integer getReservation() {
    return this.reservation;
  }
  
  public void setReservation(Integer paramInteger) {
    this.reservation = paramInteger;
  }
}
