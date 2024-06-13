package com.vmware.vim25;

import com.vmware.vim25.HostInventoryFull;
import com.vmware.vim25.NotEnoughLicenses;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInventoryFull", propOrder = {"capacity"})
public class HostInventoryFull extends NotEnoughLicenses {
  protected int capacity;
  
  public int getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(int paramInt) {
    this.capacity = paramInt;
  }
}
