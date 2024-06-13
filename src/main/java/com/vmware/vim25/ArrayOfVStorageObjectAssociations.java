package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVStorageObjectAssociations;
import com.vmware.vim25.VStorageObjectAssociations;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVStorageObjectAssociations", propOrder = {"vStorageObjectAssociations"})
public class ArrayOfVStorageObjectAssociations {
  @XmlElement(name = "VStorageObjectAssociations")
  protected List<VStorageObjectAssociations> vStorageObjectAssociations;
  
  public List<VStorageObjectAssociations> getVStorageObjectAssociations() {
    if (this.vStorageObjectAssociations == null)
      this.vStorageObjectAssociations = new ArrayList<>(); 
    return this.vStorageObjectAssociations;
  }
}
