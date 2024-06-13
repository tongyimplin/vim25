package com.vmware.vim25;

import com.vmware.vim25.AboutInfo;
import com.vmware.vim25.DatacenterBasicConnectInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterBasicConnectInfo", propOrder = {"hostname", "error", "serverIp", "numVm", "numPoweredOnVm", "hostProductInfo", "hardwareVendor", "hardwareModel"})
public class DatacenterBasicConnectInfo extends DynamicData {
  protected String hostname;
  
  protected LocalizedMethodFault error;
  
  protected String serverIp;
  
  protected Integer numVm;
  
  protected Integer numPoweredOnVm;
  
  protected AboutInfo hostProductInfo;
  
  protected String hardwareVendor;
  
  protected String hardwareModel;
  
  public String getHostname() {
    return this.hostname;
  }
  
  public void setHostname(String paramString) {
    this.hostname = paramString;
  }
  
  public LocalizedMethodFault getError() {
    return this.error;
  }
  
  public void setError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.error = paramLocalizedMethodFault;
  }
  
  public String getServerIp() {
    return this.serverIp;
  }
  
  public void setServerIp(String paramString) {
    this.serverIp = paramString;
  }
  
  public Integer getNumVm() {
    return this.numVm;
  }
  
  public void setNumVm(Integer paramInteger) {
    this.numVm = paramInteger;
  }
  
  public Integer getNumPoweredOnVm() {
    return this.numPoweredOnVm;
  }
  
  public void setNumPoweredOnVm(Integer paramInteger) {
    this.numPoweredOnVm = paramInteger;
  }
  
  public AboutInfo getHostProductInfo() {
    return this.hostProductInfo;
  }
  
  public void setHostProductInfo(AboutInfo paramAboutInfo) {
    this.hostProductInfo = paramAboutInfo;
  }
  
  public String getHardwareVendor() {
    return this.hardwareVendor;
  }
  
  public void setHardwareVendor(String paramString) {
    this.hardwareVendor = paramString;
  }
  
  public String getHardwareModel() {
    return this.hardwareModel;
  }
  
  public void setHardwareModel(String paramString) {
    this.hardwareModel = paramString;
  }
}
