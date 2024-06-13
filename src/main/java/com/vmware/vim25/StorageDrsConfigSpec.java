package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StorageDrsConfigSpec;
import com.vmware.vim25.StorageDrsPodConfigSpec;
import com.vmware.vim25.StorageDrsVmConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsConfigSpec", propOrder = {"podConfigSpec", "vmConfigSpec"})
public class StorageDrsConfigSpec extends DynamicData {
  protected StorageDrsPodConfigSpec podConfigSpec;
  
  protected List<StorageDrsVmConfigSpec> vmConfigSpec;
  
  public StorageDrsPodConfigSpec getPodConfigSpec() {
    return this.podConfigSpec;
  }
  
  public void setPodConfigSpec(StorageDrsPodConfigSpec paramStorageDrsPodConfigSpec) {
    this.podConfigSpec = paramStorageDrsPodConfigSpec;
  }
  
  public List<StorageDrsVmConfigSpec> getVmConfigSpec() {
    if (this.vmConfigSpec == null)
      this.vmConfigSpec = new ArrayList<>(); 
    return this.vmConfigSpec;
  }
}
