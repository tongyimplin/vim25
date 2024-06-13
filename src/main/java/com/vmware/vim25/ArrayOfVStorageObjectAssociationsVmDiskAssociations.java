package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVStorageObjectAssociationsVmDiskAssociations;
import com.vmware.vim25.VStorageObjectAssociationsVmDiskAssociations;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVStorageObjectAssociationsVmDiskAssociations", propOrder = {"vStorageObjectAssociationsVmDiskAssociations"})
public class ArrayOfVStorageObjectAssociationsVmDiskAssociations {
  @XmlElement(name = "VStorageObjectAssociationsVmDiskAssociations")
  protected List<VStorageObjectAssociationsVmDiskAssociations> vStorageObjectAssociationsVmDiskAssociations;
  
  public List<VStorageObjectAssociationsVmDiskAssociations> getVStorageObjectAssociationsVmDiskAssociations() {
    if (this.vStorageObjectAssociationsVmDiskAssociations == null)
      this.vStorageObjectAssociationsVmDiskAssociations = new ArrayList<>(); 
    return this.vStorageObjectAssociationsVmDiskAssociations;
  }
}
