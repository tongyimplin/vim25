package com.vmware.vim25;

import com.vmware.vim25.HostInventoryFullEvent;
import com.vmware.vim25.LicenseEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInventoryFullEvent", propOrder = {"capacity"})
public class HostInventoryFullEvent extends LicenseEvent {
  protected int capacity;
  
  public int getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(int paramInt) {
    this.capacity = paramInt;
  }
}
