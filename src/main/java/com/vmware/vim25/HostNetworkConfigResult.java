package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetworkConfigResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkConfigResult", propOrder = {"vnicDevice", "consoleVnicDevice"})
public class HostNetworkConfigResult extends DynamicData {
  protected List<String> vnicDevice;
  
  protected List<String> consoleVnicDevice;
  
  public List<String> getVnicDevice() {
    if (this.vnicDevice == null)
      this.vnicDevice = new ArrayList<>(); 
    return this.vnicDevice;
  }
  
  public List<String> getConsoleVnicDevice() {
    if (this.consoleVnicDevice == null)
      this.consoleVnicDevice = new ArrayList<>(); 
    return this.consoleVnicDevice;
  }
}
