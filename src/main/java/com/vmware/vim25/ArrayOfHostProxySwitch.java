package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostProxySwitch;
import com.vmware.vim25.HostProxySwitch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProxySwitch", propOrder = {"hostProxySwitch"})
public class ArrayOfHostProxySwitch {
  @XmlElement(name = "HostProxySwitch")
  protected List<HostProxySwitch> hostProxySwitch;
  
  public List<HostProxySwitch> getHostProxySwitch() {
    if (this.hostProxySwitch == null)
      this.hostProxySwitch = new ArrayList<>(); 
    return this.hostProxySwitch;
  }
}
