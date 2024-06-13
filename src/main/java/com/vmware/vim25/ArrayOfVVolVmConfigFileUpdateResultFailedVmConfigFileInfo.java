package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVVolVmConfigFileUpdateResultFailedVmConfigFileInfo;
import com.vmware.vim25.VVolVmConfigFileUpdateResultFailedVmConfigFileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVVolVmConfigFileUpdateResultFailedVmConfigFileInfo", propOrder = {"vVolVmConfigFileUpdateResultFailedVmConfigFileInfo"})
public class ArrayOfVVolVmConfigFileUpdateResultFailedVmConfigFileInfo {
  @XmlElement(name = "VVolVmConfigFileUpdateResultFailedVmConfigFileInfo")
  protected List<VVolVmConfigFileUpdateResultFailedVmConfigFileInfo> vVolVmConfigFileUpdateResultFailedVmConfigFileInfo;
  
  public List<VVolVmConfigFileUpdateResultFailedVmConfigFileInfo> getVVolVmConfigFileUpdateResultFailedVmConfigFileInfo() {
    if (this.vVolVmConfigFileUpdateResultFailedVmConfigFileInfo == null)
      this.vVolVmConfigFileUpdateResultFailedVmConfigFileInfo = new ArrayList<>(); 
    return this.vVolVmConfigFileUpdateResultFailedVmConfigFileInfo;
  }
}
