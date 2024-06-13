package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VVolVmConfigFileUpdateResultFailedVmConfigFileInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VVolVmConfigFileUpdateResultFailedVmConfigFileInfo", propOrder = {"targetConfigVVolId", "dsPath", "fault"})
public class VVolVmConfigFileUpdateResultFailedVmConfigFileInfo extends DynamicData {
  @XmlElement(required = true)
  protected String targetConfigVVolId;
  
  protected String dsPath;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getTargetConfigVVolId() {
    return this.targetConfigVVolId;
  }
  
  public void setTargetConfigVVolId(String paramString) {
    this.targetConfigVVolId = paramString;
  }
  
  public String getDsPath() {
    return this.dsPath;
  }
  
  public void setDsPath(String paramString) {
    this.dsPath = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
