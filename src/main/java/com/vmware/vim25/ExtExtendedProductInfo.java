package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtExtendedProductInfo;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtExtendedProductInfo", propOrder = {"companyUrl", "productUrl", "managementUrl", "self"})
public class ExtExtendedProductInfo extends DynamicData {
  protected String companyUrl;
  
  protected String productUrl;
  
  protected String managementUrl;
  
  protected ManagedObjectReference self;
  
  public String getCompanyUrl() {
    return this.companyUrl;
  }
  
  public void setCompanyUrl(String paramString) {
    this.companyUrl = paramString;
  }
  
  public String getProductUrl() {
    return this.productUrl;
  }
  
  public void setProductUrl(String paramString) {
    this.productUrl = paramString;
  }
  
  public String getManagementUrl() {
    return this.managementUrl;
  }
  
  public void setManagementUrl(String paramString) {
    this.managementUrl = paramString;
  }
  
  public ManagedObjectReference getSelf() {
    return this.self;
  }
  
  public void setSelf(ManagedObjectReference paramManagedObjectReference) {
    this.self = paramManagedObjectReference;
  }
}
