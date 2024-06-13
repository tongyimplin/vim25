package com.vmware.vim25;

import com.vmware.vim25.VslmCreateSpecBackingSpec;
import com.vmware.vim25.VslmCreateSpecRawDiskMappingBackingSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmCreateSpecRawDiskMappingBackingSpec", propOrder = {"lunUuid", "compatibilityMode"})
public class VslmCreateSpecRawDiskMappingBackingSpec extends VslmCreateSpecBackingSpec {
  @XmlElement(required = true)
  protected String lunUuid;
  
  @XmlElement(required = true)
  protected String compatibilityMode;
  
  public String getLunUuid() {
    return this.lunUuid;
  }
  
  public void setLunUuid(String paramString) {
    this.lunUuid = paramString;
  }
  
  public String getCompatibilityMode() {
    return this.compatibilityMode;
  }
  
  public void setCompatibilityMode(String paramString) {
    this.compatibilityMode = paramString;
  }
}
