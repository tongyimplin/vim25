package com.vmware.vim25;

import com.vmware.vim25.ArrayOfStorageDrsVmConfigInfo;
import com.vmware.vim25.StorageDrsVmConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStorageDrsVmConfigInfo", propOrder = {"storageDrsVmConfigInfo"})
public class ArrayOfStorageDrsVmConfigInfo {
  @XmlElement(name = "StorageDrsVmConfigInfo")
  protected List<StorageDrsVmConfigInfo> storageDrsVmConfigInfo;
  
  public List<StorageDrsVmConfigInfo> getStorageDrsVmConfigInfo() {
    if (this.storageDrsVmConfigInfo == null)
      this.storageDrsVmConfigInfo = new ArrayList<>(); 
    return this.storageDrsVmConfigInfo;
  }
}
