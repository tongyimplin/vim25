package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineContentLibraryItemInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineContentLibraryItemInfo", propOrder = {"contentLibraryItemUuid", "contentLibraryItemVersion"})
public class VirtualMachineContentLibraryItemInfo extends DynamicData {
  @XmlElement(required = true)
  protected String contentLibraryItemUuid;
  
  protected String contentLibraryItemVersion;
  
  public String getContentLibraryItemUuid() {
    return this.contentLibraryItemUuid;
  }
  
  public void setContentLibraryItemUuid(String paramString) {
    this.contentLibraryItemUuid = paramString;
  }
  
  public String getContentLibraryItemVersion() {
    return this.contentLibraryItemVersion;
  }
  
  public void setContentLibraryItemVersion(String paramString) {
    this.contentLibraryItemVersion = paramString;
  }
}
