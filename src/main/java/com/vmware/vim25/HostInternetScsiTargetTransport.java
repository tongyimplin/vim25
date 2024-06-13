package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiTargetTransport;
import com.vmware.vim25.HostTargetTransport;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiTargetTransport", propOrder = {"iScsiName", "iScsiAlias", "address"})
public class HostInternetScsiTargetTransport extends HostTargetTransport {
  @XmlElement(required = true)
  protected String iScsiName;
  
  @XmlElement(required = true)
  protected String iScsiAlias;
  
  protected List<String> address;
  
  public String getIScsiName() {
    return this.iScsiName;
  }
  
  public void setIScsiName(String paramString) {
    this.iScsiName = paramString;
  }
  
  public String getIScsiAlias() {
    return this.iScsiAlias;
  }
  
  public void setIScsiAlias(String paramString) {
    this.iScsiAlias = paramString;
  }
  
  public List<String> getAddress() {
    if (this.address == null)
      this.address = new ArrayList<>(); 
    return this.address;
  }
}
