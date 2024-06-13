package com.vmware.vim25;

import com.vmware.vim25.ArrayOfStorageDrsPlacementRankVmSpec;
import com.vmware.vim25.StorageDrsPlacementRankVmSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStorageDrsPlacementRankVmSpec", propOrder = {"storageDrsPlacementRankVmSpec"})
public class ArrayOfStorageDrsPlacementRankVmSpec {
  @XmlElement(name = "StorageDrsPlacementRankVmSpec")
  protected List<StorageDrsPlacementRankVmSpec> storageDrsPlacementRankVmSpec;
  
  public List<StorageDrsPlacementRankVmSpec> getStorageDrsPlacementRankVmSpec() {
    if (this.storageDrsPlacementRankVmSpec == null)
      this.storageDrsPlacementRankVmSpec = new ArrayList<>(); 
    return this.storageDrsPlacementRankVmSpec;
  }
}
