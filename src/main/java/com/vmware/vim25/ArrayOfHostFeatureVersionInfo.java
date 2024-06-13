package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostFeatureVersionInfo;
import com.vmware.vim25.HostFeatureVersionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostFeatureVersionInfo", propOrder = {"hostFeatureVersionInfo"})
public class ArrayOfHostFeatureVersionInfo {
  @XmlElement(name = "HostFeatureVersionInfo")
  protected List<HostFeatureVersionInfo> hostFeatureVersionInfo;
  
  public List<HostFeatureVersionInfo> getHostFeatureVersionInfo() {
    if (this.hostFeatureVersionInfo == null)
      this.hostFeatureVersionInfo = new ArrayList<>(); 
    return this.hostFeatureVersionInfo;
  }
}
