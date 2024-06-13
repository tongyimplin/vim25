package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostBootDevice;
import com.vmware.vim25.HostBootDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostBootDeviceInfo", propOrder = {"bootDevices", "currentBootDeviceKey"})
public class HostBootDeviceInfo extends DynamicData {
  protected List<HostBootDevice> bootDevices;
  
  protected String currentBootDeviceKey;
  
  public List<HostBootDevice> getBootDevices() {
    if (this.bootDevices == null)
      this.bootDevices = new ArrayList<>(); 
    return this.bootDevices;
  }
  
  public String getCurrentBootDeviceKey() {
    return this.currentBootDeviceKey;
  }
  
  public void setCurrentBootDeviceKey(String paramString) {
    this.currentBootDeviceKey = paramString;
  }
}
