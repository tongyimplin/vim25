package com.vmware.vim25;

import com.vmware.vim25.FindByDnsNameRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindByDnsNameRequestType", propOrder = {"_this", "datacenter", "dnsName", "vmSearch"})
public class FindByDnsNameRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference datacenter;
  
  @XmlElement(required = true)
  protected String dnsName;
  
  protected boolean vmSearch;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatacenter() {
    return this.datacenter;
  }
  
  public void setDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.datacenter = paramManagedObjectReference;
  }
  
  public String getDnsName() {
    return this.dnsName;
  }
  
  public void setDnsName(String paramString) {
    this.dnsName = paramString;
  }
  
  public boolean isVmSearch() {
    return this.vmSearch;
  }
  
  public void setVmSearch(boolean paramBoolean) {
    this.vmSearch = paramBoolean;
  }
}
