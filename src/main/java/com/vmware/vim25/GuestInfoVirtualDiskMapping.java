package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestInfoVirtualDiskMapping;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestInfoVirtualDiskMapping", propOrder = {"key"})
public class GuestInfoVirtualDiskMapping extends DynamicData {
  protected int key;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
}
