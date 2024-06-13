package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVmfsDatastoreOption;
import com.vmware.vim25.VmfsDatastoreOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVmfsDatastoreOption", propOrder = {"vmfsDatastoreOption"})
public class ArrayOfVmfsDatastoreOption {
  @XmlElement(name = "VmfsDatastoreOption")
  protected List<VmfsDatastoreOption> vmfsDatastoreOption;
  
  public List<VmfsDatastoreOption> getVmfsDatastoreOption() {
    if (this.vmfsDatastoreOption == null)
      this.vmfsDatastoreOption = new ArrayList<>(); 
    return this.vmfsDatastoreOption;
  }
}
