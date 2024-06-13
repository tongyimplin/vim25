package com.vmware.vim25;

import com.vmware.vim25.AddFilterRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFilterRequestType", propOrder = {"_this", "providerId", "filterName", "infoIds"})
public class AddFilterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String providerId;
  
  @XmlElement(required = true)
  protected String filterName;
  
  protected List<String> infoIds;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getProviderId() {
    return this.providerId;
  }
  
  public void setProviderId(String paramString) {
    this.providerId = paramString;
  }
  
  public String getFilterName() {
    return this.filterName;
  }
  
  public void setFilterName(String paramString) {
    this.filterName = paramString;
  }
  
  public List<String> getInfoIds() {
    if (this.infoIds == null)
      this.infoIds = new ArrayList<>(); 
    return this.infoIds;
  }
}
