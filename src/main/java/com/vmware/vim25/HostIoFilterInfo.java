package com.vmware.vim25;

import com.vmware.vim25.HostIoFilterInfo;
import com.vmware.vim25.IoFilterInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIoFilterInfo", propOrder = {"available"})
public class HostIoFilterInfo extends IoFilterInfo {
  protected boolean available;
  
  public boolean isAvailable() {
    return this.available;
  }
  
  public void setAvailable(boolean paramBoolean) {
    this.available = paramBoolean;
  }
}
