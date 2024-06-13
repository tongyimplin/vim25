package com.vmware.vim25;

import com.vmware.vim25.DiagnosticManagerBundleInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticManagerBundleInfo", propOrder = {"system", "url"})
public class DiagnosticManagerBundleInfo extends DynamicData {
  protected ManagedObjectReference system;
  
  @XmlElement(required = true)
  protected String url;
  
  public ManagedObjectReference getSystem() {
    return this.system;
  }
  
  public void setSystem(ManagedObjectReference paramManagedObjectReference) {
    this.system = paramManagedObjectReference;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
}
