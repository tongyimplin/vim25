package com.vmware.vim25;

import com.vmware.vim25.DatacenterConfigSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterConfigSpec", propOrder = {"defaultHardwareVersionKey"})
public class DatacenterConfigSpec extends DynamicData {
  protected String defaultHardwareVersionKey;
  
  public String getDefaultHardwareVersionKey() {
    return this.defaultHardwareVersionKey;
  }
  
  public void setDefaultHardwareVersionKey(String paramString) {
    this.defaultHardwareVersionKey = paramString;
  }
}
