package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FolderNewHostSpec;
import com.vmware.vim25.HostConnectSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderNewHostSpec", propOrder = {"hostCnxSpec", "esxLicense"})
public class FolderNewHostSpec extends DynamicData {
  @XmlElement(required = true)
  protected HostConnectSpec hostCnxSpec;
  
  protected String esxLicense;
  
  public HostConnectSpec getHostCnxSpec() {
    return this.hostCnxSpec;
  }
  
  public void setHostCnxSpec(HostConnectSpec paramHostConnectSpec) {
    this.hostCnxSpec = paramHostConnectSpec;
  }
  
  public String getEsxLicense() {
    return this.esxLicense;
  }
  
  public void setEsxLicense(String paramString) {
    this.esxLicense = paramString;
  }
}
