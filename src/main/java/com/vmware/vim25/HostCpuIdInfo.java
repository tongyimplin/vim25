package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostCpuIdInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCpuIdInfo", propOrder = {"level", "vendor", "eax", "ebx", "ecx", "edx"})
public class HostCpuIdInfo extends DynamicData {
  protected int level;
  
  protected String vendor;
  
  protected String eax;
  
  protected String ebx;
  
  protected String ecx;
  
  protected String edx;
  
  public int getLevel() {
    return this.level;
  }
  
  public void setLevel(int paramInt) {
    this.level = paramInt;
  }
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public String getEax() {
    return this.eax;
  }
  
  public void setEax(String paramString) {
    this.eax = paramString;
  }
  
  public String getEbx() {
    return this.ebx;
  }
  
  public void setEbx(String paramString) {
    this.ebx = paramString;
  }
  
  public String getEcx() {
    return this.ecx;
  }
  
  public void setEcx(String paramString) {
    this.ecx = paramString;
  }
  
  public String getEdx() {
    return this.edx;
  }
  
  public void setEdx(String paramString) {
    this.edx = paramString;
  }
}
