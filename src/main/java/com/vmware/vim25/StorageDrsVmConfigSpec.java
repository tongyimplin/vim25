package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.StorageDrsVmConfigInfo;
import com.vmware.vim25.StorageDrsVmConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsVmConfigSpec", propOrder = {"info"})
public class StorageDrsVmConfigSpec extends ArrayUpdateSpec {
  protected StorageDrsVmConfigInfo info;
  
  public StorageDrsVmConfigInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(StorageDrsVmConfigInfo paramStorageDrsVmConfigInfo) {
    this.info = paramStorageDrsVmConfigInfo;
  }
}
