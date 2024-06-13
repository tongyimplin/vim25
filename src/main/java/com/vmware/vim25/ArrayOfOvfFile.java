package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOvfFile;
import com.vmware.vim25.OvfFile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfFile", propOrder = {"ovfFile"})
public class ArrayOfOvfFile {
  @XmlElement(name = "OvfFile")
  protected List<OvfFile> ovfFile;
  
  public List<OvfFile> getOvfFile() {
    if (this.ovfFile == null)
      this.ovfFile = new ArrayList<>(); 
    return this.ovfFile;
  }
}
