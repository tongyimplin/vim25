package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVFlashManagerVFlashResourceConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashResourceConfigSpec", propOrder = {"vffsUuid"})
public class HostVFlashManagerVFlashResourceConfigSpec extends DynamicData {
  @XmlElement(required = true)
  protected String vffsUuid;
  
  public String getVffsUuid() {
    return this.vffsUuid;
  }
  
  public void setVffsUuid(String paramString) {
    this.vffsUuid = paramString;
  }
}
