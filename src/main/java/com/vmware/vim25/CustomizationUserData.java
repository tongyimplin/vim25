package com.vmware.vim25;

import com.vmware.vim25.CustomizationName;
import com.vmware.vim25.CustomizationUserData;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationUserData", propOrder = {"fullName", "orgName", "computerName", "productId"})
public class CustomizationUserData extends DynamicData {
  @XmlElement(required = true)
  protected String fullName;
  
  @XmlElement(required = true)
  protected String orgName;
  
  @XmlElement(required = true)
  protected CustomizationName computerName;
  
  @XmlElement(required = true)
  protected String productId;
  
  public String getFullName() {
    return this.fullName;
  }
  
  public void setFullName(String paramString) {
    this.fullName = paramString;
  }
  
  public String getOrgName() {
    return this.orgName;
  }
  
  public void setOrgName(String paramString) {
    this.orgName = paramString;
  }
  
  public CustomizationName getComputerName() {
    return this.computerName;
  }
  
  public void setComputerName(CustomizationName paramCustomizationName) {
    this.computerName = paramCustomizationName;
  }
  
  public String getProductId() {
    return this.productId;
  }
  
  public void setProductId(String paramString) {
    this.productId = paramString;
  }
}
