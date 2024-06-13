package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostUnresolvedVmfsResolutionSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostUnresolvedVmfsResolutionSpec", propOrder = {"extentDevicePath", "uuidResolution"})
public class HostUnresolvedVmfsResolutionSpec extends DynamicData {
  @XmlElement(required = true)
  protected List<String> extentDevicePath;
  
  @XmlElement(required = true)
  protected String uuidResolution;
  
  public List<String> getExtentDevicePath() {
    if (this.extentDevicePath == null)
      this.extentDevicePath = new ArrayList<>(); 
    return this.extentDevicePath;
  }
  
  public String getUuidResolution() {
    return this.uuidResolution;
  }
  
  public void setUuidResolution(String paramString) {
    this.uuidResolution = paramString;
  }
}
