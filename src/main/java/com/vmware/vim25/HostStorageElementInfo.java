package com.vmware.vim25;

import com.vmware.vim25.HostHardwareElementInfo;
import com.vmware.vim25.HostStorageElementInfo;
import com.vmware.vim25.HostStorageOperationalInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostStorageElementInfo", propOrder = {"operationalInfo"})
public class HostStorageElementInfo extends HostHardwareElementInfo {
  protected List<HostStorageOperationalInfo> operationalInfo;
  
  public List<HostStorageOperationalInfo> getOperationalInfo() {
    if (this.operationalInfo == null)
      this.operationalInfo = new ArrayList<>(); 
    return this.operationalInfo;
  }
}
