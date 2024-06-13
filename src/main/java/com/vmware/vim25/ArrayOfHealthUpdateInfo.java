package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHealthUpdateInfo;
import com.vmware.vim25.HealthUpdateInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHealthUpdateInfo", propOrder = {"healthUpdateInfo"})
public class ArrayOfHealthUpdateInfo {
  @XmlElement(name = "HealthUpdateInfo")
  protected List<HealthUpdateInfo> healthUpdateInfo;
  
  public List<HealthUpdateInfo> getHealthUpdateInfo() {
    if (this.healthUpdateInfo == null)
      this.healthUpdateInfo = new ArrayList<>(); 
    return this.healthUpdateInfo;
  }
}
