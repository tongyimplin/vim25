package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNumericSensorInfo;
import com.vmware.vim25.HostNumericSensorInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNumericSensorInfo", propOrder = {"hostNumericSensorInfo"})
public class ArrayOfHostNumericSensorInfo {
  @XmlElement(name = "HostNumericSensorInfo")
  protected List<HostNumericSensorInfo> hostNumericSensorInfo;
  
  public List<HostNumericSensorInfo> getHostNumericSensorInfo() {
    if (this.hostNumericSensorInfo == null)
      this.hostNumericSensorInfo = new ArrayList<>(); 
    return this.hostNumericSensorInfo;
  }
}
