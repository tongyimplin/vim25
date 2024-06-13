package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ID;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VStorageObjectAssociations;
import com.vmware.vim25.VStorageObjectAssociationsVmDiskAssociations;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectAssociations", propOrder = {"id", "vmDiskAssociations", "fault"})
public class VStorageObjectAssociations extends DynamicData {
  @XmlElement(required = true)
  protected ID id;
  
  protected List<VStorageObjectAssociationsVmDiskAssociations> vmDiskAssociations;
  
  protected LocalizedMethodFault fault;
  
  public ID getId() {
    return this.id;
  }
  
  public void setId(ID paramID) {
    this.id = paramID;
  }
  
  public List<VStorageObjectAssociationsVmDiskAssociations> getVmDiskAssociations() {
    if (this.vmDiskAssociations == null)
      this.vmDiskAssociations = new ArrayList<>(); 
    return this.vmDiskAssociations;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
