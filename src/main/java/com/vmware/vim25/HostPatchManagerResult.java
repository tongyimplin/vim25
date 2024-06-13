package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPatchManagerResult;
import com.vmware.vim25.HostPatchManagerStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPatchManagerResult", propOrder = {"version", "status", "xmlResult"})
public class HostPatchManagerResult extends DynamicData {
  @XmlElement(required = true)
  protected String version;
  
  protected List<HostPatchManagerStatus> status;
  
  protected String xmlResult;
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public List<HostPatchManagerStatus> getStatus() {
    if (this.status == null)
      this.status = new ArrayList<>(); 
    return this.status;
  }
  
  public String getXmlResult() {
    return this.xmlResult;
  }
  
  public void setXmlResult(String paramString) {
    this.xmlResult = paramString;
  }
}
