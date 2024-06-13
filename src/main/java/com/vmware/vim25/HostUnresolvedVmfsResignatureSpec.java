package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostUnresolvedVmfsResignatureSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostUnresolvedVmfsResignatureSpec", propOrder = {"extentDevicePath"})
public class HostUnresolvedVmfsResignatureSpec extends DynamicData {
  @XmlElement(required = true)
  protected List<String> extentDevicePath;
  
  public List<String> getExtentDevicePath() {
    if (this.extentDevicePath == null)
      this.extentDevicePath = new ArrayList<>(); 
    return this.extentDevicePath;
  }
}
