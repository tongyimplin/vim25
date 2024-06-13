package com.vmware.vim25;

import com.vmware.vim25.HostHostBusAdapter;
import com.vmware.vim25.HostRdmaHba;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaHba", propOrder = {"associatedRdmaDevice"})
public class HostRdmaHba extends HostHostBusAdapter {
  protected String associatedRdmaDevice;
  
  public String getAssociatedRdmaDevice() {
    return this.associatedRdmaDevice;
  }
  
  public void setAssociatedRdmaDevice(String paramString) {
    this.associatedRdmaDevice = paramString;
  }
}
