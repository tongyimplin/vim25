package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StorageDrsConfigInfo;
import com.vmware.vim25.StorageDrsPodConfigInfo;
import com.vmware.vim25.StorageDrsVmConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsConfigInfo", propOrder = {"podConfig", "vmConfig"})
public class StorageDrsConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected StorageDrsPodConfigInfo podConfig;
  
  protected List<StorageDrsVmConfigInfo> vmConfig;
  
  public StorageDrsPodConfigInfo getPodConfig() {
    return this.podConfig;
  }
  
  public void setPodConfig(StorageDrsPodConfigInfo paramStorageDrsPodConfigInfo) {
    this.podConfig = paramStorageDrsPodConfigInfo;
  }
  
  public List<StorageDrsVmConfigInfo> getVmConfig() {
    if (this.vmConfig == null)
      this.vmConfig = new ArrayList<>(); 
    return this.vmConfig;
  }
}
