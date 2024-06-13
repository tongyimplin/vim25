package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNumericSensorInfo;
import com.vmware.vim25.HostSystemHealthInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemHealthInfo", propOrder = {"numericSensorInfo"})
public class HostSystemHealthInfo extends DynamicData {
  protected List<HostNumericSensorInfo> numericSensorInfo;
  
  public List<HostNumericSensorInfo> getNumericSensorInfo() {
    if (this.numericSensorInfo == null)
      this.numericSensorInfo = new ArrayList<>(); 
    return this.numericSensorInfo;
  }
}
