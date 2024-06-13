package com.vmware.vim25;

import com.vmware.vim25.ArrayOfSoftwarePackage;
import com.vmware.vim25.SoftwarePackage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSoftwarePackage", propOrder = {"softwarePackage"})
public class ArrayOfSoftwarePackage {
  @XmlElement(name = "SoftwarePackage")
  protected List<SoftwarePackage> softwarePackage;
  
  public List<SoftwarePackage> getSoftwarePackage() {
    if (this.softwarePackage == null)
      this.softwarePackage = new ArrayList<>(); 
    return this.softwarePackage;
  }
}
