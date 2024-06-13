package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchManagerImportResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ImportOperationBulkFaultFaultOnImport;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerImportResult", propOrder = {"distributedVirtualSwitch", "distributedVirtualPortgroup", "importFault"})
public class DistributedVirtualSwitchManagerImportResult extends DynamicData {
  protected List<ManagedObjectReference> distributedVirtualSwitch;
  
  protected List<ManagedObjectReference> distributedVirtualPortgroup;
  
  protected List<ImportOperationBulkFaultFaultOnImport> importFault;
  
  public List<ManagedObjectReference> getDistributedVirtualSwitch() {
    if (this.distributedVirtualSwitch == null)
      this.distributedVirtualSwitch = new ArrayList<>(); 
    return this.distributedVirtualSwitch;
  }
  
  public List<ManagedObjectReference> getDistributedVirtualPortgroup() {
    if (this.distributedVirtualPortgroup == null)
      this.distributedVirtualPortgroup = new ArrayList<>(); 
    return this.distributedVirtualPortgroup;
  }
  
  public List<ImportOperationBulkFaultFaultOnImport> getImportFault() {
    if (this.importFault == null)
      this.importFault = new ArrayList<>(); 
    return this.importFault;
  }
}
