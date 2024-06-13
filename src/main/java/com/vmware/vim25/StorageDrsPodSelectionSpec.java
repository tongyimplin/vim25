package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StorageDrsPodSelectionSpec;
import com.vmware.vim25.VmPodConfigForPlacement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsPodSelectionSpec", propOrder = {"initialVmConfig", "storagePod"})
public class StorageDrsPodSelectionSpec extends DynamicData {
  protected List<VmPodConfigForPlacement> initialVmConfig;
  
  protected ManagedObjectReference storagePod;
  
  public List<VmPodConfigForPlacement> getInitialVmConfig() {
    if (this.initialVmConfig == null)
      this.initialVmConfig = new ArrayList<>(); 
    return this.initialVmConfig;
  }
  
  public ManagedObjectReference getStoragePod() {
    return this.storagePod;
  }
  
  public void setStoragePod(ManagedObjectReference paramManagedObjectReference) {
    this.storagePod = paramManagedObjectReference;
  }
}
