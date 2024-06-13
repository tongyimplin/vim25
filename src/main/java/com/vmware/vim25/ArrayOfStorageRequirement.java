package com.vmware.vim25;

import com.vmware.vim25.ArrayOfStorageRequirement;
import com.vmware.vim25.StorageRequirement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStorageRequirement", propOrder = {"storageRequirement"})
public class ArrayOfStorageRequirement {
  @XmlElement(name = "StorageRequirement")
  protected List<StorageRequirement> storageRequirement;
  
  public List<StorageRequirement> getStorageRequirement() {
    if (this.storageRequirement == null)
      this.storageRequirement = new ArrayList<>(); 
    return this.storageRequirement;
  }
}
