package com.vmware.vim25;

import com.vmware.vim25.ArrayOfComputeResourceHostSPBMLicenseInfo;
import com.vmware.vim25.ComputeResourceHostSPBMLicenseInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComputeResourceHostSPBMLicenseInfo", propOrder = {"computeResourceHostSPBMLicenseInfo"})
public class ArrayOfComputeResourceHostSPBMLicenseInfo {
  @XmlElement(name = "ComputeResourceHostSPBMLicenseInfo")
  protected List<ComputeResourceHostSPBMLicenseInfo> computeResourceHostSPBMLicenseInfo;
  
  public List<ComputeResourceHostSPBMLicenseInfo> getComputeResourceHostSPBMLicenseInfo() {
    if (this.computeResourceHostSPBMLicenseInfo == null)
      this.computeResourceHostSPBMLicenseInfo = new ArrayList<>(); 
    return this.computeResourceHostSPBMLicenseInfo;
  }
}
