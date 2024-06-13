package com.vmware.vim25;

import com.vmware.vim25.ArrayOfStorageDrsVmConfigSpec;
import com.vmware.vim25.StorageDrsVmConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStorageDrsVmConfigSpec", propOrder = {"storageDrsVmConfigSpec"})
public class ArrayOfStorageDrsVmConfigSpec {
  @XmlElement(name = "StorageDrsVmConfigSpec")
  protected List<StorageDrsVmConfigSpec> storageDrsVmConfigSpec;
  
  public List<StorageDrsVmConfigSpec> getStorageDrsVmConfigSpec() {
    if (this.storageDrsVmConfigSpec == null)
      this.storageDrsVmConfigSpec = new ArrayList<>(); 
    return this.storageDrsVmConfigSpec;
  }
}
