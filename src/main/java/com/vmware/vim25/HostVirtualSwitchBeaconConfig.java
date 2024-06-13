package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualSwitchBeaconConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchBeaconConfig", propOrder = {"interval"})
public class HostVirtualSwitchBeaconConfig extends DynamicData {
  protected int interval;
  
  public int getInterval() {
    return this.interval;
  }
  
  public void setInterval(int paramInt) {
    this.interval = paramInt;
  }
}
