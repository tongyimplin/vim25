package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVAppOvfSectionInfo;
import com.vmware.vim25.VAppOvfSectionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppOvfSectionInfo", propOrder = {"vAppOvfSectionInfo"})
public class ArrayOfVAppOvfSectionInfo {
  @XmlElement(name = "VAppOvfSectionInfo")
  protected List<VAppOvfSectionInfo> vAppOvfSectionInfo;
  
  public List<VAppOvfSectionInfo> getVAppOvfSectionInfo() {
    if (this.vAppOvfSectionInfo == null)
      this.vAppOvfSectionInfo = new ArrayList<>(); 
    return this.vAppOvfSectionInfo;
  }
}
