package com.vmware.vim25;

import com.vmware.vim25.ResourceNotAvailable;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceNotAvailable", propOrder = {"containerType", "containerName", "type"})
public class ResourceNotAvailable extends VimFault {
  protected String containerType;
  
  protected String containerName;
  
  protected String type;
  
  public String getContainerType() {
    return this.containerType;
  }
  
  public void setContainerType(String paramString) {
    this.containerType = paramString;
  }
  
  public String getContainerName() {
    return this.containerName;
  }
  
  public void setContainerName(String paramString) {
    this.containerName = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
}
