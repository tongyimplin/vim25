package com.vmware.vim25;

import com.vmware.vim25.ArrayOfStorageDrsOptionSpec;
import com.vmware.vim25.StorageDrsOptionSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStorageDrsOptionSpec", propOrder = {"storageDrsOptionSpec"})
public class ArrayOfStorageDrsOptionSpec {
  @XmlElement(name = "StorageDrsOptionSpec")
  protected List<StorageDrsOptionSpec> storageDrsOptionSpec;
  
  public List<StorageDrsOptionSpec> getStorageDrsOptionSpec() {
    if (this.storageDrsOptionSpec == null)
      this.storageDrsOptionSpec = new ArrayList<>(); 
    return this.storageDrsOptionSpec;
  }
}
